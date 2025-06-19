import { useState, useCallback } from "react";

const getAverage =(item) =>{
    if(item.length === 0) return 0;
    const total  = item.reduce((a,b)=> a+b);

    const avg = total/item.length;
    console.log('getAverage()호출')
    return avg;
};
const Average=()=>{
    const [items, setItems] = useState([]);
    const [Number, setNumber] = useState('');

    const onchange = useCallback((e)=>{
        try{
        const value = Number(e.target.value.trim());
        }catch(e) {}    
    }, []) 

    const onSubmit= useCallback((e)=>{
        e.preventDefault();
        setItems(items => items.concat(Number));
    },[Number]
    );
    return (
        <>
        <form onSubmit={onSubmit}>
            <input type="number" onChange={onchange} value={Number}/>
            <button type="submit">등록</button>
        </form>
        <ul>
            {items.map((item, i )=> <li key={i+ "-"+ item}>{item}</li>)}
        </ul>
        <div>평균: {getAverage(items)}</div>
        </>
    )




}
export default Average;