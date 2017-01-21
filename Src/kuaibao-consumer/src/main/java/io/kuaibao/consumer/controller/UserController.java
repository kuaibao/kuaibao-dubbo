package io.kuaibao.consumer.controller;

import io.kuaibao.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by tianwei on 2017/1/21.
 */
@Controller
public class UserController {
    @Autowired
    private UserService demoService;

    @RequestMapping(value = "/test", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String test(){
        String userName = demoService.getUserName();
        return "test "+userName;
    }
}
