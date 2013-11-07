/**
 * 
 */
package com.bhbz.spring.jmstest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhbz.spring.common.FrontDesk;
import com.bhbz.spring.common.Mail;

/**
 * @author macbook
 * 
 *         2013年11月7日
 */
public class AppProducer {
    private static ApplicationContext context;

    public static void main(String[] args) {
	context = new ClassPathXmlApplicationContext("bean.xml");

	FrontDesk frontDesk = (FrontDesk) context.getBean("frontDesk");

	frontDesk.sendMessage(new Mail("mailid:Xx", "China", 1000.5));

    }
}
