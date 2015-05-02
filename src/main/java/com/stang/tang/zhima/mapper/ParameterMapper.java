package com.stang.tang.zhima.mapper;

import com.stang.tang.zhima.entity.Parameter;

public interface ParameterMapper {

	public void createParameter(Parameter param);

	public Parameter getParameter(String key);

}
