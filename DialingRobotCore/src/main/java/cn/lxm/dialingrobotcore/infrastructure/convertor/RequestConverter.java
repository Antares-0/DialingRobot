package cn.lxm.dialingrobotcore.infrastructure.convertor;

import cn.lxm.DialingRobotCommon.base.BaseRequest;
import cn.lxm.DialingRobotCommon.dto.DialingInviteCall.DialingInviteCallRequestDTO;
import cn.lxm.dialingrobotcore.domain.dto.cmd.BaseCmd;
import cn.lxm.dialingrobotcore.domain.dto.cmd.DialingInviteCmd;
import cn.lxm.dialingrobotcore.domain.dto.qry.BaseQry;

public class RequestConverter {

    public static BaseCmd convertBaseRequest2BaseCmd(BaseRequest request) {
        return new BaseCmd(request.getLogID());
    }

    public static BaseQry convertBaseRequest2BaseQry(BaseRequest request) {
        return new BaseQry(request.getLogID());
    }

    public static DialingInviteCmd convertDialingInviteCallRequestDTO2DialingInviteCmd(DialingInviteCallRequestDTO dto){
        return new DialingInviteCmd(
                convertBaseRequest2BaseCmd(dto),
                dto.getCallID(),
                dto.getFromTag(),
                dto.getToTag());
    }





}
