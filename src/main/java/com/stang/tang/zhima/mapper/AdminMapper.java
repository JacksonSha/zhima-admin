package com.stang.tang.zhima.mapper;

import com.stang.tang.zhima.entity.Admin;

public interface AdminMapper {

	public Admin loginAdmin(String login, String password);

	public Admin updateAdmin(Admin admin);

}
