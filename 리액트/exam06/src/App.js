import { Routes, Route } from "react-router-dom";
import MainPage from "./main/pages/MainPage";
import MemberRoutes from "./global/routes/MemberRoutes";
import BaordRouter from "./global/routes/BaordRouter";
import MainLayout from "./global/layouts/MainLayout";
import NotFoundPage from "./global/pages/NotFoundPage";
const App = () => {
  return (
    <>
      <Routes>
        <Route path="/" element={<MainLayout />}>
          <Route index element={<MainPage />} />
        </Route>
      </Routes>

      <MemberRoutes />
      <BaordRouter />
      <Route>
        <Route path="*" element={<NotFoundPage/>}/>
      </Route>
    </>
  );
};

export default App;
