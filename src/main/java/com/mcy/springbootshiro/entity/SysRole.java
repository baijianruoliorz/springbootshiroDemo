package com.mcy.springbootshiro.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.CreatedBy;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2020/5/6 -9:03
 */
@Entity
public class SysRole {
    private Integer id;
    private String name;
    @JsonIgnore
    private SysRole parent;
    private Integer idx;
    @JsonIgnore
    private List<SysRole> children=new ArrayList<>();
    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
     @Column(length=20)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     @ManyToOne
     @CreatedBy
    public SysRole getParent() {
        return parent;
    }

    public void setParent(SysRole parent) {
        this.parent = parent;
    }

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "parent")
    public List<SysRole> getChildren() {
        return children;
    }

    public void setChildren(List<SysRole> children) {
        this.children = children;
    }
}
