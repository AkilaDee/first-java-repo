public class TestBank {

    public static double getRandom() {
        return Math.random() * 1_000_001;
    }

    static String branch = "Kandy";

    public static void main(String[] args) {
        // 5th question
        System.out.println();
        Savings savings = new Savings((int) getRandom(), "Dimuthu Lakmal", branch);
        Current current = new Current((int) getRandom(), "Dimuthu Lakmal", branch);
        FD fd = new FD((int) getRandom(), "Dimuthu Lakmal", branch);

        System.out.println();
        System.out.println("Updated balance is : " + savings.cashDeposit(100_000));
        System.out.println("Updated balance is : " + current.cashDeposit(100_000));
        System.out.println("Updated balance is : " + fd.cashDeposit(100_000));

        // 6th question
        System.out.println();
        System.out.println("Current Balnce is : " + savings.getBalance());
        System.out.println("Current Balnce is : " + current.getBalance());
        System.out.println("Current Balnce is : " + fd.getBalance());

        // 7th question
        System.out.println();
        System.out.println("Updated balance is : " + savings.cashDeposit(2_000));
        System.out.println("Updated balance is : " + current.cashDeposit(2_000));
        System.out.println("Updated balance is : " + fd.cashDeposit(2_000));

        // 8th question
        System.out.println();
        System.out.println(savings.toString());
        System.out.println(current.toString());
        System.out.println(fd.toString());

        // 9th question
        System.out.println();
        System.out.println("Interset for this year : " + savings.calInterest());
        System.out.println("Interset for this year : " + current.calInterest());
        System.out.println("Interset for this year : " + fd.calInterest());

        System.out.println();
        System.out.println("Updated balance is : " + savings.cashDeposit(2_000));
        System.out.println("Updated balance is : " + current.cashDeposit(2_000));
        System.out.println("Updated balance is : " + fd.cashDeposit(2_000));

        // Print final accout details
        System.out.println();
        System.out.println(savings.toString());
        System.out.println(current.toString());
        System.out.println(fd.toString());

        System.out.println();

    }
}