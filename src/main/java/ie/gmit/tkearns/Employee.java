/*******************************************************************************
 * Tommy Kearns - g00320978@gmit.ie
 * Created: 09-03-2020
 * Modified: 09/03/20 09:28
 *
 * "Employee" class to store the name and employee number of the Employee.
 ******************************************************************************/

package ie.gmit.tkearns;

public class Employee {

    private String name;
    private int employeeNumber;

    public Employee(String name, String employeeNumber) {
        if(name.replace(" ", "").length() < 5)
            throw new IllegalArgumentException("Invalid name error - min. 5 characters");
        else
            this.name = name;

//        try {
            if(employeeNumber.length() != 5)
                throw new IllegalArgumentException("Invalid employee number error - not 5 digits");

            this.employeeNumber = Integer.parseInt(employeeNumber);
//        }
//        catch (NumberFormatException e) {
//            throw e;
//        }
    }

    public String getName() {
        return name;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }
}
