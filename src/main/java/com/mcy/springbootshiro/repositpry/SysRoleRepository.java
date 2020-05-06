package com.mcy.springbootshiro.repositpry;

import com.mcy.springbootshiro.entity.SysRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author liqiqi_tql
 * @date 2020/5/6 -9:36
 */
@Repository
public interface SysRoleRepository extends JpaRepository<SysRole,Integer>, JpaSpecificationExecutor<SysRole> {
}
