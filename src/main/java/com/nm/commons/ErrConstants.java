package com.nm.commons;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hewu on 2016/6/19 0019.
 */
public class ErrConstants {
    public static int INTERNAL_ERROR = 1001;


    private static Map<Integer, String> errMsgMap = null;


    static {
        errMsgMap = new HashMap<Integer, String>();

        initServerErrMap();
    }

    private static void initServerErrMap() {
        errMsgMap.put(INTERNAL_ERROR, "内部服务错误");
    }


    public static String getMsg(Integer errCode) {
        return errCode == 0 ? "" : errMsgMap.get(errCode);
    }


}
