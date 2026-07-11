package cn.lxm.dialingrobotcommon.base.domain;

public class BaseResp {

    private String logID;

    private String ErrorMessage;

    private Integer ErrorCode;

    public String getLogID() {
        return logID;
    }

    public void setLogID(String logID) {
        this.logID = logID;
    }

    public String getErrorMessage() {
        return ErrorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        ErrorMessage = errorMessage;
    }

    public Integer getErrorCode() {
        return ErrorCode;
    }

    public void setErrorCode(Integer errorCode) {
        ErrorCode = errorCode;
    }

}
