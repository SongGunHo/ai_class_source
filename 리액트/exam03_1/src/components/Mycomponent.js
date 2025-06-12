import { Component } from 'react';

class MyComponent2 extends Component {
  render() {
    console.log('props', this.props);
    console.dir(Object.getOwnPropertyDescriptors(this.props));
    console.log('extensible', Object.isExtensible(this.props));
    
    return <h1>나의 멋진 컴포넌트(클래스형)</h1>;
  }
}

export default MyComponent2;
