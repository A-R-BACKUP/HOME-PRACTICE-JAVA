/**
 * if가 true와 false로 흐름을 나눈다면 switch는 조건식의 결과 값에 따라 흐름이 나누어진다.
 *
 * int i = 10;
 * if (i % 3 == 0) { // i < 20 : 불린 식
 *     System.out.println("C 구역입니다.");
 * } else if (1 % 3 == 1) {
 *     System.out.println("A 구역입니다.");
 * } else {
 *     System.out.println("B 구역입니다.");
 * }
 *
 * if를 사용한 위의 코드를 switch로 아래 처럼 간단하게 쓸 수 있다.
 *
 * switch (i % 3) { // i : 불린이 아닌 식
 *     case 0:
 *         System.out.println("C 구역입니다.");
 *         break;
 *     case 1:
 *         System.out.println("A 구역입니다.");
 *         break;
 *     default:
 *         System.out.println("B 구역입니다.");
 *         break;
 * }
 *
 * 참고로 default: 는 case 중에 이외 조건이 생길 때만 써도 되며 case 이외 조건이 생기지 않는 코드에서는 쓰지 않아도 된다.
 */


public class Switch {
    public static void main(String[] args) {
        /*
        A+  :   100
        A   :   90~99
        B   :   80~89
        C   :   70~79
        D   :   60~69
        F   :   0~59
        점수에 따라 등급을 출력해줘야 함.
         */
        int score = 70;

        // 등급을 줄 String 정의
        String grade;

        switch (score / 10) {
            case 10:
                grade = "A+";
                break;
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default:
                grade = "F";
                break;
        }

        System.out.println(grade);

        switch (grade) {
            case "A+":
            case "A":
            case "B":
                System.out.println("참 잘했어요!");
                break;
            case "C":
            case "D":
                System.out.println("조금만 더 노력해 볼까요?");
                break;
            case "F":
                System.out.println("Fail 입니다.");
            default:
                System.out.println("다시 수강해주세요");
                break;
        }

    }
}
