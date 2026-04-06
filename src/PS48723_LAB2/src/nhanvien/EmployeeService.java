package nhanvien;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
	   private List<Employee> ds=new ArrayList<Employee>();

	    public void addEmployee(Employee e) {
	        ds.add(e);
	    }

	    public void displayAll() {
	        if (ds.isEmpty()) {
	            System.out.println("Danh sách rỗng!");
	            return ;
	        }

	        for (Employee e : ds) {
	            System.out.println(e);
	        }
	    }

	    public Employee findById(String id) {
	        for (Employee e : ds) {
	            if (e.getId().equalsIgnoreCase(id)) {
	                return e;
	            }
	        }
	        return null;
	    }

	    public boolean updateSalary(String id, double newSalary) {
	        Employee e = findById(id);
	        if (e != null) {
	            e.setSalary(newSalary);
	            return true;
	        }
	        return false;
	    }
}
