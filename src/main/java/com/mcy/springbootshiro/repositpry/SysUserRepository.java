package com.mcy.springbootshiro.repositpry;

import com.mcy.springbootshiro.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author liqiqi_tql
 * @date 2020/5/6 -9:38
 */
@Repository
public interface SysUserRepository extends JpaRepository<SysUser,Integer>, JpaSpecificationExecutor<SysUser> {
    SysUser findByUsername(String username);

}
