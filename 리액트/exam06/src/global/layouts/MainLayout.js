import React from "react"
import classNames from "classnames";
import { Outlet, NavLink } from "react-router-dom";
const MainLayout =() =>{
    return (
      <>
        <header>
          <NavLink
            to="/member/login"
            className={({ isActive }) => classNames({ on: isActive })}
          >
            로그인
          </NavLink>
          <NavLink
            to="/member/join"
            className={({ isActive }) => classNames({ on: isActive })}
          >
            회원 가입 
          </NavLink>
        </header>
        <main>
          <Outlet />
        </main>
        <footer>
          <h1>하단 공통 영역</h1>
        </footer>
      </>
    );
};

export default React.memo(MainLayout);