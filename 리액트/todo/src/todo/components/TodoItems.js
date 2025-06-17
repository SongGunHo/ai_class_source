
import TodoItem from './TodoItem';
const TodoItems = ({ items }) => {
  return (
    <ul>
      {items.map((props) => (
        <TodoItem key={props.id} {...props} onToggle={onToggle}/>
      ))}
    </ul>
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
