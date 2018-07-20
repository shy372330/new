package com.itdreamworks.datamanage.daocontroller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.itdreamworks.datamanage.entity.DeviceEmployeeMapViewForDevice;
import com.itdreamworks.datamanage.entity.Employee;
import com.itdreamworks.datamanage.entity.Product;
import com.itdreamworks.datamanage.entity.User;
import com.itdreamworks.datamanage.mapper.DeviceEmployeeMapMapper;
import com.itdreamworks.datamanage.mapper.EmployeeMapper;
import com.itdreamworks.datamanage.mapper.UserMapper;
import com.itdreamworks.datamanage.util.Result;
import com.itdreamworks.datamanage.util.ResultGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    /**
     * 获得用户列表的数据
     * @param user
     * @param pageNum
     * @param pageSize
     * @return
     */
    @GetMapping("/userlistbycondition")
    public Result getUserListByCondition(User user, int pageNum, int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<User> list =userMapper.getUserListByCondition(user);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    /**
     * 编辑用户
     * @param user
     * @return
     */
    @PostMapping("/edituser")
    public Result editUser(@RequestBody User user){
        if(user.getId()!=null){
            userMapper.updateUser(user);
        }else{
            userMapper.insertUser(user);
        }
        return ResultGenerator.genSuccessResult();
    }
}
