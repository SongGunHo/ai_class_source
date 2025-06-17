
import { MdCheckBox, MdCheckBoxOutlineBlank } from 'react-icons/md';
const TodoItem =({title, content, checked, onToggle}) =>{

    return (
      <li onClick={() => onToggle(id)}>
        {checked ? <MdCheckBox /> : <MdCheckBoxOutlineBlank/>}
      </li>
    ); 
};
export default TodoItem;