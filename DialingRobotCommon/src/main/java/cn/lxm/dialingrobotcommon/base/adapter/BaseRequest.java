package cn.lxm.dialingrobotcommon.base.adapter;

import java.io.Serial;
import java.io.Serializable;

public class BaseRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String logID;

    public String getLogID() {
        return logID;
    }

    public void setLogID(String logID) {
        this.logID = logID;
    }
}
