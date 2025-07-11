import React, { useCallback , useEffect} from "react";
import { Link, useNavigate, Navigate } from "react-router-dom";

const MainPage = () => {
  const navigate = useNavigate();
  const isLoginIn = false; // 로그인 상태가 아니면 

  const onClick = useCallback(() => {
    const seq = Math.floor(Math.random() * 100) + 1; //100
    navigate(`/board/view/${seq}`, { replace: true }); // 방문기록을 남기지 않는다
  }, [navigate]);

  // if(isLoginIn){
  //   return <Navigate to="/login"/>
  // }
  return (
    <>
      <h1>메이페이지</h1>
      <Link to="/meber/join">회원 가입</Link>
      <Link to="/meber/login">로그인</Link>
      <div>
        <Link to="/board/write">글 작성</Link>
        <Link to="/board/list">글목록</Link>
        <Link to="/board/view">글 보기</Link>
      </div>
      <button type="button" onClick={onClick}>랜덤 게시글 보기</button>
    </>
  );
};

export default React.memo(MainPage);
