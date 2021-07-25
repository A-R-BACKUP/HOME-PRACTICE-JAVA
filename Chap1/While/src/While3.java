public class While3 {
    public static void main(String[] args) {
        int sum = 0, i = 1;

        while (true) {
            if (sum >= 10000) {
                break;
            }

            sum += i;
            i++;
        }

        System.out.println(sum);
        System.out.println(i - 1);
    }
}
