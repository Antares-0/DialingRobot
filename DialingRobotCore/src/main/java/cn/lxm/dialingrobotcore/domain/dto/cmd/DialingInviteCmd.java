package cn.lxm.dialingrobotcore.domain.dto.cmd;

public class DialingInviteCmd {

    private BaseCmd baseCmd;

    private String callID;

    private String fromTag;

    private String toTag;

    public BaseCmd getBaseCmd() {
        return baseCmd;
    }

    public void setBaseCmd(BaseCmd baseCmd) {
        this.baseCmd = baseCmd;
    }

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

    public DialingInviteCmd(BaseCmd baseCmd, String callID, String fromTag, String toTag) {
        this.baseCmd = baseCmd;
        this.callID = callID;
        this.fromTag = fromTag;
        this.toTag = toTag;
    }
}
