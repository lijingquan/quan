package com.quan.common;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

public class RequestUtil {

	/**
	 * �Ƴ�requestָ������
	 * 
	 * @param request
	 * @param paramName
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public String removeParam(HttpServletRequest request, String paramName) {
		String queryString = "";
		Enumeration keys = request.getParameterNames();
		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			if (key.equals(paramName)) {
				continue;
			}
			if ("".equals(queryString)) {
				queryString = key + "=" + request.getParameter(key);
			} else {
				queryString += "&" + key + "=" + request.getParameter(key);
			}
		}
		return queryString;
	}
	
	
	
}
