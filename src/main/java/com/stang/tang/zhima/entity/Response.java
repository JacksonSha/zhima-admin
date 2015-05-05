package com.stang.tang.zhima.entity;

public class Response {

	private int code;
	private String desc;

	public Response() {
	}

	public Response(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public static Response find(int code) {
		return null;
	}

}
