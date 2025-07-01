import {Routes, Route } from "react-router-dom"
import MainPage from "./main/MainPage";
import JoinPage from "./member/pages/Join";
import LoginPage from "./member/pages/Login";
const App =() =>{
  return (
    <Routes>
      <Route path="/" element={<MainPage />} />
      <Route path="/member/join" element={<JoinPage />} />
      <Route path="/member/login" element={<LoginPage />} />
    </Routes>
  );
};
export default App