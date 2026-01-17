<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.time.*" %>
<%@ page info="jsp연습" %>

<%
      List<String> items = List.of("사과", "오렌지", "망고");
      out.write(items.toString());
      out.write("<br>");
%>
<%=getServletInfo()%>