package cn.lxm.dialingrobotweb.domain.dialing;

import cn.lxm.dialingrobotcommon.base.adapter.BaseResponse;
import cn.lxm.dialingrobotcommon.dto.dialinginvitecall.DialingInviteCallRequestDTO;
import cn.lxm.dialingrobotcommon.dto.dialinginvitecall.DialingInviteCallResponseVO;
import cn.lxm.dialingrobotweb.domain.dto.InviteDialingResult;
import cn.lxm.dialingrobotweb.domain.dto.cmd.InviteDialingCmd;
import cn.lxm.dialingrobotweb.domain.gateway.InviteDialingCallGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DialingDomainService {

    @Autowired
    private InviteDialingCallGateway inviteDialingCallGateway;


    public InviteDialingResult InviteDialing(InviteDialingCmd cmd) {
        DialingInviteCallRequestDTO dialingInviteCallRequestDTO = new DialingInviteCallRequestDTO();
        dialingInviteCallRequestDTO.setLogID(cmd.getBaseCmd().getLogID());
        dialingInviteCallRequestDTO.setCallID(cmd.getCallID());
        dialingInviteCallRequestDTO.setFromTag(cmd.getFromTag());
        dialingInviteCallRequestDTO.setToTag(cmd.getToTag());
        BaseResponse<DialingInviteCallResponseVO> response = inviteDialingCallGateway.DialingInviteCall(dialingInviteCallRequestDTO);
        InviteDialingResult result = new InviteDialingResult();
        result.setStatus(response.getData().getStatus());
        return result;
    }

}
