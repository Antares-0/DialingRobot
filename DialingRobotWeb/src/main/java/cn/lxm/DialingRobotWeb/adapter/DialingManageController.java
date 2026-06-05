package cn.lxm.DialingRobotWeb.adapter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 通话管理接口
 * 统一前缀：/dialing/manage
 */
@RestController
@RequestMapping("/dialing/manage")
public class DialingManageController {

    // 访问地址：/dialing/manage/hello
    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }


}