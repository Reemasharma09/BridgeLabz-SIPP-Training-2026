import java.util.Random;

public class VotingEligibility {

    public static void main(String[] args) {

        Random random = new Random();

        System.out.println("Age\tCan Vote");

        for (int i = 1; i <= 10; i++) {

            int age = random.nextInt(90) + 10;

            boolean canVote = age >= 18;

            System.out.println(age + "\t" + canVote);
        }
    }
}