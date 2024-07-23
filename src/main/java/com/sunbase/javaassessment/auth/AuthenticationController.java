package com.sunbase.javaassessment.auth;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sunbase.javaassessment.dto.UserDto;
import com.sunbase.javaassessment.entity.User;
import com.sunbase.javaassessment.service.UserService;
import com.sunbase.javaassessment.service.*;


@CrossOrigin
@Controller
@RequestMapping("/")
public class AuthenticationController {

    @Autowired
    private UserService userService;

    @Autowired
    private AuthenticationService authenticationService;

    @GetMapping("/")
    public String signup(@ModelAttribute("authenticationRequest") AuthenticationRequest authenticationRequest) {
        return "index";
    }

    @GetMapping("/signup")
    public String login(@ModelAttribute("user") User user) {
        return "signup";
    }


//    @GetMapping("/update")
//    public ModelAndView update(@ModelAttribute("userDto") UserDto userDto, @RequestParam("id") Integer id){
//         User user = userService.getUser(id);
//        System.out.println(user);
//        ModelAndView mav=new ModelAndView();
//        mav.addObject("userDto", user);
//        mav.setViewName("update");
//        return mav;
//    }

    @ResponseBody
    @PostMapping("/register")
    public ModelAndView register(@ModelAttribute("user") User user){
        userService.saveUser(user);
        ModelAndView mav=new ModelAndView();
        mav.setViewName("redirect:/api/auth/login");
        return mav;
    }


    @PostMapping("/authenticate")
    public ModelAndView authenticate(@ModelAttribute("authenticationRequest") AuthenticationRequest authenticationRequest){
        authenticationService.authenticate(authenticationRequest);
        ModelAndView mav = new ModelAndView();
        List<User> userList = new ArrayList<User>();
        userList= userService.getAllUsers();
        System.out.println(userList);
        mav.addObject("users", userList);
        mav.setViewName("list-users");
        return mav;
    }


    @GetMapping("/checktoken")
    public ResponseEntity<String> checkToken(){
        try {
            return userService.checkToken();
        }catch(Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>("something went wrong", HttpStatus.INTERNAL_SERVER_ERROR);
    }

 //   @PostMapping("/updateuser/{id}")

//    public void updateUser(@ModelAttribute("userDto") User userDto , @PathVariable int id){
//
//        userService.updateUser(userDto, id);
//
//    }
}
