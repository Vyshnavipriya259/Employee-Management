package employeeM;
import java.util.ArrayList;
import java.util.Scanner;
class Employee1 {
	private int id;
	private String name;
	private String designation;
	private int age;
	private double salary;
	private String email;
	public Employee1(int id, String name, String designation, int age, double salary, String email) {
		this.id = id;
		this.name = name;
		this.designation=designation;
		this.age=age;
		this.salary = salary;
		this.email=email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
  @Override
  	public String toString() {
	  return "Employee [Id=" + id + ", Name=" + name + ", Designation=" + designation + ", Age=" + age + ", Salary=" + salary + ", Email=" + email + "]";
  		}
}
class EmployeeManagementSystem {
	private ArrayList<Employee1> employees = new ArrayList<Employee1>();
	Scanner sc = new Scanner(System.in);
	/*
	public void addEmployee(Employee1 em) {
	    boolean idExists = false;
	    for (Employee1 e : employees) {
	        if (e.getId() == em.getId()) {
	            idExists = true;
	            break;
	        }
	    }
	    if (idExists) {
	        System.out.println("Employee ID already exists. Please use a different ID.");
	    } else {
	        employees.add(em);
	        System.out.println("Employee added successfully!");
	    }
	}
	*/
	public void addEmployee(Employee1 em) {
		employees.add(em);
	}

	public void removeEmployee(int id) {
		int flag=1;
		for (int i = 0; i < employees.size(); i++) {
			Employee1 em = employees.get(i);
			if (em.getId() == id) {
				employees.remove(i);
				System.out.println("Employee Deleted successfully!");
				flag=0;
				break;
			}
		}
		if(flag==1) {
			System.out.println("Employee Id not found!.\nEnter valid Id!");
		}
	}
	public void updateEmployee(int id) {
		int flag=1;
        for(Employee1 em : employees) {
        	if(em.getId()==id) {
        		boolean b=true;
        		while(b) {
    				System.out.println("	a.To modify the Employee Name");
    				System.out.println("	b.To modify the Employee Designation");
    				System.out.println("	c.To modify the Employee Age");
    				System.out.println("	d.To modify the Employee Salary");
    				System.out.println("	e.To modify the Employee Email");
    				System.out.println("	f.Exit");
    				System.out.println("Enter your choice: ");
    				char cho=sc.next().charAt(0);
    				sc.nextLine();
        			switch(cho) {
        			case 'a':
        				System.out.println("To modify the Employee Name:\nEnter New Name:");
        				String newName = sc.nextLine();
        				//sc.nextLine();
        				em.setName(newName);
        				break;
        			case 'b':
        				System.out.println("To modify the Employee Designation:\n Enter New Designation:");
        				String newDesig = sc.nextLine();
        				sc.nextLine();
        				em.setDesignation(newDesig);
        				break;
        			case 'c':
        				System.out.println("To modify the Employee Age:\n Enter New Age:");
        				int newAge = sc.nextInt();
        				sc.nextLine();
        				em.setAge(newAge);
        				break;
        			case 'd':
        				System.out.println("To modify the Employee Salary:\n Enter New Salary:");
        				double newSalary = sc.nextDouble();
        				em.setSalary(newSalary);
        				break;
        			case 'e':
        				System.out.println("To modify the Employee Name:\n Enter New Email:");
        				String newEmail = sc.next();
        				sc.nextLine();
        				em.setEmail(newEmail);
        				break;
        			case 'f':
        				System.out.println("Exit");
        				break;
        			default:
        				System.out.println("Enter vaild choice");
        			}
        			if(cho=='f') {
        				b=false;
        			}
        		}
        		flag=0;
        	}
        }
        if(flag==1) {
        	System.out.println("Employee Id not found!.\nEnter valid Id!");
        }
	}
	public void viewWithId(int id) {
		int flag=1;
		for(int i=0; i< employees.size();i++) {
			Employee1 em = employees.get(i);
			if(em.getId()==id) {
				System.out.print(em);
				System.out.println("Employee Viewed successfully!");
				flag=0;
				break;
			}
		}
		if(flag==1) {
			System.out.println("Employee Id not found!.\nEnter valid Id!");
		}
	}
	public void displayEmployees() {
		for (Employee1 em : employees) {
			System.out.println(em);
		}
	}
	 public void addDummyData() {
	        Employee1 emp1 = new Employee1(1, "vyshu", "Manager", 35, 60000.00, "vyshu123@gmail.com");
	        Employee1 emp2 = new Employee1(2, "Niharika", "Developer", 28, 50000.00, "niharika23@gmail.com");
	        Employee1 emp3 = new Employee1(3, "Akshara", "Analyst", 30, 55000.00, "akshara56@gmail.com");
	        Employee1 emp4 = new Employee1(4, "Bhargavi", "HR Specialist", 32, 52000.00, "bhargavi78@gmail.com");
	        Employee1 emp5 = new Employee1(5, "Chnadana", "Developer", 32, 52000.00, "chandana98@gmail.com");

	        // Add employees to the employees list
	        employees.add(emp1);
	        employees.add(emp2);
	        employees.add(emp3);
	        employees.add(emp4);
	        employees.add(emp5);
	    }
	public void displayEmployees1() {
	    // Table header
	    System.out.println("--------------------------------------------------------------------------------------------------------");
	    System.out.printf("| %-5s | %-20s | %-20s | %-5s | %-10s | %-25s |\n", "ID", "Name", "Designation", "Age", "Salary", "Email");
	    System.out.println("--------------------------------------------------------------------------------------------------------");

	    // Display each employee's details in the table
	    for (Employee1 em : employees) {
	        System.out.printf("| %-5d | %-20s | %-20s | %-5d | %-10.2f | %-25s |\n",
	                           em.getId(), em.getName(), em.getDesignation(), em.getAge(), em.getSalary(), em.getEmail());
	    }

	    System.out.println("--------------------------------------------------------------------------------------------------------");
	}

}
public class employeeM {
	public static void main(String[] args) {
		EmployeeManagementSystem ems = new EmployeeManagementSystem();
		ems.addDummyData();
		Scanner read = new Scanner(System.in);
			boolean c=true;
			do {
				System.out.println("*----------------Welcome To Employee Management System----------------*");
				System.out.println("*               			1.Add Employee                            *");
				System.out.println("*               			2.Delete Employee                         *");
				System.out.println("*               			3.View a Specific Employee                *");
				System.out.println("*               			4.View Employees                          *");
				System.out.println("*               			5.Update Employees                        *");
				System.out.println("*               			6.Exit                                    *");
				System.out.println("*----------------------------END--------------------------------------*");
				System.out.print("Enter your choice: ");
				int ch=read.nextInt();
				switch (ch) {
				case 1:
					System.out.print("Enter Employee ID: ");
					int id = read.nextInt();
					read.nextLine();
					System.out.print("Enter Employee Name: ");
					String name = read.nextLine();
					System.out.print("Enter Employee Age: ");
					int age = read.nextInt();
					read.nextLine();
					System.out.print("Enter Employee Designation: ");
					String designation = read.nextLine();
					System.out.print("Enter Employee Salary: ");
					double salary = read.nextDouble();
					System.out.print("Enter Employee Email: ");
					String email = read.next();
					read.nextLine();
					Employee1 em = new Employee1(id, name, designation, age, salary, email);
					ems.addEmployee(em);
					System.out.println("Employee added successfully!");
					break;
				case 2:
					System.out.print("Enter Employee ID to delete : ");
					int deleteId = read.nextInt();
					read.nextLine();
					ems.removeEmployee(deleteId);
					break;
				case 3:
					System.out.println("View a Specific Employee with ID");
					int viewId = read.nextInt();
					read.nextLine();
					ems.viewWithId(viewId);
					break;
				case 4:
					System.out.println("List of Employees:");
					ems.displayEmployees1();
					break;
				case 5:
					System.out.print("Enter Employee ID to update: ");
                    int updateId = read.nextInt();
                    read.nextLine();
                    ems.updateEmployee(updateId);
                    break;
				case 6:
					System.out.println("Thank You For Accessing Your Application");
					System.out.println("Exit");
					break;
				default:
					System.out.println("Invalid choice. Try again.");
					break;
				}
			if(ch==6) {
				c=false;
			}
		}while(c);
	}
}

