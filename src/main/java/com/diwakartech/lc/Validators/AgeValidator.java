package com.diwakartech.lc.Validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer>{
	private Integer lower;
	private Integer upper;
	@Override
	public void initialize(Age age) {
		
		lower = age.lower();
		upper = age.upper();
		System.out.println(lower+" "+upper);
		
	}

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		if(value==null) {
			return false;
		}
		if(lower>value || value>upper) {
			return false;
			
		}
		return true;
	}

}
