<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
 <%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'head.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  



<table width="100%">
	<tr>
		<td>
			<font size="6" face="楷体_GB2312"><b>网上商城</b> </font>
		</td>
	</tr>
	<tr>
		<td>
			&nbsp;
		</td>
	</tr>
	<tr>
		<td align="right">
			<tt><a href="${param.path }index.jsp">首页</a> </tt>
			<tt><a href="javascript:forwardlogin()">登录</a> </tt>
			<tt><a href="${param.path }">搜索</a> </tt>
			<logic:present name="username" scope="session">
				<tt><a href="${param.path }show/buy/trolley.jsp"
					target="_blank">我的购物车</a> </tt>
				<tt><a href="${param.path }userinfo/index.jsp">用户管理</a> </tt>
			</logic:present>
		</td>
	</tr>
</table>

</html>
