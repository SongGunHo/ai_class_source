import React from "react";


const MainPage  = () =>{
    return (
      <>
        <h1>메이페이지</h1>
        <link to="/meber/join">회원 가입</link>
        <link to="/meber/login">로그인</link>
      </>
    );
};

export default React.memo(MainPage);