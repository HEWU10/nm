package com.nm.orm.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by hewu on 2016/6/17 0017.
 */
@Entity
@Table(name = "discuss")
public class Discuss {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "UUIDGenerate")
    @GenericGenerator(name = "UUIDGenerate" ,strategy = "uuid")
    private String id;
    private byte[] content;
    private String articleId;
    private Integer support;
    private Integer hate;
    @CreationTimestamp
    private Date createDate;
    @UpdateTimestamp
    private Date modifyDate;
    private Integer status;
    private Integer floor;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public Integer getSupport() {
        return support;
    }

    public void setSupport(Integer support) {
        this.support = support;
    }

    public Integer getHate() {
        return hate;
    }

    public void setHate(Integer hate) {
        this.hate = hate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

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
