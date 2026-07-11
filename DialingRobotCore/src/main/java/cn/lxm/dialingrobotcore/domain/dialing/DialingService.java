package cn.lxm.dialingrobotcore.domain.dialing;

import cn.lxm.dialingrobotcore.domain.dto.response.DialingResultDTO;
import cn.lxm.dialingrobotcore.domain.dto.cmd.DialingInviteCmd;
import org.springframework.stereotype.Component;

@Component
public class DialingService {

    public DialingResultDTO Dialing(DialingInviteCmd cmd) {
        System.out.println("cmd in");
        System.err.println("cmd in");
        return null;
    }

}
