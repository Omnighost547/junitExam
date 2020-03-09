/*******************************************************************************
 * Tommy Kearns - g00320978@gmit.ie
 * Created: 09-03-2020
 * Modified: 09/03/20 10:12
 ******************************************************************************/

package ie.gmit.tkearns;

import java.util.ArrayList;

public class EmployeeList {
    private ArrayList<Employee> employeeArrayList = new ArrayList<>();

    public void addEmployee(Employee obj) throws Exception {
/*
        if(employeeArrayList.stream().anyMatch(employee -> {
            int listNum = employee.getEmployeeNumber();
            return obj.getEmployeeNumber() == listNum ? true : false;
        })) {
            throw new Exception("Duplicate Employee details found, no object added");

        }
*/

        for (Employee emp : employeeArrayList) {
            if(emp.getEmployeeNumber() == obj.getEmployeeNumber())
                throw new Exception("Duplicate Employee details found, no object added");
        }

        employeeArrayList.add(obj);
    }

/*
    public void deleteEmployee(int employeeNumber) {
        boolean matchingEmployee = employeeArrayList.stream().
    }
*/

    public int getSize() {
        return employeeArrayList.size();
    }
}
