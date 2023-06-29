package ch07_클래스;

public class Method01 {
    //이 클래스 내용은 강사님 설명

    /*
    *메서드를 쓰는 이유
     1. 재사용 :
      - ex.파일 저장 메서드 : 메일에서도 쓰고, 클라우드에서도 쓸수있도록 재사용.

     2. 모듈화 : 부속화 시키겠다.(재사용이랑 비슷) 기능별로 분리해서 내가 필요할 때 쓰겠다

     3. 클린코드 : 하나의 메소드는 하나의 기능을 담당해야한다.
      - ex. 회원가입을 해야한다?
        정보를 받는다 -> 아이디 중복확인 -> 정보의 유효성 검사(비밀번호 n자리, 문자규칙 등등)
        정보를 DB에 저장 -> 저장 상태 리턴
         : 이 모든 하나의 메소드로 만들면 보기도 힘들고, 뜯어고치기도 힘들다.
       => 하나씩 나누어서 메소드로 만든다. 중복확인 메소드, 유효성검사 메소드......
       * 이 때 메소드 이름을 잘 작명해야한다!
      //vs 비슷한 개념이지만, 리팩터링(클린코드와 마찬가지로 책제목)이라는 개념과 약간 부딪히기도 함.
     */

    /*
    메소드는 기능을 담당하므로 메소드명 동사로 작명한다. 기능을 파악하기 위해서라면 길어도 된다.
     vs 변수 : 명사, 형용사
     */

    /*
    *메소드의 형식

    반환자료형 메소드명() {
        ......
        return ...;
    } */

    // 오버로딩 : 매개변수의 자료형이 다르면 같은 이름의 메소드를 사용할 수 있다.

    /*
    void test() {
        if(~~~) {
            ...
            return;   //break;랑 비슷한 개념. if에서 빠져나갈때 쓰는 용
        }
     */
}
