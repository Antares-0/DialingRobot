package cn.lxm.dialingrobotcore.adapter.rpc;

import cn.lxm.DialingRobotCommon.api.DialingServiceGatewayI;
import cn.lxm.DialingRobotCommon.dto.DialingInviteCall.DialingInviteCallRequestDTO;
import cn.lxm.DialingRobotCommon.dto.DialingInviteCall.DialingInviteCallResponseDTO;
import cn.lxm.dialingrobotcore.application.DialingInviteServiceI;
import cn.lxm.dialingrobotcore.domain.dto.DialingResult;
import cn.lxm.dialingrobotcore.domain.dto.cmd.DialingInviteCmd;
import cn.lxm.dialingrobotcore.infrastructure.convertor.RequestConverter;
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
    public DialingInviteCallResponseDTO DialingInviteCall(DialingInviteCallRequestDTO reqDTO) {
        DialingInviteCmd cmd = RequestConverter.convertDialingInviteCallRequestDTO2DialingInviteCmd(reqDTO);
        DialingResult result = DialingInviteService.DialingInviteCall(cmd);

        return null;
    }

}
