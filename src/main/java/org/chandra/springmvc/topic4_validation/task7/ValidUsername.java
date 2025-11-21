package org.chandra.springmvc.topic4_validation.task7;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidUsernameValidator.class)
public @interface ValidUsername {

    String message() default "Username must contain at least one digit";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
