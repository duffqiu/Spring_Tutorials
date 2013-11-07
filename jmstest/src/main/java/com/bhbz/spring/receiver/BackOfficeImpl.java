/**
 * 
 */
package com.bhbz.spring.receiver;

import org.springframework.jms.core.support.JmsGatewaySupport;
import org.springframework.transaction.annotation.Transactional;

import com.bhbz.spring.common.BackOffice;
import com.bhbz.spring.common.Mail;

/**
 * @author macbook
 * 
 *         2013年11月7日
 */
public class BackOfficeImpl extends JmsGatewaySupport implements BackOffice {

    /* (non-Javadoc)
     * @see com.bhbz.spring.common.BackOffice#receiveMail(com.bhbz.spring.common.Mail)
     */
    @Override
    @Transactional
    public Mail receiveMail() {
	return (Mail) this.getJmsTemplate().receiveAndConvert();

    }

}
