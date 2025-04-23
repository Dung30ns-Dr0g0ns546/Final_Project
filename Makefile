JobApplication.class: JobApplication.java HasMenu.class
	javac -g JobApplication.java

HasMenu.class: HasMenu.java
	javac -g HasMenu.java

Employee.class: Employee.java User.class HasMenu.class
	javac -g Employee.java

Employer.class: Employer.java User.class HasMenu.class
	javac -g Employer.java

Resume.class: Resume.java HasMenu.class
	javac -g Resume.java

User.class: User.java HasMenu.class
	javac -g User.java

JobOpening.class: JobOpening.java HasMenu.class
	javac -g JobOpening.java

run:
	java JobApplication