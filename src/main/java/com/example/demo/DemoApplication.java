package com.example.demo;

import com.example.cx3.StudentCfg;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(DemoApplication.class, args);

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(UserConfig.class);
		User user = ctx.getBean(User.class);
		showUser(user);

		ctx = new AnnotationConfigApplicationContext(UserConfigx.class);
		user = ctx.getBean(User.class);
		showUser(user);

		ctx = new AnnotationConfigApplicationContext(UserConfigWyb.class);
		user = ctx.getBean(User.class);
		showUser(user);

		ctx = new AnnotationConfigApplicationContext(StudentCfg.class);
		StudentCfg student = ctx.getBean(StudentCfg.class);
		System.out.println(student.getStudent().getName());

		}

		static private void showUser(User user){
			System.out.println(user);
			System.out.println(user.getName());
		}
	}
