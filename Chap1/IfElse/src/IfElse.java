/**
 * if (조건부분 1) {
 *     // 조건 부분 1 true -> 수행 부분 1 실행
 *     // 조건 부분 1 false -> 다음 조건으로 넘어감
 *     // 수행 부분 1
 * } else if (조건 부분 2) {
 *     // 조건 부분 2 true -> 수행 부분 2 실행
 *     // 조건 부분 2 false -> 다음 조건으로 넘어감
 *     // 수행 부분 2
 * } else if (조건 부분 3) {
 *     // 조건부분 3 true -> 수행 부분 3 실행
 *     // 조건부분 3 false -> 다음 조건으로 넘어감
 *     // 수행 부분 3
 * } else {
 *     // 상위 조건 모두 false인 경우 else의 수행 부분을 처리한다.
 *     // else 수행 부분
 * }
 *
 */


public class IfElse {
    public static void main(String[] args) {
        int temp = 30;

        if (temp <= 5) {
            System.out.println("내복과 긴팔과 자켓을 입으세요");
        }
        else if (temp <= 10){
            System.out.println("긴팔과 자켓을 입으세요.");
        }
        else if (temp <= 15) {
            System.out.println("긴팔을 입으세요");
        }
        else {
            System.out.println("반팔을 입으세요.");
        }
    }
}
