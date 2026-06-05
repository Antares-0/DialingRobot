package cn.lxm.DialingRobotWeb.infrastructure.gatewayimpl;

import cn.lxm.DialingRobotWeb.domain.gateway.ScriptGateway;
import cn.lxm.DialingRobotWeb.infrastructure.database.DialingScriptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ScriptGatewayImpl implements ScriptGateway {

    @Autowired
    private DialingScriptMapper dialingScriptMapper;

}
