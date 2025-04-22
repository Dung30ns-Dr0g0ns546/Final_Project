import java.util.Scanner;

abstract class Resume implements HasMenu{
    
    String name;
    String email;
    String phone;
    String education;
    String experience;
    String skills;

    public Resume(String name, String email, String phone, String education, String experience, String skills) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.education = education;
        this.experience = experience;
        this.skills = skills;
    }

    
}	
