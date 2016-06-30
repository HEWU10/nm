package com.nm.orm.entity;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tag")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "UUIDGenerate")
    @GenericGenerator(name = "UUIDGenerate", strategy = "uuid")
    private String id;
    private String name;
    @ManyToOne(targetEntity = Account.class)
    @JoinColumn(name = "accountId",updatable = false,nullable = false)
    private Account account;
    @CreationTimestamp
    @Column(insertable = true,updatable = false)
    private Date createDate;
    @UpdateTimestamp
    @Column(insertable = true,updatable = true)
    private Date modifyDate;


    ///////////////////////  get and set   //////////////////////////

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tag tag = (Tag) o;

        if (id != null ? !id.equals(tag.id) : tag.id != null) return false;
        if (name != null ? !name.equals(tag.name) : tag.name != null) return false;
        if (account != null ? !account.equals(tag.account) : tag.account != null) return false;
        if (createDate != null ? !createDate.equals(tag.createDate) : tag.createDate != null) return false;
        if (modifyDate != null ? !modifyDate.equals(tag.modifyDate) : tag.modifyDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (account != null ? account.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        return result;
    }
}
