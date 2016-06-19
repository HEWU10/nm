package com.nm.util;

import java.util.UUID;

/**
 * Created by hewu on 2016/6/18 0018.
 * UUID工具类
 */
public class UUIDUtil {

    /**
     * 去除UUID中间的横杠
     * @return
     */
    public static String generate(){
        return UUID.randomUUID().toString().replace("-","");
    }

}
