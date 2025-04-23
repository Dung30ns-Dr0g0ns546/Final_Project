import java.util.Scanner;

public class JobOpenings implements HasMenu{

    String title;
    String description;
    String requirements;
    int spotsAvailable;
    double salary;


    public String menu(){
        Scanner input = new Scanner(System.in);

        System.out.println("0) Exit");
        System.out.println("1) Add Job Title");
        System.out.println("2) Add Job Description");
        System.out.println("3) Add Job Requirements");
        System.out.println("4) Add Spots Available");
        System.out.println("5) Add Job Salary");

        System.out.println();
        System.out.println("Please enter 0-5: ");

        String result = input.nextLine();
        return result;
     
    }   

      public void start(){
        boolean keepGoing = true;
		while (keepGoing){
			String result = menu();
			if (result.equals("0")){
				keepGoing = false;
			} else if (result.equals("1")){
				addJobTitle();
			} else if (result.equals("2")){
			    addJobDescription();
		    } else if (result.equals("3")){
                addJobRequirements();
            } else if (result.equals("4")){
			    addSpotsAvailable();
			} else if (result.equals("5")){
                addJobSalary();
            } else {
                System.out.println("Please enter 0-5");
            }
		}
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getDescription (){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getRequirements (){
        return this.requirements;
    }

    public void setRequirements(String requirements){
        this.requirements = requirements;
    }

    public int getSpotsAvailable (){
        return this.spotsAvailable;
    }

    public void setSpotsAvailable(int spotsAvailable){
        this.spotsAvailable = spotsAvailable;
    }

    public double getSalary (){
        return this.salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public void addJobTitle(){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Job Title: ");

		String newTitle = input.nextLine();
		
		if (newTitle.equals(title)){
			System.out.println("Incorrect. You have entered this job's current title. Try again.");
		} else {
			System.out.println("New job title has been set.");
		}
	}

    public void addJobDescription(){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Job Description (Limit of 250 words): ");

		String newDescription = input.nextLine();
		
		if (newDescription.equals(description)){
			System.out.println("Incorrect. You have entered this job's current description. Try again.");
		} else {
			System.out.println("New job description has been set.");
		}
	}

    public void addJobRequirements(){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Job Requirements (seperate by comma): ");

		String newRequirement = input.nextLine();
		
		if (newRequirement.equals(requirements)){
			System.out.println("Incorrect. You have entered this job's current requirements. Try again.");
		} else {
			System.out.println("New job requirements has been set.");
		}
	}

    public void addSpotsAvailable(){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Spots Available: ");

		String newSpotsAvailable = input.nextInt();
		
		if (newSpotsAvailable.equals(spotsAvailable)){
			System.out.println("Incorrect. You have entered this job's current spots that are available. Try again.");
		} else {
			System.out.println("New job spots has been set.");
		}
	}

    public void addJobSalary(){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Job Salary: ");

		String newSalary = input.nextDouble();
		
		if (newSalary.equals(salary)){
			System.out.println("Incorrect. You have entered this job's current salary. Try again.");
		} else {
			System.out.println("New job salary has been set.");
		}
	}

}
