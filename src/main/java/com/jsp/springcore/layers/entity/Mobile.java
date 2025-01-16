package com.jsp.springcore.layers.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Mobile {

	@Id
	private int mobileId;
	private String mobileBrand;
	private String mobileModel;
	private int mobilePrice;
	
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getMobileBrand() {
		return mobileBrand;
	}
	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}
	public String getMobileModel() {
		return mobileModel;
	}
	public void setMobileModel(String mobileModel) {
		this.mobileModel = mobileModel;
	}
	public int getMobilePrice() {
		return mobilePrice;
	}
	public void setMobilePrice(int mobilePrice) {
		this.mobilePrice = mobilePrice;
	}
	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", mobileBrand=" + mobileBrand + ", mobileModel=" + mobileModel
				+ ", mobilePrice=" + mobilePrice + "]";
	}
	
	
	
	

}
