package com.meng.study.controller;

import com.meng.study.bean.User;
import com.meng.study.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class UserController {
    @Autowired
    private UserService userService;

   /* //验证测试
    @PostMapping("/insertuser")
    public void inserUser(@Validated @RequestBody User user) {
        userService.insert(user);
    }*/


   //shiro测试
    @PostMapping("/loginjjjj")
    public String userlogin(@RequestParam(value = "username")
                            String username,@RequestParam(value = "password")
                            String password){
        System.out.println(username+"------"+password);
        UsernamePasswordToken usernamePasswordToken=new UsernamePasswordToken(username,password);
        Subject subject= SecurityUtils.getSubject();
        try{
            subject.login(usernamePasswordToken);
            User userinfo= (User) subject.getPrincipal();
            return "登录成功";
        }catch (UnknownAccountException e){
            e.printStackTrace();
            return "未知账号";
        }catch (IncorrectCredentialsException e){
            e.printStackTrace();
            return "密码错误";
        }catch (ExcessiveAttemptsException e){
            e.printStackTrace();
            return "输入次数过多，已锁定";
        }catch (LockedAccountException e){
            e.printStackTrace();
            return "账号已被锁定";
        }catch (AuthenticationException e){
            e.printStackTrace();
            return "用户名或密码不正确";
        }

    }


    @RequiresPermissions("add")
    @PostMapping("/adduser")
    public int adduser(@Validated @RequestBody User user){
        int res=userService.insert(user);
        return res;
    }

    @GetMapping ("/test")
    public User finduser(@RequestParam String username){
        User user=userService.selectByUsername(username);
        return user;
    }



   /* public static void main(String[] args) {
        String str="1";
        Integer id=Integer.parseInt(str);
        System.out.println(id);
    }*/

}
