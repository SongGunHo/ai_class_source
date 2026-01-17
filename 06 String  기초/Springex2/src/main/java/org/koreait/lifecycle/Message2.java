package org.koreait.lifecycle;

public class Message2 {
    // 초기화 단계에서 설정
   public void init(){
       System.out.println("init()");
   }
   // 소멸 단계에서 설정
   public void close(){
       System.out.println("close()");
   }
}
