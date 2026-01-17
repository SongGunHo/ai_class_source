import React ,{use, useEffect,useState} from "react"
import { useLoaderData, useLocation, useParams, useSearchParams } from "react-router-dom";

const ViewPage =() =>{
    const {seq} = useParams();
    const [item, setItem] = useState();
    const [searchParams, setSearchParams] = useSearchParams;

    //const location = useLocation;
    useEffect(() =>{
      const qs = [...searchParams.entries()];
      console.log("qs", qs);

      searchParams.append("k10", "v10");
      setSearchParams(searchParams);
    },[searchParams, setSearchParams]);

    useEffect(()=>{
        (async ()=> {
            const url = `https://jsonplaceholder.typicode.com/posts/{seq}`;
            const res = await fetch(url);
            const data = await res.json();
            setItem(data);
        }) ();
    },[seq]);
    const {title , body} = item;
    return (
      <>
        <h1>글 보기 </h1>
        <h1>{title}</h1>
        <pre>{body}</pre>
      </>
    );
};

export default React.memo(ViewPage)