package com.ohgiraffers.section01.method;

public class Application2 {

    public static void main(String[] args) {

        System.out.println("오늘은 저의 생일 입니다 (main() start)");

        Application2 app2 = new Application2();

        System.out.println("참여해주셔서 다들 감사합니다.(main() end)");
        app2.methodA();
        app2.methodB();
        app2.methodC();

    }

    public void methodA() {
        System.out.println("민섭님이 가장 먼저 찾아와 주었습니다.");

        System.out.println("민섭님을 끝으로 모두 자리로 돌아갔습니다.");

    }

    public void methodB() {
        System.out.println("인호님을 조심스럽게 초대합니다..");

        System.out.println("인호님이 배가 아프다며 돌아갑니다..");
    }

    public void methodC() {
        System.out.println("준표님이 갑자기 찾아왔습니다..");

        System.out.println("준표님이 갑자기 화를 냈습니다..");

    }
}
