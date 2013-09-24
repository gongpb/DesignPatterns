package com.adapter.user;

import java.util.Map;
/**
 * 劳务服务公司的信息接口
 * @author gong_pibao
 */
public interface IOuterUser {
	//获取基本信息
	public Map getUserBaseInfo();
	//获取办公信息
	public Map getUserOfficeInfo();
	//获取家庭信息
	public Map getUserHomeInfo();
}
