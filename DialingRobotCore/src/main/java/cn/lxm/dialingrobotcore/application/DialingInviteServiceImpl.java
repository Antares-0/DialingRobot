package cn.lxm.dialingrobotcore.application;

import cn.lxm.dialingrobotcore.domain.dialing.DialingService;
import cn.lxm.dialingrobotcore.domain.dto.DialingResult;
import cn.lxm.dialingrobotcore.domain.dto.cmd.DialingInviteCmd;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class DialingInviteServiceImpl implements DialingInviteServiceI {

    @Resource
    private DialingService dialingService;

    @Override
    public DialingResult DialingInviteCall(DialingInviteCmd cmd) {
        return dialingService.Dialing(cmd);
    }
}
