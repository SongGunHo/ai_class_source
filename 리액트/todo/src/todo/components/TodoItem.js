
import { MdCheckBox, MdCheckBoxOutlineBlank } from 'react-icons/md';
import { FaRegWindowClose } from 'react-icons/fa';

const TodoItem = ({ id, title, content, checked, onToggle }) => {
  return (
    <li onClick={() => onToggle(id)}>
      {checked ? <MdCheckBox /> : <MdCheckBoxOutlineBlank />}
      {title} / {content}
    </li>
  );
};
export default TodoItem;