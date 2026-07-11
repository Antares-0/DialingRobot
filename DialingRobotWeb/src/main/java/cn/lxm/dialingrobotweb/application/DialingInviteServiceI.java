package cn.lxm.dialingrobotweb.application;

import cn.lxm.dialingrobotweb.domain.dto.InviteDialingResult;
import cn.lxm.dialingrobotweb.domain.dto.cmd.InviteDialingCmd;

public interface DialingInviteServiceI {

    InviteDialingResult DialingToUser(InviteDialingCmd cmd);

}
