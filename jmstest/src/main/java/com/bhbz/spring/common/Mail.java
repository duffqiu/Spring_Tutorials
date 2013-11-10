/**
 * 
 */
package com.bhbz.spring.common;

/**
 * @author macbook
 * 
 *         2013年11月7日
 */
public class Mail {
    private String mailId;
    private String country;
    private double weight;

    /**
     * @param mailId
     * @param country
     * @param weight
     */
    public Mail(String mailId, String country, double weight) {
	super();
	this.mailId = mailId;
	this.country = country;
	this.weight = weight;
    }

    /**
     * @return the mailId
     */
    public String getMailId() {
	return mailId;
    }

    /**
     * @param mailId
     *            the mailId to set
     */
    public void setMailId(String mailId) {
	this.mailId = mailId;
    }

    /**
     * @return the country
     */
    public String getCountry() {
	return country;
    }

    /**
     * @param country
     *            the country to set
     */
    public void setCountry(String country) {
	this.country = country;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
	return weight;
    }

    /**
     * @param weight
     *            the weight to set
     */
    public void setWeight(double weight) {
	this.weight = weight;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Mail [mailId=" + mailId + ", country=" + country + ", weight="
		+ weight + "]";
    }

}
