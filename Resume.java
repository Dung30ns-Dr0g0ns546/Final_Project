import java.util.Scanner;

class Resume implements HasMenu{
    
    String name;
    String email;
    String phone;
    String education;
    String experience;
    String skills;
    String certification;
	String summary;

	public Resume() {
		this.name = "";
		this.email = "";
		this.phone = "";
		this.education = "";
		this.experience = "";
		this.skills = "";
		this.certification = "";
		this.summary = "";
	}

    public Resume(String name, String email, String phone, String education, String experience, String skills, String certification, String summary) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.education = education;
        this.experience = experience;
        this.skills = skills;
        this.certification = certification;
		this.summary = summary;
    }

	public void start(){
        boolean keepGoing = true;
		while (keepGoing){
			String result = menu();
				if (result.equals("0")){
					keepGoing = false;
				} else if (result.equals("1")){
					changeName();
				} else if (result.equals("2")){
					changeEmail();
				} else if (result.equals("3")){
           			changePhone();
        		} else if (result.equals("4")){
					changeEducation();
				} else if (result.equals("5")){
					changeExperience();
				} else if (result.equals("6")){
					changeSkills();
				} else if (result.equals("7")){
					changeCertifications();
				} else if (result.equals("8")){
					changeSummary();
				} else if (result.equals("9")){
					displayResume();
				} else {
					System.out.println("Please enter 0-9");
			}
		}
    }



    public String menu(){
		Scanner input = new Scanner(System.in);

        System.out.println("0) Exit This Menu");
        System.out.println("1) Change Name");
        System.out.println("2) Change Email");
        System.out.println("3) Change Phone Number");
        System.out.println("4) Change Education");
		System.out.println("5) Change Experience");
        System.out.println("6) Change Skills");
        System.out.println("7) Change Certifications");
        System.out.println("8) Change Summary");
		System.out.println("9) Display Resume");

        System.out.println();
        System.out.println("Please enter 0-9: ");

        String result = input.nextLine();
        return result;
    }

    public void changeName(){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter New Name: ");

		String newName = input.nextLine();
		
		if (newName.equals(name)){
			System.out.println("Incorrect. You have entered your current name. Try again.");
		} else {
			this.name = newName;
			System.out.println("New name has been set.");
		}
	}

    public void changeEmail(){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter New Email Address: ");

		String newEmail = input.nextLine();
		
		if (newEmail.equals(email)){
			System.out.println("Incorrect. You have entered your current email address. Try again.");
		} else {
			this.email = newEmail;
			System.out.println("New email address has been set.");
		}
	}

    public void changePhone(){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter New Phone Number: ");

		String newPhone = input.nextLine();
		
		if (newPhone.equals(phone)){
			System.out.println("Incorrect. You have entered your current phone number. Try again.");
		} else {
			this.phone = newPhone;
			System.out.println("New phone number has been set.");
		}
	}

    public void changeEducation(){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter New Education (seperate by comma): ");

		String newEducation = input.nextLine();
		
		if (newEducation.equals(education)){
			System.out.println("Incorrect. You have entered your current education. Try again.");
		} else {
			this.education = newEducation;
			System.out.println("New education has been set.");
		}
	}

	public void changeExperience(){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter New Experiences (seperate by comma): ");

		String newExperiences = input.nextLine();
		
		if (newExperiences.equals(experience)){
			System.out.println("Incorrect. You have entered your current expereinces. Try again.");
		} else {
			this.experience = newExperiences;
			System.out.println("New experiences has been set.");
		}
	}

    public void changeSkills(){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter New Skills (seperate by comma): ");

		String newSkills = input.nextLine();
		
		if (newSkills.equals(skills)){
			System.out.println("Incorrect. You have entered your current skills. Try again.");
		} else {
			this.skills = newSkills;
			System.out.println("New skills has been set.");
		}
	}

    public void changeCertifications(){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter New Certifications: ");

		String newCertifications = input.nextLine();
		
		if (newCertifications.equals(certification)){
			System.out.println("Incorrect. You have entered your current certification. Try again.");
		} else {
			this.certification = newCertifications;
			System.out.println("New certifications has been set.");
		}
	}

    public void changeSummary(){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter New Summary: ");

		String newSummary = input.nextLine();
		
		if (newSummary.equals(summary)){
			System.out.println("Incorrect. You have entered your current summary. Try again.");
		} else {
			this.summary = newSummary;
			System.out.println("New summary has been set.");
		}
	}
	
	public void displayResume() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phone);
        System.out.println("Education: " + education);
		System.out.println("Experience: " + experience);
        System.out.println("Skills: " + skills);
        System.out.println("Certifications: " + certification);
		System.out.println("Summary: " + summary);
    }
}	
