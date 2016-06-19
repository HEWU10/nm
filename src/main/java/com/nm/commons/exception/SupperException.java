package com.nm.commons.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by hewu on 2016/6/19 0019.
 */
public class SupperException extends Exception{
    private Logger LOG = LoggerFactory.getLogger(SupperException.class);

    public SupperException(Throwable cause){
        super(cause);
    }

}
