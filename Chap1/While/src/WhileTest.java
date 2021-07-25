// 10000 미만의 정수 중에서, 153의 배수중 가장 큰 값을 찾아 출력하시옿.

public class WhileTest {
    public static void main(String[] args) {
        int num = 10000;
        int key = 153;
        int x = 0;
        int i = 1;

        while (x < num) {
            x = (key * i);
            i++;
        }

        System.out.println(x - key);
    }
}
