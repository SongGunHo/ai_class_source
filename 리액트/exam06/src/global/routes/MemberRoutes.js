import {Routes, Route} from "react-router-dom"
import React from "react"
import JoinPage from "../../member/pages/Join"
import LoginPage from "../../member/pages/Login"
import MainLayout  from "../layouts/MainLayout"



const MemberRoute =() =>{
    return (
      <Routes>
        <Route path="/member" element={<MainLayout/>}>
          <Route path="join" element={<JoinPage />} />
          <Route path="login" element={<LoginPage />} />
        </Route>
      </Routes>
    );
}

export default React.memo(MemberRoute)