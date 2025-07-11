import React, { useState , Suspense} from "react"
import loadable from "@loadable/component" // 함수 


const SplitMe = loadable(() =>import("./SpiltMe"),{
    
})



const WritePage =() =>{
    const [visible, setVisible] = useState(false);
    return (
        <>
            <button type="button" onClick={() => setVisible(true)}>
                보이기 
            </button>
            {visible && <SplitMe/>}
        </>
    )
}
// const SplitMe = React.lazy(()=>import('/SplitMe'));


// const WritePage  =() =>{
//     const [visible, setVisible] = useState(false);
//     return (
//       <>
//         <h1>글작성</h1>;
//         <button type="buttion" onClick={() => setVisible(true)}>
//           보이기
//         </button>
//         <Suspense fallback={<div>로딩중</div>}>
//             {visible && <SplitMe />} 
//         </Suspense>
//       </>
//     );
// };

export default React.memo(WritePage)

