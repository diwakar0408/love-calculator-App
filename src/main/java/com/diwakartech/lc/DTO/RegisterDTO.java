package com.diwakartech.lc.DTO;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;

import com.diwakartech.lc.Validators.Age;

public class RegisterDTO {
	@NotBlank(message = "enter name must not blank")
	private String youName="diwakar";
	private String loveName;
	private String username = "abc2004";
	private String password = "";
	private String country;
	private List<String> hobby = new ArrayList<>();
	private CommunicationDTO cdto;
	private PhoneDTO pdto;
	private String gender;
	@Age(lower = 10,upper = 50)
	private Integer age;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getHobby() {
		return hobby;
	}

	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getYouName() {
		return youName;
	}

	public void setYouName(String youName) {

		this.youName = youName;
	}

	public String getLoveName() {
		return loveName;
	}

	public void setLoveName(String loveName) {
		this.loveName = loveName;
	}

	public CommunicationDTO getCdto() {
		return cdto;
	}

	public void setCdto(CommunicationDTO cdto) {
		this.cdto = cdto;
	}

	public PhoneDTO getPdto() {
		return pdto;
	}

	public void setPdto(PhoneDTO pdto) {
		this.pdto = pdto;
	}

	

}
