package cn.lxm.dialingrobotcommon.base.adapter;

import java.io.Serial;
import java.io.Serializable;

public class BaseResponse<T> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String logID;

    private String errorMessage;

    private Integer errorCode;

    private T data;

    public String getLogID() {
        return logID;
    }

    public void setLogID(String logID) {
        this.logID = logID;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
