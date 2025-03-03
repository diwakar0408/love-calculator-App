package com.diwakartech.lc.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class LoveDTO {
	@NotBlank(message = "Name must be entered")
	@Size(max = 50,min = 3, message = "Name must be less than 50 characters") // Example size validation
	private String youName;

	@NotBlank(message = "Love name must be entered")
	@Size(max = 50,min = 3, message = "Love name must be less than 50 characters") // Example size validation
	private String loveName;

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

}
