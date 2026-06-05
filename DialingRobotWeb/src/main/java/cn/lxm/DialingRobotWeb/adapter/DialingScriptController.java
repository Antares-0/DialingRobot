package cn.lxm.DialingRobotWeb.adapter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 话术管理接口
 * 统一前缀：/dialing/script
 */
@RestController
@RequestMapping("/dialing/script")
public class DialingScriptController {

    // 访问地址：/dialing/script
    @GetMapping("")
    public String hello() {
        return "hello script";
    }


}