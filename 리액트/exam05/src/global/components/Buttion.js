import styled, { css }   from "styled-components";


const commonstyle = css`
  border: 0;
  background: ${({ bg }) => bg};
  color: ${({ color }) => color};
  ${({border}) => border && css`
    border : 3px solid #000  
  `}
`;

export const SmallButton = styled.button`
    min-width : 800px;
    height: 50px;
    border :0;
    background:${({bg})=>bg};
   color: ${({ color }) => color};
`;

export const MediumButtion = styled.button`
  min-width: 150px;
  height: 95px;
  border: 0;
  background: ${({ bg }) => bg};
  color: ${({ color }) => color};
`;

