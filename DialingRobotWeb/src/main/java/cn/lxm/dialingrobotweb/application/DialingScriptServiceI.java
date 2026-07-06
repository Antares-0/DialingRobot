package cn.lxm.dialingrobotweb.application;

import cn.lxm.dialingrobotweb.application.dto.request.DialingScriptAddRequest;
import cn.lxm.dialingrobotweb.application.dto.request.DialingScriptListRequest;
import cn.lxm.dialingrobotweb.application.dto.request.DialingScriptModifyRequest;
import cn.lxm.dialingrobotweb.application.dto.request.DialingScriptRemoveRequest;
import cn.lxm.dialingrobotweb.application.dto.response.DialingScriptAddResponse;
import cn.lxm.dialingrobotweb.application.dto.response.DialingScriptListResponse;
import cn.lxm.dialingrobotweb.application.dto.response.DialingScriptModifyResponse;
import cn.lxm.dialingrobotweb.application.dto.response.DialingScriptRemoveResponse;

public interface DialingScriptServiceI {

    DialingScriptListResponse getScriptListByPage(DialingScriptListRequest request);

    DialingScriptModifyResponse modifyScriptListByID(DialingScriptModifyRequest request);

    DialingScriptAddResponse addScript(DialingScriptAddRequest request);

    DialingScriptRemoveResponse removeScript(DialingScriptRemoveRequest request);


}
