package cn.lxm.dialingrobotweb.adapter.http;

import cn.lxm.dialingrobotcommon.base.domain.BaseCmd;
import cn.lxm.dialingrobotcommon.utils.LogUtil;
import cn.lxm.dialingrobotweb.application.DialingInviteServiceI;
import cn.lxm.dialingrobotweb.domain.dto.cmd.InviteDialingCmd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * 电话拨打
 * 统一前缀：/dialing/invite
 */
@RestController
@RequestMapping("/dialing/invite")
public class DialingInviteController {

    @Autowired
    private DialingInviteServiceI dialingInviteServiceI;

    // 访问地址：/dialing/invite/user
    @RequestMapping("user")
    public String user(@RequestParam("callID") String callID,
                       @RequestParam("fromTag") String fromTag,
                       @RequestParam("toTag") String toTag) {
        InviteDialingCmd cmd = new InviteDialingCmd();
        cmd.setBaseCmd(new BaseCmd(LogUtil.getLogID()));
        cmd.setCallID(callID);
        cmd.setFromTag(fromTag);
        cmd.setToTag(toTag);
        dialingInviteServiceI.DialingToUser(cmd);
        return "user";
    }

}
