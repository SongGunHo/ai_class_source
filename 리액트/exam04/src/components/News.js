import { useStatem ,useEffect } from "react";


const News =() =>{
    useEffect(()=>{
        //컴포런트 마운트가 되었을떼 호출 
        fetch(
           ' https://newsapi.org/v2/top-headlines?sources=techcrunch&apiKey=6593897e9b3d40178104e2cb158f2866'
        )
        .then((res => res.json))
        
    },[]);
};

export default News;