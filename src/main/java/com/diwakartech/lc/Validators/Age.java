package com.diwakartech.lc.Validators;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = { AgeValidator.class })
public @interface Age {
	int lower() default 10;

	int upper() default 30;

	String message() default "{age.error.message}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
