package cn.lxm.DialingRobotWeb.application;

import cn.lxm.DialingRobotWeb.application.dto.request.DialingScriptAddRequest;
import cn.lxm.DialingRobotWeb.application.dto.request.DialingScriptListRequest;
import cn.lxm.DialingRobotWeb.application.dto.request.DialingScriptModifyRequest;
import cn.lxm.DialingRobotWeb.application.dto.request.DialingScriptRemoveRequest;
import cn.lxm.DialingRobotWeb.application.dto.response.DialingScriptAddResponse;
import cn.lxm.DialingRobotWeb.application.dto.response.DialingScriptListResponse;
import cn.lxm.DialingRobotWeb.application.dto.response.DialingScriptModifyResponse;
import cn.lxm.DialingRobotWeb.application.dto.response.DialingScriptRemoveResponse;
import cn.lxm.DialingRobotWeb.domain.script.ScriptDomainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DialingScriptServiceImpl implements DialingScriptServiceI {

    @Autowired
    private ScriptDomainService scriptDomainService;


    @Override
    public DialingScriptModifyResponse modifyScriptListByID(DialingScriptModifyRequest request) {
        return null;
    }

    @Override
    public DialingScriptListResponse getScriptListByPage(DialingScriptListRequest request) {
        return null;
    }

    @Override
    public DialingScriptAddResponse addScript(DialingScriptAddRequest request) {
        return null;
    }

    @Override
    public DialingScriptRemoveResponse removeScript(DialingScriptRemoveRequest request) {
        return null;
    }
}
