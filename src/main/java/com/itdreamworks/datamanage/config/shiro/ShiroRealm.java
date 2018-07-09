package com.itdreamworks.datamanage.config.shiro;

import com.itdreamworks.datamanage.entity.Employee;
import com.itdreamworks.datamanage.mapper.EmployeeMapper;
import com.itdreamworks.datamanage.mapper.ResourceMapper;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 认证和授权
 * @author doudou
 */
public class ShiroRealm extends AuthorizingRealm {

    private Logger logger = LoggerFactory.  getLogger(this.getClass());

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private ResourceMapper resourceMapper;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        Employee user = employeeMapper.findOneByLoginId((String) principalCollection.getPrimaryPrincipal());
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        //赋予角色
      /*  for(Role userRole:user.getRoles()){
            simpleAuthorizationInfo.addRole(userRole.getName());
        }*/
        System.out.println("resoure======>"+resourceMapper.findPermissionById(user.getId()));
        //赋予权限
        for(String permission:resourceMapper.findPermissionById(user.getId())){

                simpleAuthorizationInfo.addStringPermission(permission);

        }
        return simpleAuthorizationInfo;
    }

    /**
     * 用户认证
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        String userName=token.getUsername();
        //通过username从数据库中查找 User对象
        //实际项目中，这里可以根据实际情况做缓存，如果不做，Shiro自己也是有时间间隔机制，2分钟内不会重复执行该方法
        Employee user = employeeMapper.findOneByLoginId(token.getUsername());
        if (user != null) {
            Session session = SecurityUtils.getSubject().getSession();
            session.setAttribute("user", user);
            return new SimpleAuthenticationInfo(userName,user.getPassword()/*ByteSource.Util.bytes(user.getSalt())*/,getName());
        } else {
            return null;
        }
    }

}
