public class Account{
    private int accountBalance;

    public Account(int balance){
        if(balance >= 0){
            accountBalance = balance;
        }else{
            System.out.println("The balance was invalid");
            accountBalance = 0;
        }
    }

    public void credit(int addBalance){
        if(addBalance >= 0){
            accountBalance += addBalance;
        }else{
            System.out.println("The balance was invalid");
        }
    }
    public void debit(int withdraw){
        if(withdraw <= accountBalance){
            accountBalance -= withdraw;
        }else{
            System.out.println("Sorry, Debit amount exceeded account balance");
        }
    }
    public int getBalance(){
        return accountBalance;
    }
    public static void main(String[] args){
        System.out.println("First Account:\n");
        Account ac1 = new Account(0);
        ac1.credit(400000);
        ac1.debit(250000);
        System.out.println("My current Balance is: "+ac1.getBalance()+"\n");
        
        System.out.println("Second Account:\n");
        Account ac2 = new Account(0);
        ac2.credit(-2000);
        ac2.debit(1000);
        System.out.println("My current Balance is: "+ac2.getBalance());

    }
}