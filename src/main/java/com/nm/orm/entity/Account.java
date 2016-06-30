package com.nm.orm.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;

/**
 * 功能说明：TODO
 *
 * @return <br/>
 * 修改历史：<br/>
 * 1.[2016年06月17日上午21:09] 创建方法 by hw
 */
@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "UUIDGenerate")
    @GenericGenerator(name = "UUIDGenerate" ,strategy = "uuid")
    private String id;

    private Integer type;
    private String name;
    private String password;
    private String mobile;
    private String email;
    private String address;
    @CreationTimestamp
    @Column(insertable = true,updatable = false)
    private Date createDate;
    @UpdateTimestamp
    @Column(insertable = true,updatable = true)
    private Date modifyDate;
    private Date birthDay;
    private String icon;
    private Integer vip;
    private Integer level;
    private Integer status;

    @OneToOne(fetch = FetchType.EAGER, targetEntity = AccountOauth.class)
    @JoinColumn(name = "accountOauthId",updatable = false)
    private AccountOauth accountOauth;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getVip() {
        return vip;
    }

    public void setVip(Integer vip) {
        this.vip = vip;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (id != null ? !id.equals(account.id) : account.id != null) return false;
        if (type != null ? !type.equals(account.type) : account.type != null) return false;
        if (name != null ? !name.equals(account.name) : account.name != null) return false;
        if (password != null ? !password.equals(account.password) : account.password != null) return false;
        if (mobile != null ? !mobile.equals(account.mobile) : account.mobile != null) return false;
        if (email != null ? !email.equals(account.email) : account.email != null) return false;
        if (address != null ? !address.equals(account.address) : account.address != null) return false;
        if (createDate != null ? !createDate.equals(account.createDate) : account.createDate != null) return false;
        if (modifyDate != null ? !modifyDate.equals(account.modifyDate) : account.modifyDate != null) return false;
        if (birthDay != null ? !birthDay.equals(account.birthDay) : account.birthDay != null) return false;
        if (icon != null ? !icon.equals(account.icon) : account.icon != null) return false;
        if (vip != null ? !vip.equals(account.vip) : account.vip != null) return false;
        if (level != null ? !level.equals(account.level) : account.level != null) return false;
        if (status != null ? !status.equals(account.status) : account.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        result = 31 * result + (birthDay != null ? birthDay.hashCode() : 0);
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        result = 31 * result + (vip != null ? vip.hashCode() : 0);
        result = 31 * result + (level != null ? level.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }


    public AccountOauth getAccountOauth() {
        return accountOauth;
    }


    public void setAccountOauth(AccountOauth accountOauth) {
        this.accountOauth = accountOauth;
    }
}
