import java.util.Scanner;

class Employee extends User implements HasMenu {
	
	private Resume resume = new Resume();
	private JobOpening openings = new JobOpening();
	private static final Scanner input = new Scanner(System.in);

	public Employee(){
		this.userName = "John Doe";
		this.passWord = "ABCD";
	}

	public Employee(String userName, String passWord){
		this.userName = userName;
		this.passWord = passWord;
	}

	public boolean login(String userName, String passWord) {
        return this.userName.equals(userName) && this.passWord.equals(passWord);
    }

	public void start(){
		boolean keepGoing = true;
		while (keepGoing){
			String result = menu();
			if (result.equals("0")){
				keepGoing = false;
			} else if (result.equals("1")){
				resume.start();
			} else if (result.equals("2")){
				openings = new JobOpening();
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
        System.out.println("2) Look Through Job Openings");
		System.out.println("3) Change Password");

        System.out.println();
        System.out.println("Please enter 0-3: ");

        String result = input.nextLine();
        return result;
	}

	public String getUserName(){
        return this.userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
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
        return String.format("UserName: %s\nResume: %s\nCurrent Job: %s",userName, resume, openings);
	}
}	
