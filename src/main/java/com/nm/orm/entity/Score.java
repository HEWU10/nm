package com.nm.orm.entity;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by hewu on 2016/6/17 0017.
 */
@Entity
@Table(name = "score")
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "UUIDGenerate")
    @GenericGenerator(name = "UUIDGenerate" ,strategy = "uuid")
    private String id;
    private String articleId;
    private String content;
    private Integer fraction;
    private String accountId;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "fraction")
    public Integer getFraction() {
        return fraction;
    }

    public void setFraction(Integer fraction) {
        this.fraction = fraction;
    }

    @Basic
    @Column(name = "accountId")
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Score score = (Score) o;

        if (id != null ? !id.equals(score.id) : score.id != null) return false;
        if (articleId != null ? !articleId.equals(score.articleId) : score.articleId != null) return false;
        if (content != null ? !content.equals(score.content) : score.content != null) return false;
        if (fraction != null ? !fraction.equals(score.fraction) : score.fraction != null) return false;
        if (accountId != null ? !accountId.equals(score.accountId) : score.accountId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (articleId != null ? articleId.hashCode() : 0);
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (fraction != null ? fraction.hashCode() : 0);
        result = 31 * result + (accountId != null ? accountId.hashCode() : 0);
        return result;
    }
}
