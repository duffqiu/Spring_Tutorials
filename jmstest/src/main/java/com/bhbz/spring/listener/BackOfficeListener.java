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
//@Transactional
public class BackOfficeListener {
    private int count = 0;
    private long start = 0;
    private boolean isStart = false;

    //make sure it is thread safe if configure it with multi-thread handling
    synchronized public void displayMail(Mail mail) {
	//	System.out.println("listen a mail: " + mail);
	if (!isStart) {
	    start = System.currentTimeMillis();
	    isStart = true;
	}
	count = count + 1;
	System.currentTimeMillis();

	if (count % 1000 == 0) {
	    long stop = System.currentTimeMillis();
	    System.out.println("id: " + count + " duration: " + (stop - start));
	    start = stop;
	}

    }
}
