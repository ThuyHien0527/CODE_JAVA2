package sinhvien;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
	private List<Employee> listEmployee = new ArrayList<>();
	
    public void addEmployee(Employee emp) throws DuplicateEmployeeException, InvalidSalaryException {
      
        if (emp.getSalary() < 0) {
            throw new InvalidSalaryException("Lỗi: Lương không được nhỏ hơn 0! (Lương nhập: " + emp.getSalary() + ")");
        }

        for (Employee e : listEmployee) {
            if (e.getId().equalsIgnoreCase(emp.getId())) {
                throw new DuplicateEmployeeException("Lỗi: Mã nhân viên '" + emp.getId() + "' đã tồn tại!");
            }
        }

        listEmployee.add(emp);
        System.out.println("Thêm nhân viên thành công!");
    }

    public Employee findById(String id) {
        for (Employee e : listEmployee) {
            if (e.getId().equalsIgnoreCase(id)) {
                return e;
            }
        }
        return null;
    }
}

