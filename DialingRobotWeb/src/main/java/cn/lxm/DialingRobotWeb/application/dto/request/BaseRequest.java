package cn.lxm.DialingRobotWeb.application.dto.request;

import java.io.Serial;
import java.io.Serializable;

public abstract class BaseRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String logId;

    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

}