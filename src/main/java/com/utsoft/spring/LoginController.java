package com.utsoft.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <br />日期：2017/3/30
 * <br />时间：19:48
 * <br />创建人：刘坤
 * <br />描述：
 */
@Controller
public class LoginController {
    @RequestMapping("/index")
    public String index(){
        return "/ok";
    }
}
