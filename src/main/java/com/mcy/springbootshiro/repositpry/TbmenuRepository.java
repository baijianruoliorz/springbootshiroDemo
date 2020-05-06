package com.mcy.springbootshiro.repositpry;

import com.mcy.springbootshiro.entity.Tbmenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author liqiqi_tql
 * @date 2020/5/6 -9:41
 */
@Repository
public interface TbmenuRepository extends JpaRepository<Tbmenu,Integer>, JpaSpecificationExecutor<Tbmenu> {

}
