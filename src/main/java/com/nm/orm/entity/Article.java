package com.nm.orm.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by hewu on 2016/6/17 0017.
 */
@Entity
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "UUIDGenerate")
    @GenericGenerator(name = "UUIDGenerate", strategy = "uuid")
    private String id;
    private String title;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "content", columnDefinition = "TEXT", nullable = true)
    private String content;
    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Item.class)
    @JoinColumn(name = "itemId", nullable = false, updatable = false)
    private Item item;

    private Integer support;
    private Integer hate;
    private Integer see;
    @CreationTimestamp()
    @Column(updatable = false, insertable = true)
    private Date createDate;
    @UpdateTimestamp
    @Column(insertable = true, updatable = true)
    private Date modifyDate;
    private Integer status;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = Account.class)
    @JoinColumn(name = "accountId", nullable = false, updatable = false)
    private Account account;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
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

    public Integer getSee() {
        return see;
    }

    public void setSee(Integer see) {
        this.see = see;
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

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Article article = (Article) o;

        if (id != null ? !id.equals(article.id) : article.id != null) return false;
        if (title != null ? !title.equals(article.title) : article.title != null) return false;
        if (content != null ? !content.equals(article.content) : article.content != null) return false;
        if (item != null ? !item.equals(article.item) : article.item != null) return false;
        if (account != null ? !account.equals(article.account) : article.account != null) return false;
        if (support != null ? !support.equals(article.support) : article.support != null) return false;
        if (hate != null ? !hate.equals(article.hate) : article.hate != null) return false;
        if (see != null ? !see.equals(article.see) : article.see != null) return false;
        if (createDate != null ? !createDate.equals(article.createDate) : article.createDate != null) return false;
        if (modifyDate != null ? !modifyDate.equals(article.modifyDate) : article.modifyDate != null) return false;
        if (status != null ? !status.equals(article.status) : article.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + account.hashCode();
        result = 31 * result + (item != null ? item.hashCode() : 0);
        result = 31 * result + (account != null ? account.hashCode() : 0);
        result = 31 * result + (support != null ? support.hashCode() : 0);
        result = 31 * result + (hate != null ? hate.hashCode() : 0);
        result = 31 * result + (see != null ? see.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
