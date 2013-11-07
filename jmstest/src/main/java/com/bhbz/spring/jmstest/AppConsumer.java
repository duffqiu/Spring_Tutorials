/**
 * 
 */
package com.bhbz.spring.jmstest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhbz.spring.common.BackOffice;
import com.bhbz.spring.common.Mail;

/**
 * @author macbook
 * 
 *         2013年11月7日
 */
public class AppConsumer {
    private static ApplicationContext context;

    /**
     * @param args
     *            macbook 2013年11月7日
     */
    public static void main(String[] args) {

	context = new ClassPathXmlApplicationContext("bean.xml");

	BackOffice backOffice = (BackOffice) context.getBean("backOffice");

	Mail mail = backOffice.receiveMail();
	System.out.println("Receive: " + mail);

    }

}
