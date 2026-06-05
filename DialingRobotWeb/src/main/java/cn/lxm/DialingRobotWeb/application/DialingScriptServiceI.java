package cn.lxm.DialingRobotWeb.application;

import cn.lxm.DialingRobotWeb.application.dto.request.DialingScriptAddRequest;
import cn.lxm.DialingRobotWeb.application.dto.request.DialingScriptListRequest;
import cn.lxm.DialingRobotWeb.application.dto.request.DialingScriptModifyRequest;
import cn.lxm.DialingRobotWeb.application.dto.request.DialingScriptRemoveRequest;
import cn.lxm.DialingRobotWeb.application.dto.response.DialingScriptAddResponse;
import cn.lxm.DialingRobotWeb.application.dto.response.DialingScriptListResponse;
import cn.lxm.DialingRobotWeb.application.dto.response.DialingScriptModifyResponse;
import cn.lxm.DialingRobotWeb.application.dto.response.DialingScriptRemoveResponse;

public interface DialingScriptServiceI {

    DialingScriptListResponse getScriptListByPage(DialingScriptListRequest request);

    DialingScriptModifyResponse modifyScriptListByID(DialingScriptModifyRequest request);

    DialingScriptAddResponse addScript(DialingScriptAddRequest request);

    DialingScriptRemoveResponse removeScript(DialingScriptRemoveRequest request);


}
