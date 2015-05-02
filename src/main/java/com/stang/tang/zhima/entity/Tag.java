package com.stang.tang.zhima.entity;

import java.util.Date;

public class Tag extends BaseEntity {
	private static final long serialVersionUID = 5529920783035311994L;

	private Integer id;
	private String name;
	private String desc;
	private Date createDt;

	public Tag() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getCreateDt() {
		return createDt;
	}

	public void setCreateDt(Date createDt) {
		this.createDt = createDt;
	}

}
