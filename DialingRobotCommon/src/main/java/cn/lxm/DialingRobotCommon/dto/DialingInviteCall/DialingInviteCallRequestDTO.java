package cn.lxm.DialingRobotCommon.dto.DialingInviteCall;


import cn.lxm.DialingRobotCommon.base.BaseRequest;

public class DialingInviteCallRequestDTO extends BaseRequest {

    private String callID;

    private String fromTag;

    private String toTag;

    public String getCallID() {
        return callID;
    }

    public void setCallID(String callID) {
        this.callID = callID;
    }

    public String getFromTag() {
        return fromTag;
    }

    public void setFromTag(String fromTag) {
        this.fromTag = fromTag;
    }

    public String getToTag() {
        return toTag;
    }

    public void setToTag(String toTag) {
        this.toTag = toTag;
    }

    @Override
    public String toString() {
        return "DialingInviteCallRequestDTO{" +
                "callID='" + callID + '\'' +
                ", fromTag='" + fromTag + '\'' +
                ", toTag='" + toTag + '\'' +
                '}';
    }
}
