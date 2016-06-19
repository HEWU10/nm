package com.nm.commons.util;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by hewu on 2016/6/18 0018.
 * UUID工具类
 */
public class UUIDGenerate implements IdentifierGenerator {

    public Serializable generate(SessionImplementor sessionImplementor, Object o) throws HibernateException {
        return generate();
    }

    /**
     * 去除UUID中间的横杠
     * @return
     */
    public static String generate(){
        return UUID.randomUUID().toString().replace("-","");
    }

}
