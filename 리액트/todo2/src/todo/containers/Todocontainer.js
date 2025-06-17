import { useState } from "react";


const TodoContainer= () =>{
    const [form, setForm]= useState({});//from 현재 입력 한 폼 값
    const [items, setItems] = useState([// 할일 목록 (초기값 3개)
        {id:1 , title: '할일1',content:'할일1 내용', checked: false},
        {id:2, title: '할일2', content:'할일2 내용', checked: false},
        {id:3, title: '할일3', content:'할일3 내용', checked:true},
    ]); 
   const [erros, setErrors) = useState({});
   ] 
    
    

};