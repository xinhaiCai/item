package com.rent.struts.action;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.struts.ActionSupport;

public class BaseAction extends ActionSupport{
protected Object getBean(String id){
	WebApplicationContext ctx=WebApplicationContextUtils
			.getWebApplicationContext(this.servlet.getServletContext());
	return ctx.getBean(id);
}

}
