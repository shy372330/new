package com.itdreamworks.datamanage.daocontroller;

import com.itdreamworks.datamanage.entity.Resource;
import com.itdreamworks.datamanage.mapper.ResourceMapper;
import com.itdreamworks.datamanage.util.constants.Constants;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/resource")
public class ResourceController {
    @Autowired
    private ResourceMapper mapper;

    @GetMapping(value = "/list")
    public List<Resource> getAllResourceByAccount(String account) {
        List<Resource> userPermission =mapper.findAll(account);
        //获取权限名称
        return userPermission;
    }

    @PostMapping(value = "/create")
    public boolean create(Resource resource) {
        return mapper.addResource(resource) > 0;
    }
    @PostMapping(value = "/modify")
    public boolean modifyRole(Resource resource) {
        return mapper.modifyResource(resource) > 0;
    }

    @PostMapping(value = "/delete")
    public boolean deleteRole(Integer resId){
        return mapper.delResource(resId)>0;
    }
    @GetMapping(value = "getAllByRoleIds")
    public  List<Resource> getAllByRoleIds(List<Integer> roleIds){
        return mapper.getAllByRoleIds(roleIds);
    }
}
