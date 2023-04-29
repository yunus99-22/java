import java.util.Scanner;

public class TestSavingAccount{

    public static void main(String[]args){
        Scanner Rate = new Scanner(System.in);

        System.out.print("enter annual enterst rate(eg 4% 0.04):");
        double annualInterestRate = Rate.nextDouble();

        System.out.print("enter annual interest rate AGAIN(eg 4% 0.04):");
         double annualInteres = Rate.nextDouble();

        SavingAccount saver1 = new SavingAccount(2000);
        SavingAccount saver2 = new SavingAccount(3000);

        SavingAccount.modifyInterestRate(annualInterestRate);
        System.out.println("the annualInterestRate for second one(in saver1) is " +saver1.calculateMonthlyInterest());
         System.out.println("the annualInterestRate for second one(in saver2) is " +saver2.calculateMonthlyInterest());


    }
}