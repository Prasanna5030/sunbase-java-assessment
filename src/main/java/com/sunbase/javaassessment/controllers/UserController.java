package com.sunbase.javaassessment.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sunbase.javaassessment.entity.User;
import com.sunbase.javaassessment.service.UserService;



@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ModelAndView getAllUsers() {
    	ModelAndView mav= new ModelAndView();
    	List<User> userList= userService.getAllUsers();
    	mav.addObject("users", userList);
    	mav.setViewName("list-users");
        return mav;
    }

    @GetMapping("/new")
    public ModelAndView showNewUserForm() {
    	ModelAndView mav= new ModelAndView();
        mav.addObject("user", new User());
        mav.setViewName("new-user");
        return mav;
    }

    @PostMapping
    public String saveUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/users";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditUserForm(@PathVariable("id") Integer id) {
    	ModelAndView mav= new ModelAndView();
        mav.addObject("user", userService.getUserById(id));
        mav.setViewName("edit-user");
        return mav;
    }

    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable("id") Integer id, @ModelAttribute
    		("user") User user) {
        user.setId(id);
        userService.updateUser(user);
       
        return "redirect:/users";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Integer id) {
        userService.deleteUser(id);
        return "redirect:/users";
    }
}
