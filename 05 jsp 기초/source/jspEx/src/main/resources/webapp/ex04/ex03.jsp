<%@ page contentType="text/html; charset=UTF-8" %>
 <%
     pageContext.setAttribute("text", "pageContext에서 설정 ");
      request.setAttribute("text", "request 설정 ");
      application.setAttribute("text", "application 설정");
 %>
text : ${text}<br>
