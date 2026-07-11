package cn.lxm.dialingrobotcommon.api;

import cn.lxm.dialingrobotcommon.base.adapter.BaseResponse;
import cn.lxm.dialingrobotcommon.dto.dialinginvitecall.DialingInviteCallRequestDTO;
import cn.lxm.dialingrobotcommon.dto.dialinginvitecall.DialingInviteCallResponseVO;

public interface DialingServiceGatewayI {

    BaseResponse<DialingInviteCallResponseVO> DialingInviteCall(DialingInviteCallRequestDTO req);

}
