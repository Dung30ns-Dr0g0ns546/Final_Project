import java.util.Scanner;

class Employee extends User{
	
	Resume resume = new Resume();

	public Employee(){
		this.userName = "John Doe";
		this.passWord = "ABCD";
	}

	public Employee(String usernName, String passWord){
		this.userName = userName;
		this.passWord = passWord;
	}

	public void start(){
		boolean keepGoing = true;
		while (keepGoing){
			String result = menu();
			if (result.equals("0")){
				keepGoing = false;
			} else if (result.equals("1")){
				
			} else if (result.equals("2")){
				
			} else if (result.equals("3")){
				changePassWord();
			} else {
				System.out.println("Please enter 0-3");
			}

		}
	}

	public String menu(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("0) Exit");
        System.out.println("1) Manage Resume");
        System.out.println("2) Manage Saving Account");
		System.out.println("3) Change Password");

        System.out.println();
        System.out.println("Please enter 0-3: ");

        String result = input.nextLine();
        return result;
	}

	public void changePassWord(){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter New Password: ");

		String newPassWord = input.nextLine();
		
		if (newPassWord.equals(passWord)){
			System.out.println("Incorrect. You have entered your current password. Try again.");
		} else {
			System.out.println("New password has been set.");
		}
	}

	public String getReport(){
        return String.format("UserName: %s\nChecking: %s\nSaving: %s",userName, checking, savings);
	}
}	
