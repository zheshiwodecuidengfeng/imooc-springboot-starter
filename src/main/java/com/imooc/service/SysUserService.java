package com.imooc.service;

import com.imooc.pojo.SysUser;

import java.util.List;

public interface SysUserService {

    /**
     * 保存用户
     * @param user
     */
    void saveUser(SysUser user);

    /**
     * 更新用户
     * @param user
     */
    void updateUser(SysUser user);

    /**
     * 删除用户
     * @param userId
     */
    void deleteUser(String userId);

    /**
     * 查询用户
     * @param userId
     * @return
     */
    SysUser selectUser(String userId);

    /**
     * 查询用户列表
     * @param user
     * @return
     */
    List<SysUser> selectUserList(SysUser user);

    /**
     * 分页查询用户列表
     * @param user
     * @param page   页面
     * @param pageSize    页面长度
     * @return
     */
    List<SysUser> selectUserListPage(SysUser user,Integer page,Integer pageSize);

    /**
     * 根据Id查询用户
     * @param userId
     * @return
     */
    SysUser selectUserByIdCustom(String userId);

    /**
     * 保存用户事务处理
     * @param user
     */
    void saveUserTransactional(SysUser user);
}
