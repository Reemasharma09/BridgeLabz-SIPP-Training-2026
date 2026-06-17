public class Day2 {
    public static void main(String[] args) {
        double[] income = {8000, 12000, 25000, 60000, 9000, 45000, 70000, 30000, 100000, 5000};
        double totalTax = 0;
        System.out.println("Income\t\tTax Bracket\tTax Amount");
        for (int i = 0; i < income.length; i++) {
            double tax = 0;
            String bracket = "";
            if (income[i] < 10000) {
                bracket = "5%";
                tax = income[i] * 0.05;
            }
            else if (income[i] <= 50000) {
                bracket = "15%";
                tax = income[i] * 0.15;
            }
            else {
                bracket = "30%";
                tax = income[i] * 0.30;
            }
            totalTax += tax;
            System.out.println(income[i] + "\t" + bracket + "\t\t" + tax);
        }
        System.out.println("\nTotal Tax Collected = " + totalTax);
    }
}