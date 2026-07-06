package cn.lxm.dialingrobotweb.application;

import cn.lxm.dialingrobotweb.application.dto.request.DialingScriptAddRequest;
import cn.lxm.dialingrobotweb.application.dto.request.DialingScriptListRequest;
import cn.lxm.dialingrobotweb.application.dto.request.DialingScriptModifyRequest;
import cn.lxm.dialingrobotweb.application.dto.request.DialingScriptRemoveRequest;
import cn.lxm.dialingrobotweb.application.dto.response.DialingScriptAddResponse;
import cn.lxm.dialingrobotweb.application.dto.response.DialingScriptListResponse;
import cn.lxm.dialingrobotweb.application.dto.response.DialingScriptModifyResponse;
import cn.lxm.dialingrobotweb.application.dto.response.DialingScriptRemoveResponse;
import cn.lxm.dialingrobotweb.domain.script.ScriptDomainService;
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
