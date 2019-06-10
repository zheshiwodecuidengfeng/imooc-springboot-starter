package com.imooc.controller;

import com.imooc.pojo.IMoocJSONResult;
import com.imooc.pojo.SysUser;
import com.imooc.service.SysUserService;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("mybatis")
public class SysUserController  {


    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private Sid sid;

    @RequestMapping("/saveUser")
        public IMoocJSONResult saveUser(){

           String userId = sid.nextShort();
        SysUser user = new SysUser();
        user.setId(userId);
        user.setUsername("张三"+new Date());
        user.setNickname("张三"+new Date());
        user.setPassword("abc12323323");
        user.setIsDelete(0);
        user.setRegistTime(new Date());

        sysUserService.saveUser(user);
        return  IMoocJSONResult.ok("保存成功");
        }

       @RequestMapping("/updateUser")
     public IMoocJSONResult updateUser(){
        SysUser user = new SysUser();
        user.setId("1709067GM45GAF5P");
        user.setUsername("100123344-update"+new Date());
        user.setNickname("1003203004-update"+new Date());
        user.setIsDelete(0);
        user.setRegistTime(new Date());

        sysUserService.updateUser(user);
        return IMoocJSONResult.ok("保存成功");
       }

       @RequestMapping("/deleteUser")
    public IMoocJSONResult deleteUser(String userId){
        sysUserService.deleteUser(userId);
        return IMoocJSONResult.ok("删除成功");
       }
    }



