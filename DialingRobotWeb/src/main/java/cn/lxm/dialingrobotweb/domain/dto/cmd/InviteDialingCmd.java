package cn.lxm.dialingrobotweb.domain.dto.cmd;

import cn.lxm.dialingrobotcommon.base.domain.BaseCmd;

public class InviteDialingCmd {

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

    public String getToTag() {
        return toTag;
    }

    public void setToTag(String toTag) {
        this.toTag = toTag;
    }

    public String getFromTag() {
        return fromTag;
    }

    public void setFromTag(String fromTag) {
        this.fromTag = fromTag;
    }
}
