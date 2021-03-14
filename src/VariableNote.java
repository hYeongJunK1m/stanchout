public class VariableNote {

   public static void main(String[] args) {

       //변수 기본형
       boolean booleanType = true;
               System.out.println(booleanType);
       // 논리형 → boolean = true와 false 중 하나의 값을 갖고 참과 거짓을 판단. 기본값 false 논리식, 조건식
       char charType ='!'; //문자, 숫자 1개만 입력 가능
            System.out.println(charType);
       // 문자형 → char = 문자를 저장할때 사용 ex) char charType ='a'; 2byte 크기, 65536개의 값 표현
       //                문자를 나타내는 정수 값이 저장되고 출력을 문자로 표현
       byte byteType = 127;
       short shortType = 32767;
       int intType = 214;
       long longType =9223372036854775807L;
       System.out.println(byteType);
       System.out.println(shortType);
       System.out.println(intType);
       System.out.println(longType);
       // 정수형 → byte = 127;, short = 32767;, int = 214;, long =9223372936854775807L;
       //                int와 long을 많이 사용 long 사용시 끝에 L;을 붙여야 한다. 대소문 상관(대문자 권장)
       float floatType = 3.4028235E38F;
       double doubleType = 1.7976931348623157E308;
       System.out.println(floatType);
       System.out.println(doubleType);
       // 실수형 → float(4b), double(8b) = 4byte와 8byte로 int, long과 동일하며 크기도 같지만, 소수점까지 표현가능
       //                                 실수형 float도 long과 같이 F를 붙여야 한다. double은 따로 붙이지 않고 사용한다.

   }
}
