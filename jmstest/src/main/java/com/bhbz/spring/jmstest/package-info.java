/**
 * 
 */
/**
 * @author macbook
 *
 * 2013年11月7日
 */
package com.bhbz.spring.jmstest;

/**

Test result(with pool):

1. with persistence 

1) Spring:
producer: 30.6s for 10k message
consumer: 143s  for 10k message
listener: 8.9xs for 1k message

2) ActiveMQ:
producer: 3s for 10k message
consumer: 253s  for 10k message
listener: 8.9xs for 1k message


1. no persistence 

1) Spring:
producer: 3s for 10k message
consumer: 2s  for 10k message
listener: 0.3xs for 1k message

2) ActiveMQ:
producer: 3s for 10k message
consumer: 173s  for 10k message
listener: 0.3xs for 1k message

*/


/*

Conclusion:
1. don't use activemq for consumer since no pool for consumer
2. Using listener to receive message
3. Using activemq for producer faster than spring
 

 */