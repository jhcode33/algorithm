package programmers.basics.day8;

public class SimpleLogical {
    public static void main(String[] args) {

    }
}

/*
 * 문제를 잘 읽어보면 다음과 같다.
 * ( ) 괄호 안에는 OR 연산자를 통해서 어느 것 하나라도 참이면 True를 반환한다
 * 그 이후 AND 연산을 사용해서 두 조건이 모두 참일 때만 True를 반환한다
 * 즉, 직접 연산을 통한 간단한 비교로 풀 수 있는 문제였다.
 */
class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {

        boolean answer = ( x1 || x2 ) && ( x3 || x4 );
        return answer;

//        boolean operation1 = true;
//        boolean operation2 = true;
//        boolean operation3 = false;
//
//        if (x1 == false && x2 == false) {
//            operation1 = false;
//        }
//
//        if (x3 == false && x4 == false) {
//            operation2 = false;
//        }
//
//        if (operation1 == true && operation2 == true) {
//            operation3 = true;
//        }
//
//        return  operation3;
    }
}