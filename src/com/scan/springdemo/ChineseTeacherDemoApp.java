package com.scan.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ChineseTeacherDemoApp {
	public static void main(String[]args) {
	//read java config file
	AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(MonthlySalary.class);
//	Teacher s1 = context.getBean("xxx", Teacher.class);
	
	Teacher theChinese = context.getBean("chineseTeacher", Teacher.class);
	System.out.println(theChinese);
//	System.out.println(s1.getTutoring());
//	System.out.println(s1.getTutoring());
	System.out.println(theChinese.getTutoring());
//	
	context.close();
	}
}
