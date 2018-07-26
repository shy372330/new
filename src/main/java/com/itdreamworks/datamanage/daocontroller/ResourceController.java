package com.itdreamworks.datamanage.daocontroller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itdreamworks.datamanage.entity.Resource;
import com.itdreamworks.datamanage.entity.Resource;
import com.itdreamworks.datamanage.mapper.ResourceMapper;
import com.itdreamworks.datamanage.util.Result;
import com.itdreamworks.datamanage.util.ResultGenerator;
import com.itdreamworks.datamanage.util.constants.Constants;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/resource")
public class ResourceController {
    @Autowired
    private ResourceMapper resourceMapper;

    /**
     * 获得菜单
     * @param account
     * @return
     */
    @GetMapping(value = "/resourcebyaccount")
    public Result getResourceByAccount(String account) {
        return ResultGenerator.genSuccessResult(resourceMapper.getResourceByAccount(account));
    }

    /**
     * 查询资源列表
     * @param resource
     * @return
     */
    @GetMapping(value = "/resourcelistbycondition")
    public Result getResourceListByCondition(Resource resource) {
        return ResultGenerator.genSuccessResult(resourceMapper.getResourceListByCondition(resource));
    }

    /**
     * 编辑资源
     * @param resource
     * @return
     */
    @PostMapping("/editresource")
    public Result editResource(@RequestBody Resource resource){
        if(resource.getResId()!=null){
            resourceMapper.updateResource(resource);
        }else{
            resourceMapper.insertResource(resource);
        }
        return ResultGenerator.genSuccessResult();
    }

    /**
     * 删除资源
     * @param resId
     * @return
     */
    @PostMapping(value = "/deleteresourcebyid")
    public Result deleteResourceById(@RequestParam int resId){
        resourceMapper.deleteResourceById(resId);
        return ResultGenerator.genSuccessResult();
    }
}
