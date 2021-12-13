package com.cmeizu.bean;

import org.springframework.stereotype.Component;

/**
 * @author: cmeizu
 * @date: 2021/11/15 13:45
 */
@Component
public class HelloBean {
	private String name;

	public HelloBean() {
		System.out.println("注入Bean");
	}

	public void sayHello(String str) {
		System.out.println("str = " + str);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
