package com.bl.regularexpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserrRegistration {
	
	public static void main(String[] args) {
		UserRegistration reg = new UserRegistration();
		
		String name1 = "Azhar";
		String name2= "SimRan";
		
		System.out.println("Name1 : " +reg.validateName(name1));
		System.out.println("Name2 : " +reg.validateName(name2));
	}
	public String validateName(String name) {
		if (name == null || name.isEmpty()) {
			return "Invalid";
		}
		
		String nameRegex = "^[A-Z]{1}[a-z]{2,}$";
				
			Pattern pattern = Pattern.compile(nameRegex);
			if(pattern.matcher(name).matches()) {
				return "Valid";
			}else {
				return "Invalid";
			}
	}	
}
