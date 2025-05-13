<%@ page contentType="text/html; charset=UTF-8"%>
 <%
     pageContext.setAttribute("text1", "pageContext에서 설정 ");
      request.setAttribute("text2", "request 설정 ");
      application.setAttribute("text3", "application 설정");
 %>
<jsp:include page="ex02.jsp"/>