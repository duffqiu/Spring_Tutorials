/**
 * 
 */
package com.bhbz.spring.jmstest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author macbook
 * 
 *         2013年11月7日
 */
public class AppListener {

    private static ApplicationContext context;

    public static void main(String[] args) {
	context = new ClassPathXmlApplicationContext("listen.xml");

    }

}
