public class Scoreaveragetest {
    public static void main(String[] args) {
        int koreanScore = 86, mathScore = 94, scienceScore = 87, computerScore = 100;
        double average;

        average = ((double) (koreanScore + mathScore + scienceScore + computerScore) / 4);

        System.out.println(average);
    }
}
