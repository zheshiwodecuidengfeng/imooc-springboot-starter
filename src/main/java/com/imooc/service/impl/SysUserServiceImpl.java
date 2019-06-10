package com.imooc.service.impl;

import com.imooc.mapper.SysUserMapper;
import com.imooc.mapper.SysUserMapperCustom;
import com.imooc.pojo.SysUser;
import com.imooc.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private SysUserMapperCustom sysUserMapperCustom;

    /**
     * @function 添加用户并保存
     * @param user
     */
    @Override
    public void saveUser(SysUser user) {
        try {
            Thread.sleep(4000);
        } catch (Exception e){
            e.printStackTrace();
        }
        sysUserMapper.insert(user);
    }

    @Override
    public void updateUser(SysUser user) {
    sysUserMapper.updateByPrimaryKey(user);
    }

    @Override
    public void deleteUser(String userId) {
     sysUserMapper.deleteByPrimaryKey(userId);
    }

    @Override
    public SysUser selectUser(String userId) {
        return null;
    }

    @Override
    public List<SysUser> selectUserList(SysUser user) {
        return null;
    }

    @Override
    public List<SysUser> selectUserListPage(SysUser user, Integer page, Integer pageSize) {
        return null;
    }

    @Override
    public SysUser selectUserByIdCustom(String userId) {
        return null;
    }

    @Override
    public void saveUserTransactional(SysUser user) {

    }
}
