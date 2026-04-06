package bai3;

public class mainbai3 {
	    public static void main(String[] args) {
	    	
	        GenericManager<Student> studentManager = new GenericManager<>();
	        studentManager.add(new Student("S01", "An"));
	        studentManager.add(new Student("S02", "Binh"));

	        System.out.println("Danh sách sinh viên:");
	        studentManager.display();
	        System.out.println("Số lượng: " + studentManager.size());

	        GenericManager<Employee> employeeManager = new GenericManager<>();
	        employeeManager.add(new Employee("E01", "Nam"));
	        employeeManager.add(new Employee("E02", "Hoa"));

	        System.out.println("Danh sách nhân viên:");
	        employeeManager.display();
	        System.out.println("Số lượng: " + employeeManager.size());
	    }
	}

