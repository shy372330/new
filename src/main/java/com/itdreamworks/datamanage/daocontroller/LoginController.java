package com.itdreamworks.datamanage.daocontroller;

import com.alibaba.fastjson.JSONObject;
import com.itdreamworks.datamanage.common.JsonResult;
import com.itdreamworks.datamanage.entity.Employee;
import com.itdreamworks.datamanage.entity.Resource;
import com.itdreamworks.datamanage.mapper.EmployeeMapper;
import com.itdreamworks.datamanage.mapper.ResourceMapper;
import com.itdreamworks.datamanage.util.CommonUtil;
import com.itdreamworks.datamanage.util.constants.Constants;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 临时用来做身份认证
 * 将来所有身份认证功能均转移至身份认证与授权节点
 */
@RestController
@RequestMapping(value = "/account")
public class LoginController {
    @Autowired
    private EmployeeMapper mapper;
    @PostMapping(value = "/signin", produces ="application/json;charset=utf-8")
    public String signIn(@RequestParam(name = "loginid") String loginId, @RequestParam(name = "password") String password) {
        Employee user = mapper.findOneByLoginId(loginId);
        if (null == user)
            return "{\"code\":0,\"msg\":\"用户名或密码错误！\"}";
        if (user.getPassword().equals(password)) {
            if (Employee.STATUS_ENABLE == user.getStatus()) {
                return String.format("{\"code\":1,\"token\":\"\",\"user\":{\"orgId\":\"%s\"}}", user.getOrgId());
            } else {
                return "{\"code\":0,\"msg\":\"您的用户账号已经被禁用，请联系系统管理人员！\"}";
            }
        } else {
            return "{\"code\":0,\"msg\":\"用户名或密码错误！\"}";
        }
    }
    /*@PostMapping(value = "/signin")
    public JsonResult signIn(@RequestParam(name = "loginid") String loginId, @RequestParam(name = "password") String password) {
       // Employee user = mapper.findOneByLoginId(loginId);
        Subject currentUser = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(loginId, password);
        try {
            currentUser.login(token);
        }catch (UnknownAccountException uae) {
            return new JsonResult(-1,"当前用户"+loginId+"不存在");
        } catch (IncorrectCredentialsException ice) {
            return new JsonResult(-2,"密码错误");
        } catch (LockedAccountException lae) {
            return new JsonResult(-3,"当前用户"+loginId+"异常");
        } catch (AuthenticationException ae) {
            //无法判断是什么错了
            return new JsonResult(-4,"当前用户"+loginId+"异常");
        }

        return new JsonResult(200,null);
    }*/


    @RequiresPermissions("findOrgId")
    @GetMapping(value = "/findOrgId")
    public Integer findOrgId (String account){
        return mapper.getOrgId(account);
    }

    @PostMapping("/logout")
    public void logout() {
        try {
            Subject currentUser = SecurityUtils.getSubject();
            currentUser.logout();
        } catch (Exception e) {
        }
    }

}
