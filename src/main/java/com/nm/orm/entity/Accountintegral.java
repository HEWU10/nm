package com.nm.orm.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

/**
 * Created by hewu on 2016/6/17 0017.
 */
@Entity
@Table(name = "accountintegral")
public class Accountintegral {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid" ,strategy = "uuid2")
    private String id;

    private Date occurDate;
    private String accountId;
    private Integer content;
    private Integer classify;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getOccurDate() {
        return occurDate;
    }

    public void setOccurDate(Date occurDate) {
        this.occurDate = occurDate;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Integer getContent() {
        return content;
    }

    public void setContent(Integer content) {
        this.content = content;
    }

    public Integer getClassify() {
        return classify;
    }

    public void setClassify(Integer classify) {
        this.classify = classify;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Accountintegral that = (Accountintegral) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (occurDate != null ? !occurDate.equals(that.occurDate) : that.occurDate != null) return false;
        if (accountId != null ? !accountId.equals(that.accountId) : that.accountId != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (classify != null ? !classify.equals(that.classify) : that.classify != null) return false;

        return true;
    }

    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (occurDate != null ? occurDate.hashCode() : 0);
        result = 31 * result + (accountId != null ? accountId.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (classify != null ? classify.hashCode() : 0);
        return result;
    }
}
