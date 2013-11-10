/**
 * 
 */
package com.bhbz.spring.common;

import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.support.converter.MessageConversionException;
import org.springframework.jms.support.converter.MessageConverter;

/**
 * @author macbook
 * 
 *         2013年11月7日
 */
public class MailMessageConverter implements MessageConverter {

    /* (non-Javadoc)
     * @see org.springframework.jms.support.converter.MessageConverter#toMessage(java.lang.Object, javax.jms.Session)
     */
    @Override
    public Message toMessage(Object object, Session session)
	    throws JMSException, MessageConversionException {

	if (object instanceof Mail) {

	    Mail mail = (Mail) object;
	    MapMessage message = session.createMapMessage();
	    message.setString("mailId", mail.getMailId());
	    message.setString("country", mail.getCountry());
	    message.setDouble("weight", mail.getWeight());
	    //	    System.out.println("Get a message need to put in queue: " + mail);
	    return message;
	}

	return null;
    }

    /* (non-Javadoc)
     * @see org.springframework.jms.support.converter.MessageConverter#fromMessage(javax.jms.Message)
     */
    @Override
    public Object fromMessage(Message message) throws JMSException,
	    MessageConversionException {

	if (message instanceof MapMessage) {

	    MapMessage mapMessage = (MapMessage) message;

	    Mail mail = new Mail(mapMessage.getString("mailId"),
		    mapMessage.getString("country"),
		    mapMessage.getDouble("weight"));
	    //	    System.out.println("Get a message from queue: " + mail);
	    return mail;
	}

	return null;
    }
}
