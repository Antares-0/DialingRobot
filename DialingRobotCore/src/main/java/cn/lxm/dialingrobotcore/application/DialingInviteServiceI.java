package cn.lxm.dialingrobotcore.application;


import cn.lxm.dialingrobotcore.domain.dto.response.DialingResultDTO;
import cn.lxm.dialingrobotcore.domain.dto.cmd.DialingInviteCmd;

public interface DialingInviteServiceI {

    DialingResultDTO DialingInviteCall(DialingInviteCmd req);

}
