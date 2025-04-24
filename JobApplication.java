import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JobApplication implements HasMenu {
	Employer employer = new Employer();
	Employee employee = new Employee();

	private ArrayList<Employee> employees = new ArrayList<Employee>();

	public static void main(String[] args){
		new JobApplication();
	}

	public JobApplication(){
		this.loadEmployees();
		this.start();
		this.saveEmployees();

	}

	public void saveEmployees(){
		for (Employee employee : employees) {
			System.out.println("Employee saved: " + employee.getUserName());
		}
	}

	public void loadEmployees(){
		employees.add(new Employee("Alice", "ABCD"));
		employees.add(new Employee("Bob", "EFGH"));
		employees.add(new Employee("Cindy", "IJKL"));

	}

	public void fullEmployeeReport() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            for (Employee employee : employees) {
                System.out.println("Name: " + employee.getUserName());
            }
		}
	}

	public void addUser(){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Username: ");
		String name = input.nextLine();
		System.out.print("Enter Password: ");
		String password = input.nextLine();
		Employee newEmployee = new Employee(name, password);
		employees.add(newEmployee);
		System.out.println("Employee " + name + " added successfully.");
	}

	public void removeUser(){
	    Scanner input = new Scanner(System.in);

    	System.out.print("Enter Username to remove: ");
    	String userName = input.nextLine();
    	boolean removed = employees.removeIf(e -> e.getUserName().equals(userName));
    	if (removed) {
        	System.out.println("Employee " + userName + " removed.");
    	} else {
        	System.out.println("Employee not found.");
    	}
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
	
		Employee currentEmployee = null;
		for (Employee employee : employees) {
			if (employee.login(userNameIn, passWordIn)) {
				currentEmployee = employee;
				break;
			}
		}
	
		if (currentEmployee != null) {
			System.out.println("Login successful. Welcome, " + currentEmployee.getUserName());
			employee.start();
		} else {
			System.out.println("Login failed. Please check your credentials.");
		}
	}

	public void start(){
		boolean keepGoing = true;
		while (keepGoing){
			String result = menu();
			if (result.equals("0")){
				keepGoing = false;
			} else if (result.equals("1")){
				loginAsEmployer();
			} else if (result.equals("2")){
				loginAsEmployee();
			} else {
				System.out.println("Please enter 0-2");
			}
		}
	}

	public void postJobOpening(){
	JobOpening jobOpening = new JobOpening();


    System.out.println("Posting a new job opening...");
    jobOpening.start();

    System.out.println("Job posted successfully!");
    System.out.println("Job Title: " + jobOpening.getTitle());
    System.out.println("Job Description: " + jobOpening.getDescription());
    System.out.println("Job Requirements: " + jobOpening.getRequirements());
    System.out.println("Spots Available: " + jobOpening.getSpotsAvailable());
    System.out.println("Salary: " + jobOpening.getSalary());
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
				System.out.println("Add User");
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
