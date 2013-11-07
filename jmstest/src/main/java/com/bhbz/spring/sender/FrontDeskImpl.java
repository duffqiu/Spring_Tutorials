/**
 * 
 */
package com.bhbz.spring.sender;

import org.springframework.jms.core.support.JmsGatewaySupport;
import org.springframework.transaction.annotation.Transactional;

import com.bhbz.spring.common.FrontDesk;
import com.bhbz.spring.common.Mail;

/**
 * @author macbook
 * 
 *         2013年11月7日
 */
public class FrontDeskImpl extends JmsGatewaySupport implements FrontDesk {

    /* (non-Javadoc)
     * @see com.bhbz.spring.common.FrontDesk#sendMessage(com.bhbz.spring.common.Mail)
     */
    @Override
    @Transactional
    public void sendMessage(Mail mail) {
	/*	Map<String, Object> map = new HashMap<>();
		map.put("mailId", mail.getMailId());
		map.put("country", mail.getCountry());
		map.put("weight", mail.getWeight());*/

	this.getJmsTemplate().convertAndSend(mail);

    }

}
