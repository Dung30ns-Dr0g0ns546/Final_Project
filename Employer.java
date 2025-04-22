import java.util.*;
import java.io.*;

public class Admin extends User implements HasMenu , Serializable{

    public String menu(){
		Scanner input = new Scanner(System.in);

        System.out.println("0) Exit This Menus");
        System.out.println("1) Full Customer Report");
        System.out.println("2) Add User");
        System.out.println("3) Remove User");

        System.out.println();
        System.out.println("Please enter 0-3: ");

        String result = input.nextLine();
        return result;
    }

    public void start(){
        
    }




    public String getReport(){
        return String.format("UserName: %s\nPassword: %s\n",userName,passWord);
    }
}
