package cn.lxm.dialingrobotcore.domain.dto.qry;

public class BaseQry {

    private String logID;

    public String getLogID() {
        return logID;
    }

    public void setLogID(String logID) {
        this.logID = logID;
    }

    public BaseQry(String logID) {
        this.logID = logID;
    }

}
