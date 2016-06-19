package com.nm.orm.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by hewu on 2016/6/17 0017.
 */
@Entity
@Table(name = "accountOauth")
public class AccountOauth {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "UUIDGenerate")
    @GenericGenerator(name = "UUIDGenerate" ,strategy = "uuid")
    private String id;
    private String authId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthId() {
        return authId;
    }

    public void setAuthId(String authId) {
        this.authId = authId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccountOauth that = (AccountOauth) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (authId != null ? !authId.equals(that.authId) : that.authId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (authId != null ? authId.hashCode() : 0);
        return result;
    }
}
