package org.dyg.utils.base.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport implements ServletRequestAware,ServletResponseAware{
	public static HttpServletRequest request;
	public static HttpServletResponse response;
	
	@Override
	public void setServletRequest(HttpServletRequest req) {
		request = req;
	}

	@Override
	public void setServletResponse(HttpServletResponse res) {
		response = res;
	}
	
	
	
	
}
