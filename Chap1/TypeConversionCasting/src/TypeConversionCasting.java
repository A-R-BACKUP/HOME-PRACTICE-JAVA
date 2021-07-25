/**
 * 숫자형 랭킹 (위에서부터 아래로)
 * double   8 byte	4.940656458412465 x 10^-324 ~~ 1.797693134862316 x 10^308
 *
 * float    4 byte	1.4023985 x 10^-45 ~~ 3.4028235 x 10^38
 *
 * long 8 byte	-9,223,372,036,854,775,808 ~~ 9,223,372,036,854,775,807
 *
 * int  4 byte	-2,147,483,648 ~~ 2,147,483,647
 *
 * short    2 byte    -32,768 ~~ 32,767
 *
 * byte     1 byte	 -128 ~~ 127
 *
 * 아래에서 위로 형 변환을 할 때는 문제가 없지만
 * 위에서 아래로 형 변환을 시도 할 때에는 타입캐스팅을 이용해야 한다.
 */

/**
 * Literal (리터럴) : 소스코드의 고정된 값을 대표하는 용어.
 *
 *  ex> int myInt = 123;
 *  ex> byte myByte = 38;
 *  ex> short myShort = 2;
 *
 *  -> 여기서 123, 38, 2는 정수 리터럴이다. int 자료형이지만 byte나 short 변수의 초기값으로 설정하면 잘 들어감.
 *
 *
 *  long myLong = 12345678910; --> long myLong = 12345678910L;
 *
 *  여기서 12345678910은 int 리터럴이라서 오류가 난다.
 *  이 문제를 해결하기 위해서는 뒤에 L을 넣어주면 된다.
 *  12345678910L은 정수 리터럴이 아닌 롱 리터럴이다.
 *
 *  L뿐만 아니라 아래처럼 끝에 f와 d가 들어갈 수도 있다...
 *
 *  long e = 123;
 *  long f = 123L;   // long의 리터럴 표현방법
 *
 *  float g = 3.14;  // 오류: 소수를 넣으면 기본적으로 double로 인식하기 때문에 f를 넣어줘야 한다.
 *  float h = 3.14f; // float의 리터럴 표현방법
 *  float i = 314f;  // float의 리터럴 표현방법
 *
 *  double j = 3.14;
 *  double k = 314d; // double의 리터럴 표현 방법
 *
 *  기본적으로 소수형은 double로 인식함. 물론 double을 명시하는 리터럴로 d를 붙여줄 수도 있다.
 *
 */

public class TypeConversionCasting {
    public static void main(String[] args) {
        double x = 3.14;
        //int y = x; <- 이렇게 형변환을 시도하면 동작하지 않는다. 아래 처럼 (변환할 형)을 추가해주면 정상적으로 형이 변환 된다.
        int y = (int) x;

        System.out.println(y);

        System.out.println(" ");
        System.out.println(" ");

        int v = 9;
        int w = 5;
        System.out.println("int: " +  v / w);
        System.out.println("double: " + (double) v / w);

        // int형의 나눗셈을 소수형으로 보고 싶을 때는 위 처럼 타입캐스팅 해주면 된다.

        /** 숫자형 변환
         * 바꾸고자 하는 형이 기존의 형보다 큰 경우 문제없이 형을 변환 할 수 있다*/

        int a = 36;
        double b = a;     // int to double

        short c = 17;
        long d = c;       // short to long

        float e = 3.14f;
        double f = e;     // float to double

        /** 바꾸고자 하는 형이 기존의 형보다 작은 경우 ((int) x) <-- 처럼 변수 앞에 숫자형을 넣어서 변환이 가능.
         * 소수형에서 정수형으로 바꾸는 경우 데이터 손실이 있을 수 있다.
         * */

        int g = 3;
        double h = (double) g;
        long i = (long) g;

        System.out.println(" ");
        System.out.println("Type Casting");
        System.out.println(h);
        System.out.println(i);

        System.out.println(" ");
        System.out.println("데이터 손실 예시");
        double pi = 3.14;
        int myInt = (int) pi; // 데이터 손실 (소수 부분)
        System.out.println(myInt);
    }
}
