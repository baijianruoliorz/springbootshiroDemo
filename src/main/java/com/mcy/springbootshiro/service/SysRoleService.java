package com.mcy.springbootshiro.service;

import com.mcy.springbootshiro.repositpry.SysRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liqiqi_tql
 * @date 2020/5/6 -9:42
 */
@Service
public class SysRoleService {
    @Autowired
    private SysRoleRepository roleRepository;

}
