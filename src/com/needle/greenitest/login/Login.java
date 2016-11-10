package com.needle.greenitest.login;

public interface Login {

	/**
	 * 预留接口，测试HTTP接口时若需要登录，则实现改接口，返回登录后的有效cookie
	 * @param userinfo
	 * @return
	 */
	public String loginAndGetCookie();
}
