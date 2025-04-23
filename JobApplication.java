import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JobApplication implements HasMenu {
	Employer employer = new Employer();

	private ArrayList<Employee> employees = new ArrayList<>();


	public static void main(String[] args){
		new JobApplication();
	}

	public JobApplication(){
		this.loadEmployees();
		this.start();
		this.saveEmployees();

	}

	public void saveEmployees(Employee employees){
		employee.add(employees);
        System.out.println("Employees saved: " + employee.getUserName());
	}

	public void loadEmployees(){
		employee.add(new Employee("Alice", "ABCD"));
		employee.add(new Employee("Bob", "EFGH"));
		employee.add(new Employee("Cindy", "IJKL"));

	}

	public void fullEmployeeReport(){
		if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Employee employee : employees) {
                System.out.println(employees);
            }
        }
	}

	public void addUser(){
		if (employees != null) {
			employees.add(employees);
			System.out.println("User " + user.getUserName() + " added successfully.");
	   } else {
		   System.out.println("Invalid user data. Cannot add to bank.");
	   }
    }

	public void removeUser(){
		
	}

	public String menu(){
		Scanner input = new Scanner(System.in);

		System.out.println("0) Exit System");
        System.out.println("1) Login as Employer");
        System.out.println("2) Login as Employee");

        System.out.println();
        System.out.println("Please enter 0-2: ");

        String result = input.nextLine();
        return result;
	}

	public void loginAsEmployee(){
		Scanner input = new Scanner(System.in);

		System.out.print("User Name: ");
		String userNameIn = input.nextLine();
		System.out.print("Password: ");
		String passWordIn = input.nextLine();

		Customer currentEmployee = null;
		for (Employee employee: employees){
			if (employee.login(userNameIn, passWordIn)){
				currentEmployee = employee;
			}
		}

		if (currentEmployee == null){
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
				if (employer = true);
				loginAsEmployer();
			} else if (result.equals("2")){
			loginAsEmployee();
		} else {
			System.out.println("Please enter 0-2");
			}
		}
	}

	public void loginAsEmployer(){
		boolean keepGoing = true;
		while (keepGoing){
			String response = employer.menu();
			if (response.equals("0")){
				keepGoing = false;
			} else if(response.equals("1")){
				System.out.println("Full Employee Report");
				this.fullEmployeeReport();
			} else if (response.equals("2")){
				System.out.println("Add user");
				this.addUser();
			} else if (response.equals("3")){
				System.out.println("Remove User");
				this.removeUser();
			} else if (response.equals("4")){
				System.out.println("Post Job Opening");
				this.postJobOpening();
			} else {
				System.out.println("Please enter 0-4");
			}
		}
	}

}
