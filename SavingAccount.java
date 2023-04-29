public class SavingAccount{
public static double annualInterestRate;
private double savingBalance;

public SavingAccount(double savingBalance){
    this.savingBalance = savingBalance;
}

public double calculateMonthlyInterest(){
    double interest = (this.savingBalance * annualInterestRate) / 12;

    
    return this.savingBalance +=interest;

}

public static void modifyInterestRate(double air){
    annualInterestRate = air;
}

public String tostring(){
    return String.format("SavingAccount[savingBalance = $%.2f]",savingBalance);

}
}