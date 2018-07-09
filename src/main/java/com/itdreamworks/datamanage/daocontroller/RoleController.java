package com.itdreamworks.datamanage.daocontroller;

import com.itdreamworks.datamanage.entity.Role;
import com.itdreamworks.datamanage.mapper.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/role")

public class RoleController {
    @Autowired
    private RoleMapper mapper;
    @GetMapping(value = "/list")
    public List<Role> getAllRole() {
        return mapper.findAll();
    }

    @PostMapping(value = "/create")
    public boolean create(Role role) {
        return mapper.addRole(role) > 0;
    }


    @PostMapping(value = "/modify")
    public boolean modifyRole(Role role) {
        return mapper.modifyRole(role) > 0;
    }

    @PostMapping(value = "/delete")
    public boolean deleteRole(Integer roleId){
        return mapper.delRole(roleId)>0;
    }

    @GetMapping(value = "/getAllByUserId")
    public List<Role> findAllByUserId(Integer useId){
        return mapper.findAllByUserId(useId);
    }

}
