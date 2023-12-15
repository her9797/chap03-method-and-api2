package com.ohgiraffers.section01.method;

public class Application3 {

    public static void main(String[] args) {

        /*
        * [ 변수의 종류 ]
        * 1. 지역변수
        * 2. 매개변수
        * 3. 전역변수 (필드)
        * 4. 클래스(static) 변수
        *
        * 지역변수는 선언한 메소드 블럭 내부에서만 사용이 가능하다. 이것을 지역변수의 스코프라고 한다.
        * 서로 다른 메소드 간 공유해야 하는 값이 존재하는 경우, 메소드 호출 시 사용하는 괄호를 이용해 값을 전달할 수 있다.
        * 이 때, 전달하는 값을 전달인자(argument)라고 부르고,
        * 메소드 선언부 괄호 안에 전달인자를 받기 위해 선언하는 변수를 매개변수(parameter)라고 부른다.
        *
        * */

        Application3 app3 = new Application3();

        /* 1. 호출하려는 메소드의 매개변수 선언부에 미리 선언해둔 자료형, 객수, 순서가 일치하도록 값을 넣어 호출해야 한다.*/
        app3.testMethod(100);
//        app3.testMethod("100")
//        app3.testMethod(100, 300, 400);

        /* 2. 전달인자로 변수에 저장한 값 전달하기 */
        /* 2-1. 변수에 저장된 값을 이용하여 값을 전달할 수 있다. */
        int acorns = 20;
        app3.testMethod(acorns);

        /* 2-2. 자동 형변환을 이용하여 값을 전달할 수 있다. */
        byte bAcorns = 15;
        app3.testMethod(bAcorns);

        /* 2-3. 강제 형변환을 이용하여 값을 전달할 수 있다. */
        long lAcorns = 1000;
        app3. testMethod((int) lAcorns);

        /* 2-4. 연산 결과를 이용해서 값을 전달할 수 있다. */
        app3.testMethod(acorns * 1000);
        app3. testMethod((int) lAcorns);


        /* 3. 여러 개의 매개변수를 가진 매소드 호출 */
        /* 3-1. 여러 개의 매개변수를 가진 메소드를 호출한다.(순서를 주의)*/
        app3.testMethod2("민섭", 70, 'A');

        /* 3-2. 변수에 저장된 값을 전달하며 호출할 수 있다. */
        String myName = "민섭";
        int myHeight = 70;
        char myBlood = 'A';



    }


        public void testMethod(int acorns) {
            System.out.println("가진 도도리 : " + acorns + "개야");

        }

        public void testMethod2(String name, int height, char blood) {
            System.out.println("나는 다람쥐" + name + "이다! 나는 키가" + height + "cm야" + blood + "형이야");

        /*
        * 매개변수도 일종의 지역변수로 분류된다.
        * 따라서 매개변수 역시 final 키워드를 사용할 수 있다.
        * 지역변사에 final 키워드르 붙여 상수를 만드는 것과 동일하다.
        * final 매개변수는 상수 네이밍 규칙을 선택적으로 따르는 경향이 있다.
        * */
    }

}
