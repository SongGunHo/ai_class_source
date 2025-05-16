<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" url="jakarta.tags.core" %>
<h1></h1>
<form method="POST" action="{action}">
    <dl>
        <dt>
            <input type="text" name="email">
        </dt>
    </dl>
    <dl>
        <dt>
            <input type="text" name ="password">
        </dt>
    </dl>
  <dl>
        <dt>비밀 번호 확인 </dt>
   <dd>
        <input type="text" name="confirmPassword">
    </dd>
  </dl>
  <dl>
    <dt>회원명</dt>

  <dd>
    <input type="text" name="name">
  </dd>
   </dl>
   <dl>
        <dt>약관 동의 </dt>
        <dd>
            <input type="checkbox" name="agree" value="true" id="agree">
            <label for="agree">약관에 동의 합니다</label>
        </dd>
   </dl>
   <button type="submit">가입 하기</button>
</form>
