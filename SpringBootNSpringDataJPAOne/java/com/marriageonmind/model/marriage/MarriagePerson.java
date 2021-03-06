package com.marriageonmind.model.marriage;

import java.io.Serializable;
import java.net.URL;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.marriageonmind.model.Address;
import com.marriageonmind.model.Email;
import com.marriageonmind.model.LandLineNo;
import com.marriageonmind.model.MobileNo;

@Entity
public class MarriagePerson implements Serializable{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String firstName;
	private String middleName;
	private String lastName;
	private int heightFeet; //apply  constraint
	private int heightInch; //apply constraint
	private int heightInCm;
	
	@Enumerated(EnumType.STRING)
	private MarriagePersonType marriagePersonType;



	@ManyToOne
	private Father father;
	@ManyToOne
	private Mother mother;

	private String alsoQualifiedIn;
	
	@OneToOne
	private Relative relative;

	@Enumerated(EnumType.STRING)
	private Complexion complexion;
	
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth; //apply constraint //verify through adharid
	
	private String birthTime;
		
	
	public Relative getRelative() {
		return relative;
	}
	public void setRelative(Relative relative) {
		this.relative = relative;
	}
	public String getBirthTime() {
		return birthTime;
	}
	public void setBirthTime(String birthTime) {
		this.birthTime = birthTime;
	}
	
	@OneToMany
	private Collection<MobileNo> mobileNos;// apply constraint
	
	@OneToOne
	private LandLineNo landLineNumber;
	
	@OneToOne
	private Email emailId;//only one emailID
	
	@OneToMany
	private Collection<String> photo;//
	
	
	private String video;//youtube Video URL
	
	private String AdharID;//apply constraint
	
	@Enumerated(EnumType.STRING)
	private ManglikStatus manglikStatus;
	
	@Enumerated(EnumType.STRING)
	private MaritalStatus maritalStatus;

	@OneToOne
	private EmployeeMarriagePerson job;

	@OneToMany(mappedBy="marriagePerson")
	private Collection<Brother> brothers;

	@OneToMany(mappedBy="marriagePerson")
	private Collection<Sister> sisters;
	
	@OneToMany
	private Collection<Address> address;
	

	public MarriagePersonType getMarriagePersonType() {
		return marriagePersonType;
	}
	public void setMarriagePersonType(MarriagePersonType marriagePersonType) {
		this.marriagePersonType = marriagePersonType;
	}

	public Collection<MobileNo> getMobileNos() {
		return mobileNos;
	}
	public void setMobileNos(Collection<MobileNo> mobileNos) {
		this.mobileNos = mobileNos;
	}
	
	public Collection<Brother> getBrothers() {
		return brothers;
	}
	public void setBrothers(Collection<Brother> brothers) {
		this.brothers = brothers;
	}
	public Collection<Sister> getSisters() {
		return sisters;
	}
	public void setSisters(Collection<Sister> sisters) {
		this.sisters = sisters;
	}
	public Collection<Address> getAddress() {
		return address;
	}
	public void setAddress(Collection<Address> address) {
		this.address = address;
	}

	
	
public String getMiddleName() {
	return middleName;
}
public void setMiddleName(String middleName) {
	this.middleName = middleName;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getHeightFeet() {
	return heightFeet;
}
public void setHeightFeet(int heightFeet) {
	this.heightFeet = heightFeet;
}
public int getHeightInch() {
	return heightInch;
}
public void setHeightInch(int heightInch) {
	this.heightInch = heightInch;
}
public int getHeightInCm() {
	return heightInCm;
}
public void setHeightInCm(int heightInCm) {
	this.heightInCm = heightInCm;
}

public Father getFather() {
	return father;
}
public void setFather(Father father) {
	this.father = father;
}
public Mother getMother() {
	return mother;
}
public void setMother(Mother mother) {
	this.mother = mother;
}
public String getAlsoQualifiedIn() {
	return alsoQualifiedIn;
}
public void setAlsoQualifiedIn(String alsoQualifiedIn) {
	this.alsoQualifiedIn = alsoQualifiedIn;
}

public Complexion getComplexion() {
	return complexion;
}
public void setComplexion(Complexion complexion) {
	this.complexion = complexion;
}
public Date getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}

public LandLineNo getLandLineNumber() {
	return landLineNumber;
}
public void setLandLineNumber(LandLineNo landLineNumber) {
	this.landLineNumber = landLineNumber;
}

public Email getEmailId() {
	return emailId;
}
public void setEmailId(Email emailId) {
	this.emailId = emailId;
}

public String getVideo() {
	return video;
}
public void setVideo(String video) {
	this.video = video;
}
public String getAdharID() {
	return AdharID;
}
public void setAdharID(String adharID) {
	AdharID = adharID;
}
public ManglikStatus getManglikStatus() {
	return manglikStatus;
}
public void setManglikStatus(ManglikStatus manglikStatus) {
	this.manglikStatus = manglikStatus;
}
public MaritalStatus getMaritalStatus() {
	return maritalStatus;
}
public void setMaritalStatus(MaritalStatus maritalStatus) {
	this.maritalStatus = maritalStatus;
}
public EmployeeMarriagePerson getJob() {
	return job;
}
public void setJob(EmployeeMarriagePerson job) {
	this.job = job;
}


}
