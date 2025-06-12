import { Fragment} from 'react';
import './App.css';

// function App() {
//   let name;
//   name = name ?? '기본 이름';

//   ///return name ?<h1>{name}님 반갑습니다</h1>: '';
//   return name && <h1 className="greet">{name}님 반갑습니다</h1>;
// }
function App(){
  return (
    <>
      <h1>반갑습니다</h1>
      <h2>안녕하세요</h2>
    </> /// 빈테그 하면 Fragment 인식을 한다 
  ); 

  
}

export default App;
