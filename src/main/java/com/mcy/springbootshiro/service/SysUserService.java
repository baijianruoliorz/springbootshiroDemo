package com.mcy.springbootshiro.service;

import com.mcy.springbootshiro.entity.SysUser;
import com.mcy.springbootshiro.repositpry.SysUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liqiqi_tql
 * @date 2020/5/6 -9:42
 */
@Service
public class SysUserService {
    @Autowired
    private SysUserRepository userRepository;
    public SysUser findByUsername(String username){
        return userRepository.findByUsername(username);

    }
  public void save(SysUser user){
        userRepository.save(user);
  }

}
