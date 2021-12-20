package com.spring.auto.inside;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class H {

	class J {
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(H.class);
		context.register(J.class);
		context.refresh();
		System.out.println(context.getBean(J.class));
	}
}
