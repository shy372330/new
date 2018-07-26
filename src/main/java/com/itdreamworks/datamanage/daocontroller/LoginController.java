package com.itdreamworks.datamanage.daocontroller;

import com.itdreamworks.datamanage.entity.User;
import com.itdreamworks.datamanage.mapper.UserMapper;
import com.itdreamworks.datamanage.util.Result;
import com.itdreamworks.datamanage.util.ResultGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 临时用来做身份认证
 * 将来所有身份认证功能均转移至身份认证与授权节点
 */
@RestController
@RequestMapping(value = "/account")
public class LoginController {
    @Autowired
    private UserMapper mapper;
    @PostMapping(value = "/signin", produces ="application/json;charset=utf-8")
    public Result signIn(@RequestParam(name = "loginid") String loginId, @RequestParam(name = "password") String password) {
        User user = mapper.findOneByLoginId(loginId);
        if (null == user)
            return ResultGenerator.genFailResult(0,"用户名或者密码输入错误");
        if (user.getPassword().equals(password)) {
            if (User.STATUS_ENABLE == user.getStatus()) {
                return ResultGenerator.genFailResult(1,"success",user);
            } else {
                return ResultGenerator.genFailResult(0,"您的用户账号已经被禁用，请联系系统管理人员！");
            }
        } else {
            return ResultGenerator.genFailResult(0,"用户名或者密码输入错误");
        }
    }
}
