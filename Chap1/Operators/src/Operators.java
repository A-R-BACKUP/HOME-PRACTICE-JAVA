public class Operators {
    public static void main(String[] args) {
        /** 문자열 연산
         * 아래처럼  문자열 사이에 + 를 넣어 문자열 연결 가능.
         * 문자열과 숫자를 더하면 숫자가 저절로 문자열로 변경 됨.
         * 문자열과 불린을 더하면 불린이 저절로 문자열로 바뀐다
         */

        System.out.println("I am " + 23 + "years old.");
        System.out.println("This result is " + true + ".");

        System.out.println(" ");
        System.out.println(" ");


        /** 문자열 내부에 "를 넣고 싶다면 \" 를 사용하며면 된다*/

        System.out.println("손정의 회장은 \"자신의 한계는 자신의 생각이 결정해 버리는 것이다.\" 라고 말했다.");

        /** Escape Character 이스케이프 문자
         *  \t	탭
         *  \b	백스페이스
         *  \n	줄 바꿈 (new line)
         *  \r	줄 바꿈 (carriage return)
         *  \f	폼 피드(form feed)
         *  '	작은 따옴표
         *  "	큰 따옴표
         *  \	역슬래쉬
         */

        System.out.println(" ");
        System.out.println(" ");


        System.out.println("숫자 연산자");
        int a = 9;
        int b = 5;
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));
        System.out.println("-a : " + -a); //양, 음의 부호가 바뀜
        System.out.println("++a : " + ++a); // a에 1을 추가
        System.out.println("--a : " + --a); // a에 1을 감소
        /**
         * 위의 -a, ++a, --a는 명령들이 독립적으로 작동하는 것이 아닌 계속 a의 값이 바뀌는 것이다.
         * -9 --> 이때의 a값 앞에 -가 붙었을 뿐이다 -와 a값은 별개라는 소리.
         * 10 --> a값은 9이므로 ++a는 a=a+1과 같은 것이므로 10이 된다
         * 9 --> 10에서 1을 뺐으니까 9가 된다.
         * 아래에 추가적인 코드 넣어놓겠음.
         */

        System.out.println(" ");
        System.out.println(" ");

        int z = -3;

        System.out.println("-z : " + -z); //양, 음의 부호가 바뀜
        System.out.println("++z : " + ++z); // z에 1을 추가
        System.out.println("z check : " + z); // 실제로 z의 값이 변경 되었다.
        System.out.println("--z : " + --z); // z에 1을 감소

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("숫자 연산자 II");
        int c = 9;
        double d = 5.0;
        System.out.println(c + " + " + d + " = " + (c + d));
        System.out.println(c + " - " + d + " = " + (c - d));
        System.out.println(c + " * " + d + " = " + (c * d));
        System.out.println(c + " / " + d + " = " + (c / d));
        System.out.println(c + " % " + d + " = " + (c % d));
        System.out.println("피연산자 중에 하나라도 소수형이 있으면 결과 값은 소수형으로 나온다.");
        // 형들끼리도 우선 순위가 있는것으로 보임.

        System.out.println(" ");
        System.out.println(" ");


        /**\
         * System.out.println(a > b);  // a가 b보다 크다
         * System.out.println(a >= b); // a가 b보다 크거나 같다
         * System.out.println(a < b);  // a가 b보다 작다
         * System.out.println(a <= b); // a가 b보다 작거나 같다
         * System.out.println(a == b); // a는 b와 같다
         * System.out.println(a != b); // a는 b와 같지 않다
         */

        System.out.println("비교 연산자");
        System.out.println(3 + " > " + 2 + " : " + (3 > 2));
        System.out.println(3 + " < " + 2 + " : " + (3 < 2));
        System.out.println(3 + " >= " + 2 + " : " + (3 >= 2));
        System.out.println(3 + " <= " + 2 + " : " + (3 <= 2));
        System.out.println(3 + " == " + 2 + " : " + (3 == 2));
        System.out.println(3 + " != " + 2 + " : " + (3 != 2));

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("불린 연산자 - and"); //  false가 하나라도 있으면 false
        System.out.println("true && true : " + (true && true));
        System.out.println("true && false : " + (true && false));
        System.out.println("false && true : " + (false && true));
        System.out.println("false && false : " + (false && false));

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("불린 연산자 - or"); //  True가 하나라도 있으면 True
        System.out.println("true || true : " + (true || true));
        System.out.println("true || false : " + (true || false));
        System.out.println("false || true : " + (false || true));
        System.out.println("false || false : " + (false || false));
        System.out.println("false || false : " + (false || false));

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("불린 연산자 - not ! "); // !연산은 불린값을 반대로 바꾼다.
        System.out.println("!true : " + !true);
        System.out.println("!false : " + !false);

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("마지막으로 머리 아픈거");
        System.out.println("!(false && (true || false)): " + !(false && (true || false)));

    }
}
