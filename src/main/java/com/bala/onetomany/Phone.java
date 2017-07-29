package com.bala.onetomany;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany; 
import javax.persistence.JoinTable;

@Entity
@Table(name = "phone")
public class Phone {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private long phoneId;
	
	@Column(name = "type", nullable = false, length=10)
	private String phoneType;
	
	@Column(name = "number", nullable = false, length=15)
	private String phoneNumber;
	
	

	public Phone() {
	}

	public Phone(String phoneType, String phoneNumber) {
		this.phoneType = phoneType;
		this.phoneNumber = phoneNumber;
	}
	

	public long getPhoneId() {
		return this.phoneId;
	}

	public void setPhoneId(long phoneId) {
		this.phoneId = phoneId;
	}


	public String getPhoneType() {
		return this.phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}
	

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
 
}
