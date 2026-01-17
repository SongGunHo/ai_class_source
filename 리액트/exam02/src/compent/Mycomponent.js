const Mycomponent = (props) => {
  console.log('props', props);
  console.log(Object.getOwnPropertyDescriptor(props));

  return (
    <>
      <div>나의 멋진 마이 컴퍼넌트 </div>
      <div>{props.name}님 반갑습니다 </div>
      <div>내가 좋아하는 숫자는 {props.number}이야 </div>
    </>
  );
};
export default Mycomponent;
