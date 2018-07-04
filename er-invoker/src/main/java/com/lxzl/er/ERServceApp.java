package com.lxzl.er;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ERServceApp {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		String profiles = new Scanner(System.in).nextLine();
		
		new SpringApplicationBuilder(ERServceApp.class).profiles(profiles).run(args);
	}
}
