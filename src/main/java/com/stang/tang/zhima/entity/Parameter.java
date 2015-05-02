package com.stang.tang.zhima.entity;

public class Parameter extends BaseEntity {
	private static final long serialVersionUID = -5548077362681525675L;

	private String key;
	private String value;

	public Parameter() {
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
