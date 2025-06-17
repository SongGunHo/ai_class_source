
import TodoItem from './TodoItem';
import { FaInfoCircle } from 'react-icons/fa';
const TodoItems = ({ items, onToggle, onRemove, onRemoveAll }) => {
  return (
    <>
    <ul>
      {items.map((props) => (
        <TodoItem 
        key={props.id}
         {...props} onToggle={onToggle}
          onRemove={onRemove}
          onRemoveAll={onRemoveAll}/>
      ))}
    </ul>
    <button type='button'>선택 스케줄 삭제</button>
    </>

  );
};

// const TodoItems = ({ items }) => {
//   return (
//     <ul>
//       {items.map(({ id, title, content, checked }) => (

//         <>
//         <TodoItem {...props} />
//         {/*<TodoItem id={id} title={title}content={content} children={checked}/>

//         {/*<li
//            key={id}> 
//           {checked ? <MdCheckBox /> : <MdCheckBoxOutlineBlank />}
//           {title} / {content}
//         </li>*/}
//          </>
//       ))}
   
//     </ul>
//   );
// };

export default TodoItems;
