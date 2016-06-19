package com.nm.commons.exception;

import org.omg.CORBA.OBJ_ADAPTER;
import org.omg.CORBA.Object;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by hewu on 2016/6/19 0019.
 */
public abstract class ExceptionHandler {

    private Logger LOG = LoggerFactory.getLogger(ExceptionHandler.class);


    private Object handlerException(SupperException e) throws SupperException{
        LOG.error("occur exception e", e.getMessage());

        throw e;
    }

//    private Object
}
