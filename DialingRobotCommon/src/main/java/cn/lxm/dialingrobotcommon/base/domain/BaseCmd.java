package cn.lxm.dialingrobotcommon.base.domain;

public class BaseCmd {

    private String logID;

    public String getLogID() {
        return logID;
    }

    public void setLogID(String logID) {
        this.logID = logID;
    }

    public BaseCmd(String logID) {
        this.logID = logID;
    }
}
