/**
 * while (조건 부분) {
 *   수행 부분
 * }
 *
 * 조건을 충족 하거나, 충족 할 때까지 수행 부분을 반복한다
 *
 */


public class While {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i <= 3) {
            sum = sum + i;
            i = i + 1;
        }
        System.out.println(sum);
    }
}
