import java.util.Scanner;

public class CheckingAccount implements HasMenu{

    double balance; 


    public String menu(){
        Scanner input = new Scanner(System.in);

        System.out.println("0) Exit");
        System.out.println("1) Check balance");
        System.out.println("2) Make a deposit");
        System.out.println("3) Make a withdrawal");

        System.out.println();
        System.out.println("Please enter 0-3: ");

        String result = input.nextLine();
        return result;
     
    }   

      public void start(){
        boolean keepGoing = true;
		while (keepGoing){
			String result = menu();
			if (result.equals("0")){
				keepGoing = false;
			} else if (result.equals("1")){
				getBalanceString();
			} else if (result.equals("2")){
			makeDeposit();
		} else if (result.equals("3")){
            makeWithdrawal();
        } else {
			System.out.println("Please enter 0-2");
			}
		}
    }

    public double getBalance(){
        return this.balance;
    }

    public String getBalanceString(){
        String result = String.format("$%f", balance);
        return result;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void checkBalance(){
        System.out.println("Current balance: " + this.getBalanceString());
    }

    public void makeDeposit(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Making a deposit...");
        System.out.println("How much do you want to deposit?: ");
        Double depositResult = input.nextDouble();
        this.balance += depositResult;
    }

    public void makeWithdrawal(){
        Scanner input = new Scanner(System.in);

        System.out.println("Making a withdrawal...");
        System.out.println("How much do you want to withdrawal?: ");
        Double withdrawalResult = input.nextDouble();
    }    

}
