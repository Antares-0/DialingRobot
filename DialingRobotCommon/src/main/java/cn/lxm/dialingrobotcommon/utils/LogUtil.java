package cn.lxm.dialingrobotcommon.utils;

import java.util.UUID;

public class LogUtil {

    public static String getLogID() {
        return UUID.randomUUID().toString();
    }

}
