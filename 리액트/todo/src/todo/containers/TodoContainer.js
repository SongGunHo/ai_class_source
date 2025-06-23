import { useState } from 'react';
import { produce } from 'immer';
import TodoForm from '../components/TodoForm';
import TodoItems from '../components/TodoItems';

const TodoContainer = () => {
  const [form, setForm] = useState({}); //form 현재 입력한 폼 값 
  const [items, setItems] = useState([ // 할일 목록 (초기값 3개 )
    { id: 1, title: '할일1', content: '할일1 내용', checked: false },
    { id: 2, title: '할일2', content: '할일2 내용', checked: true },
    { id: 3, title: '할일3', content: '할일3 내용', checked: false },
  ]);
  const [errors, setErrors] = useState({});

  const onSubmit = (e) => { // 폼 제출 처리 
    e.preventDefault(); // 를 사용해 기본 폼 재출 동작을 방지 한다 

    // 유효성 검사
    let hasErrors = false;
    const requiredFields = {
      title: '제목을 입력하세요.',
      content: '내용을 입력하세요.',
    };
    const errors = {};
    for (const [field, message] of Object.entries(requiredFields)) {
      if (!form[field] || !form[field]?.trim()) {
        errors[field] = message;
        hasErrors = true;
      }
    }

    // 유효성 검사 실패시 다음 로직 실행 X
    setErrors(errors);

    if (hasErrors) return;

    //setItems(items.concat({ ...form, id: Date.now() }));
    setItems(produce(draft=>{
      draft.push({...form, id: Date.now()})
    }));

    // 양식 초기화
    setForm({});
  };
  // 체크 박스 토클 처리 
  const onChange = (e) => { // 입력 값 변경처리 
    setForm({ ...form, [e.target.name]: e.target.value });
  };

  const onToggle =(id) =>{
    setItems((prevItmes)=>prevItmes.map(item=>item.id=== id? ({...item,     checked: !item.checked}):item))
  };
  // 스케쥴 하나 삭제 처리 
   const onRemove = (id)=>{
      //setItems((prevItmes) => prevItmes.filter((items)=>items.id !== id))
      // prevItmes :  이전의 상태의 값 (배열)
      // filter : 조건에 맞는 항목만 남기는 배열 매서드 
      // item.id! == id : id가 일치 하지 않는 항목만 남긴 즉 해당 id  를가짅 항목은 제거 됨 
      const index = items.findIndex(item => item.id == id);
      setItems(produce(draft=>{
        draft.splice(index, 1, 0);
      }));
   };
   // 선택된 스케쥴 일관 삭제 
   const onRemoveAll =() =>{
      setItems(items.filter(({checked})=> !checked));
   };
  return (
    <>
      <TodoForm
        onSubmit={onSubmit}
        onChange={onChange}
        form={form}
        errors={errors}
      />
      <TodoItems items={items} 
        onToggle={onToggle}
        onRemove={onRemove}
        onRemoveAll={onRemoveAll}/>
    </>
  );
};

export default TodoContainer;
