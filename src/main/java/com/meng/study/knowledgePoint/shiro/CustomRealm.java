package com.meng.study.knowledgePoint.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class CustomRealm extends AuthorizingRealm {
    // 设置Realm的名称
    @Override
    public String getName() {
        return super.getName();
    }

    // 支持UsernamePasswordToken
    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof UsernamePasswordToken;
    }

    // 用于认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        // token是用户输入的
        // 第一步从token中取出身份信息
        String usercode = (String) token.getPrincipal();

        // 第二步：根据用户输入的usercode从数据库查询
        // ......

        // 如果查询不到返回null
        // 数据库中用户账号是zhangsan
        if (!usercode.equals("zhangsan")) {
            return null;
        }

        // 模拟从数据库中查询到密码
        String password = "123456";

        // 如果查询到返回认证信息AuthenticationInfo
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(usercode, password,
                this.getName());

        return simpleAuthenticationInfo;
    }

    // 用于授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }
}
