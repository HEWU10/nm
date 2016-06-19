package com.nm.commons.exception;

/**
 * Created by hewu on 2016/6/19 0019.
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface InstallExceptionHandler {

    public Class<? extends ExceptionHandler>value() ;

}
