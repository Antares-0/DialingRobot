package cn.lxm.DialingRobotCommon.api;

import cn.lxm.DialingRobotCommon.dto.DialingInviteCall.DialingInviteCallRequestDTO;
import cn.lxm.DialingRobotCommon.dto.DialingInviteCall.DialingInviteCallResponseDTO;

public interface DialingServiceGatewayI {

    DialingInviteCallResponseDTO DialingInviteCall(DialingInviteCallRequestDTO req);

}
