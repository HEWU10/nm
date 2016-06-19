package com.nm.orm.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by hewu on 2016/6/17 0017.
 */
@Entity
public class Discuss {
    private String id;
    private byte[] content;
    private String articleId;
    private Integer support;
    private Integer hate;
    private Timestamp createDate;
    private Timestamp modifyDate;
    private Integer status;
    private Integer floor;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "content")
    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    @Basic
    @Column(name = "articleId")
    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    @Basic
    @Column(name = "support")
    public Integer getSupport() {
        return support;
    }

    public void setSupport(Integer support) {
        this.support = support;
    }

    @Basic
    @Column(name = "hate")
    public Integer getHate() {
        return hate;
    }

    public void setHate(Integer hate) {
        this.hate = hate;
    }

    @Basic
    @Column(name = "createDate")
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "modifyDate")
    public Timestamp getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Timestamp modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "floor")
    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Discuss discuss = (Discuss) o;

        if (id != null ? !id.equals(discuss.id) : discuss.id != null) return false;
        if (!Arrays.equals(content, discuss.content)) return false;
        if (articleId != null ? !articleId.equals(discuss.articleId) : discuss.articleId != null) return false;
        if (support != null ? !support.equals(discuss.support) : discuss.support != null) return false;
        if (hate != null ? !hate.equals(discuss.hate) : discuss.hate != null) return false;
        if (createDate != null ? !createDate.equals(discuss.createDate) : discuss.createDate != null) return false;
        if (modifyDate != null ? !modifyDate.equals(discuss.modifyDate) : discuss.modifyDate != null) return false;
        if (status != null ? !status.equals(discuss.status) : discuss.status != null) return false;
        if (floor != null ? !floor.equals(discuss.floor) : discuss.floor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(content);
        result = 31 * result + (articleId != null ? articleId.hashCode() : 0);
        result = 31 * result + (support != null ? support.hashCode() : 0);
        result = 31 * result + (hate != null ? hate.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (floor != null ? floor.hashCode() : 0);
        return result;
    }
}
