import java.util.*;
import java.io.*;

public class Employer extends User implements HasMenu{

    public String menu(){
		Scanner input = new Scanner(System.in);

        System.out.println("0) Exit This Menu");
        System.out.println("1) Full Employee Report");
        System.out.println("2) Add User");
        System.out.println("3) Remove User");
        System.out.println("4) Post Job Opening");

        System.out.println();
        System.out.println("Please enter 0-4: ");

        String result = input.nextLine();
        return result;
    }

    public void start(){
        
    }

    public String getReport(){
        return String.format("UserName: %s\nPassword: %s\n",userName,passWord);
    }
}
