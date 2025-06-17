import { useState } from "react";


const TodoContainer= () =>{
    const [form, setForm]= useState({});//from 현재 입력 한 폼 값
    const [items, setItems] = useState([// 할일 목록 (초기값 3개)
        {id:1 , title: '할일1',content:'할일1 내용', checked: false},
        {id:2, title: '할일2', content:'할일2 내용', checked: false},
        {id:3, title: '할일3', content:'할일3 내용', checked:true},
    ]); 
   const [erros, setErrors] = useState({});
   
    const onSubmit =(e) =>{ // 폼 제출 처리 
        e.preventDefault(); // 폼을 사용해 기본 폼 제출 동작을 방지 한다 
    }
    // 유효성 검사 
    let hasErrors = false;
    const requiredFields ={
        title:'제목을 입력 하세요',
        content: '내용을 입력 하세요',
    };
    
    const errors ={};
    for(const [field, message]of Object.entries(requiredFields)){
        if(!form[field]||form[field]?.trim()){
            errors[field] = message;
            hasErrors = true;
        }
    }

    // 유효성 검사 실패시 다음 로직 실행x
    setErrors(errors);
    if(hasErrors) return;

    setItems(items.concat({...form, id: Date.now}));

    

    
    

};