package com.marriageonmind.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MobileNo implements Serializable{
@Id	
private String mobileNo;
private boolean verified;
private boolean whatsAppNo;
private boolean thisFBID;
public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
public boolean isVerified() {
	return verified;
}
public void setVerified(boolean verified) {
	this.verified = verified;
}
public boolean isWhatsAppNo() {
	return whatsAppNo;
}
public void setWhatsAppNo(boolean whatsAppNo) {
	this.whatsAppNo = whatsAppNo;
}
public boolean isThisFBID() {
	return thisFBID;
}
public void setThisFBID(boolean thisFBID) {
	this.thisFBID = thisFBID;
}


}
