import java.util.Scanner;

abstract class User implements HasMenu{

	String userName; 
	String passWord;

	public boolean login(){
		boolean output = false;
		Scanner input = new Scanner(System.in);

		System.out.println("Please input username.");
		String userNameResult = input.nextLine();

		if(userName.equals(userNameResult)){
			
			System.out.println("Please input password.");
			String passWordResult = input.nextLine();

			if(passWord.equals(passWordResult)){
				output = true;
			}else{
				System.out.println("Password is not correct");
			}
		}else{
			System.out.println("Username is not correct");
		}
		return login();
	}

	public boolean Login(String userName, String passWord){
		return true;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

    public String getUserName(){
		return this.userName;
	}
    
	public void setPassWord(String passWord){
		this.passWord = passWord;
	}

    public String getPassWord(){
		return this.passWord;
	}
    	
	public abstract String getReport();
}
