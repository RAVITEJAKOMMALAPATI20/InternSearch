/**
 * 
 */
package com.internsearchapi.vo;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author ravitejakommalapati
 *
 */
@Entity
public class Link {
@Id
private String companyName;
private String url;

public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
@Override
public String toString() {
	return "Link [companyName=" + companyName + ", url=" + url + "]";
}
}
