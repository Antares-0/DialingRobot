package cn.lxm.dialingrobotcore.adapter.rpc;

import cn.lxm.dialingrobotcommon.api.DialingServiceGatewayI;
import cn.lxm.dialingrobotcommon.base.adapter.BaseResponse;
import cn.lxm.dialingrobotcommon.dto.dialinginvitecall.DialingInviteCallRequestDTO;
import cn.lxm.dialingrobotcommon.dto.dialinginvitecall.DialingInviteCallResponseVO;
import cn.lxm.dialingrobotcore.application.DialingInviteServiceI;
import cn.lxm.dialingrobotcore.domain.dto.response.DialingResultDTO;
import cn.lxm.dialingrobotcore.domain.dto.cmd.DialingInviteCmd;
import cn.lxm.dialingrobotcore.infrastructure.convertor.RequestConverter;
import cn.lxm.dialingrobotcore.infrastructure.convertor.ResponseConverter;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@DubboService(
        timeout = 5000
)
@Controller
public class DialingServiceGatewayImpl implements DialingServiceGatewayI {

    @Autowired
    private DialingInviteServiceI DialingInviteService;

    @Override
    public BaseResponse<DialingInviteCallResponseVO> DialingInviteCall(DialingInviteCallRequestDTO reqDTO) {
        DialingInviteCmd cmd = RequestConverter.convertDialingInviteCallRequestDTO2DialingInviteCmd(reqDTO);
        DialingResultDTO result = DialingInviteService.DialingInviteCall(cmd);
        return ResponseConverter.convertDialingResultDTO2DialingInviteCallResponseDTO(result);
    }

}
