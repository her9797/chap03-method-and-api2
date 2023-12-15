package com.ohgiraffers.section01.method;

public class Application5 {
    public static void main(String[] args) {
//
//        app5.plusTwoNumbers();
//        app5.minusTwoNumbers();
//        app5.multipeTwoNumbers();
//        app5.divideTwoNumbers();
        /*
           [ 간단한 계산기 만들기 ]
           매개변수와 리턴값을 복합적으로 이용하여
        *  매개변수와 리턴값이 모두 존재하는 메소드를 만들어 보자. */


        int firstNum = 20;
        int secondNum = 10;

        Application5 app5 = new Application5();


        System.out.println("두 수를 더하기 : " + app5.plusTwoNumbers(firstNum, secondNum));
        System.out.println("두 수를 빼기 : " + app5.minusTwoNumbers(firstNum, secondNum));
        System.out.println("두 수를 곱하기 : " +  app5.multipleTwoNumbers(firstNum, secondNum));
        System.out.println("두 수를 나누기 : " + app5.divideTwoNumbers(firstNum, secondNum));

    }

    public int plusTwoNumbers(int firstNum, int secondNum) {
        return (firstNum + secondNum);

    }

    public int minusTwoNumbers(int firstNum, int secondNum) {
        return (firstNum - secondNum);
    }

    public int multipleTwoNumbers(int firstNum, int secondNum) {
        return (firstNum * secondNum);
    }


    public int divideTwoNumbers(int firstNum, int second) {
        return (firstNum / second);
    }
}
