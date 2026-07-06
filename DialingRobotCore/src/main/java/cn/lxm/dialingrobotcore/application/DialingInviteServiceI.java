package cn.lxm.dialingrobotcore.application;


import cn.lxm.dialingrobotcore.domain.dto.DialingResult;
import cn.lxm.dialingrobotcore.domain.dto.cmd.DialingInviteCmd;

public interface DialingInviteServiceI {

    DialingResult DialingInviteCall(DialingInviteCmd req);

}
