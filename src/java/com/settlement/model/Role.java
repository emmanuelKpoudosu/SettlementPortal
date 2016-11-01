/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.settlement.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author emmanuel.kpoudosu
 */
@Entity
@Table(name="ST_ROLE")
@Cacheable
public class Role implements Serializable {
    @Id
    @Column(name = "ID")
    private String id;
    @Column(name = "ROLE_DESC")
    private String description;
    @Column(name = "CREATE_DATE")
    private Date userRoleCreationDate = new Date();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getUserRoleCreationDate() {
        return userRoleCreationDate;
    }

    public void setUserRoleCreationDate(Date userRoleCreationDate) {
        this.userRoleCreationDate = userRoleCreationDate;
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).toHashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) { return false; }
        if (object == this) { return true; }

        if (object instanceof Role) {
            Role rhs = (Role) object;
            return new EqualsBuilder()
                    .append(id, rhs.id)
                    .isEquals();
        }  else {
            return false;
        }
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.NO_FIELD_NAMES_STYLE).
                append("id", id).
                toString();
    }
}
