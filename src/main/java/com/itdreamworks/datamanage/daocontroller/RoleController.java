package com.itdreamworks.datamanage.daocontroller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itdreamworks.datamanage.entity.Product;
import com.itdreamworks.datamanage.entity.Role;
import com.itdreamworks.datamanage.mapper.RoleMapper;
import com.itdreamworks.datamanage.util.Result;
import com.itdreamworks.datamanage.util.ResultGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/role")
public class RoleController {

    @Autowired
    private RoleMapper roleMapper;

    /**
     * 查询角色列表
     * @param role
     * @param pageNum
     * @param pageSize
     * @return
     */
    @GetMapping(value = "/rolelistbycondition")
    public Result getRoleListByCondition(Role role, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Role> list =roleMapper.getRoleListByCondition(role);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    /**
     * 编辑角色
     * @param role
     * @return
     */
    @PostMapping("/editrole")
    public Result editRole(@RequestBody Role role){
        if(role.getRoleId()!=null){
            roleMapper.updateRole(role);
        }else{
            roleMapper.insertRole(role);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
     * 删除角色
     * @param roleId
     * @return
     */
    @PostMapping(value = "/deleterolebyid")
    public Result deleteRoleById(@RequestParam int roleId){
        roleMapper.deleteRoleById(roleId);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping(value = "/getAllByUserId")
    public List<Role> findAllByUserId(Integer useId){
        return roleMapper.findAllByUserId(useId);
    }
}
