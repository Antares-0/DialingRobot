package cn.lxm.dialingrobotweb.infrastructure.gatewayimpl;

import cn.lxm.dialingrobotcommon.api.DialingServiceGatewayI;
import cn.lxm.dialingrobotcommon.base.adapter.BaseResponse;
import cn.lxm.dialingrobotcommon.dto.dialinginvitecall.DialingInviteCallRequestDTO;
import cn.lxm.dialingrobotcommon.dto.dialinginvitecall.DialingInviteCallResponseVO;
import cn.lxm.dialingrobotweb.domain.gateway.InviteDialingCallGateway;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Repository;


@Repository
public class InviteDialingCallGatewayImpl implements InviteDialingCallGateway {


    @DubboReference(
            lazy = true
    )
    private DialingServiceGatewayI dialingServiceGatewayI;

    @Override
    public BaseResponse<DialingInviteCallResponseVO> DialingInviteCall(DialingInviteCallRequestDTO requestDTO) {
        return dialingServiceGatewayI.DialingInviteCall(requestDTO);
    }

}
