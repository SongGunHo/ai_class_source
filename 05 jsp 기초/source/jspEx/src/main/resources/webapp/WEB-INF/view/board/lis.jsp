<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" url="jakarta.tags.core" %>
<h1>게시글</h1>
<ul>
    <c:forEach var="item" items="${items}">
        <li>${item.subject}</li>
</ul>