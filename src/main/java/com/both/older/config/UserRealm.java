//package com.audit.config.shiro;
//
//
//import com.audit.config.base.Constants;
//import com.audit.entity.RoleEntity;
//import com.audit.entity.UserEntity;
//import com.audit.service.interfaces.UserService;
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.authc.*;
//import org.apache.shiro.authz.AuthorizationInfo;
//import org.apache.shiro.authz.SimpleAuthorizationInfo;
//import org.apache.shiro.realm.AuthorizingRealm;
//import org.apache.shiro.session.Session;
//import org.apache.shiro.subject.PrincipalCollection;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class UserRealm extends AuthorizingRealm {
//
//    private Logger RealmLogger = LoggerFactory.getLogger(UserRealm.class);
//
//    @Autowired
//    private UserService userService;
//
//    /**
//     *  获取权限信息，执行授权
//     * @param principalCollection 身份集合
//     * @return 简单授权信息
//     */
//    @Override
//    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
//        Session session = SecurityUtils.getSubject().getSession();
//        //查询用户的权限
//        RoleEntity permission = (RoleEntity) session.getAttribute(Constants.SESSION_USER_INFO);
//        RealmLogger.info("本用户权限 ：-> ["+permission.getRole_name()+"]");
//        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
//        //为当前用户设置角色和权限
//        simpleAuthorizationInfo.addStringPermission(permission.getRole_name());
//        return simpleAuthorizationInfo;
//    }
//
//    /**
//     * 获取认证信息，执行认证
//     * @param authenticationToken 认证token
//     * @return 认证信息
//     * @throws AuthenticationException 认证异常
//     */
//    @Override
//    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
//        MyUsernamePasswordToken token = (MyUsernamePasswordToken) authenticationToken;
//
//        String phone = (String) token.getPrincipal();
//        UserEntity user = userService.findUserByPhone(phone);
//        if (user == null){
//            //用户不存在
//            throw new UnknownAccountException();
//        }
//        //交给AuthenticationRealm使用CredentialMatcher进行密码匹配
//        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(
//                user,
//                user.getPassword(),
//                getName()
//        );
//        //将用户信息存入session
//        SecurityUtils.getSubject().getSession().setAttribute(Constants.SESSION_USER_INFO,user);
//        return authenticationInfo;
//    }
//}
