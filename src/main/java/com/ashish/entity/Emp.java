package com.ashish.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 @Entity
 @Table(name="tbl_Emp")
public class Emp {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String role;
	private float sall;
	@CreationTimestamp
	private Date createdAt;
	@UpdateTimestamp
	private Date updateAt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public float getSall() {
		return sall;
	}
	public void setSall(float sall) {
		this.sall = sall;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", role=" + role + ", sall=" + sall + ", createdAt=" + createdAt
				+ ", updateAt=" + updateAt + "]";
	}
	
	

}
