<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache" charset="utf-8">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <jsp:include page="../head.jsp" />
    <html:form action="/login">
    	用户账号:<html:text property="user_id"/><html:errors property="user_id"/><br/>
    	 用户密码:<html:password property="user_password"/><html:errors property="user_password"/><br/>

    <html:submit/><html:cancel/>
    </html:form>
    <jsp:include page="../copyRight.jsp" />
  </body>
</html>
