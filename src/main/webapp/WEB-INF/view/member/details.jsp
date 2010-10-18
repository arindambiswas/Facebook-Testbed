
<%@page import="com.collectivezen.fbtestbed.hb.Member"%><%
	Member member = (Member) request.getAttribute("member");
%>
Hello World, <%= member.getFbAccessToken() %>