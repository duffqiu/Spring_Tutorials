/**
 * 
 */
package com.bhbz.spring.listener;

import com.bhbz.spring.common.Mail;

/**
 * @author macbook
 * 
 *         2013年11月7日
 */
public class BackOfficeListener {

    public void displayMail(Mail mail) {
	System.out.println("listen a mail: " + mail);
    }

}
