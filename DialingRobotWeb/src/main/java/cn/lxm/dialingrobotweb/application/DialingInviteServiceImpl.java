package cn.lxm.dialingrobotweb.application;

import cn.lxm.dialingrobotweb.domain.dialing.DialingDomainService;
import cn.lxm.dialingrobotweb.domain.dto.InviteDialingResult;
import cn.lxm.dialingrobotweb.domain.dto.cmd.InviteDialingCmd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DialingInviteServiceImpl implements DialingInviteServiceI {

    @Autowired
    private DialingDomainService dialingDomainService;

    @Override
    public InviteDialingResult DialingToUser(InviteDialingCmd cmd) {
        return dialingDomainService.InviteDialing(cmd);
    }

}
