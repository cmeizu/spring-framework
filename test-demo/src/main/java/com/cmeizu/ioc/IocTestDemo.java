package com.cmeizu.ioc;

import com.cmeizu.bean.HelloBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: cmeizu
 * @date: 2021/11/15 14:03
 */
@ComponentScan(basePackages = {"com.cmeizu.bean"})
@Configuration
public class IocTestDemo {
	public static void main(String[] args) {
		//启动ioc容器
		ApplicationContext context = new AnnotationConfigApplicationContext(IocTestDemo.class);

		HelloBean bean = context.getBean(HelloBean.class);
		bean.sayHello("hello spring");
	}
}
