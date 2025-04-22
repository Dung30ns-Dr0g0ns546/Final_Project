import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank implements HasMenu {
	Admin admin = new Admin();

	private ArrayList<Customer> customers = new ArrayList<>();


	public static void main(String[] args){
		new Bank();
	}

	public Bank(){
		//this.loadSampleCustomers();
		//this.saveCustomers();
		this.loadCustomers();
		this.start();
		this.saveCustomers();

	}

	public void saveCustomers(Customer customer){
		customers.add(customer);
        System.out.println("Customer saved: " + customer.getUserName());
	}

	public void loadCustomers(){
		customers.add(new Customer("Alice", "1234"));
		customers.add(new Customer("Bob", "5678"));
		customers.add(new Customer("Cindy", "2468"));

	}

	public void fullCustomerReport(){
		if (customers.isEmpty()) {
            System.out.println("No customers found.");
        } else {
            for (Customer customer : customers) {
                System.out.println(customer);
            }
        }
	}

	public void addUser(){
		if (customers != null) {
			customers.add(customers);
			System.out.println("User " + user.getUserName() + " added successfully.");
	   } else {
		   System.out.println("Invalid user data. Cannot add to bank.");
	   }
    }

	public void applyInterest(){
		//For loop that goes through every customer and applys interest to it's savings account 
		double interest = balance * interestRate;
        balance += interest;
	}

	public String menu(){
		Scanner input = new Scanner(System.in);

		System.out.println("0) Exit System");
        System.out.println("1) Login as Admin");
        System.out.println("2) Login as Customer");

        System.out.println();
        System.out.println("Please enter 0-2: ");

        String result = input.nextLine();
        return result;
	}

	public void loginAsCustomer(){
		Scanner input = new Scanner(System.in);

		System.out.print("User Name: ");
		String userNameIn = input.nextLine();
		System.out.print("PIN: ");
		String pinIn = input.nextLine();

		Customer currentCustomer = null;
		for (Customer customer: customers){
			if (customer.login(userNameIn, pinIn)){
				currentCustomer = customer;
			}
		}

		if (currentCustomer == null){
			System.out.println();
		}
	}

	public void start(){
		boolean keepGoing = true;
		while (keepGoing){
			String result = menu();
			if (result.equals("0")){
				keepGoing = false;
			} else if (result.equals("1")){
				if (admin = true);
				startAdmin();
			} else if (result.equals("2")){
			loginAsCustomer();
		} else {
			System.out.println("Please enter 0-2");
			}
		}
	}

	public void startAdmin(){
		boolean keepGoing = true;
		while (keepGoing){
			String response = admin.menu();
			if (response.equals("0")){
				keepGoing = false;
			} else if(response.equals("1")){
				System.out.println("Full Customer Report");
				this.fullCustomerReport();
			} else if (response.equals("2")){
				System.out.println("Add user");
				this.addUser();
			} else if (response.equals("3")){
				System.out.println("Apply Interest");
				this.applyInterest();
			} else {
				System.out.println("Please enter 0-3");
			}
		}
	}

}
