package com.mcy.springbootshiro.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.CreatedBy;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liqiqi_tql
 * @date 2020/5/6 -8:57
 */
public class Tbmenu {
    private Integer id;
    private String name;
    private String url;
    private Integer idx;
    @JsonIgnore
    private Tbmenu parent;
    @JsonIgnore
    private List<Tbmenu> children=new ArrayList<>();
    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Column(unique = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }
    @ManyToOne
    @CreatedBy
    public Tbmenu getParent() {
        return parent;
    }

    public void setParent(Tbmenu parent) {
        this.parent = parent;
    }
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "parent")
    @OrderBy(value = "idx")
    public List<Tbmenu> getChildren() {
        return children;
    }

    public void setChildren(List<Tbmenu> children) {
        this.children = children;
    }
}
