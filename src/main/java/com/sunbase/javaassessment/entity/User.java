package com.sunbase.javaassessment.entity;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name= "user")
public class User implements UserDetails{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
    private String street;
    private String city;
    private String state;
    private String country;
    @Enumerated(EnumType.STRING)
    private Role role;
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return role.getGrantedAuthorities() ;
	}
	@Override
	public String getPassword() {
		
		return password;
	}
	@Override
	public String getUsername() {
	
		return email;
	}
    
    
}
