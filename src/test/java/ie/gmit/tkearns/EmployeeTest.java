/*******************************************************************************
 * Tommy Kearns - g00320978@gmit.ie
 * Created: 09-03-2020
 * Modified: 09/03/20 09:31
 ******************************************************************************/

package ie.gmit.tkearns;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;

public class EmployeeTest {

    private static final String EMPLOYEE_NAME = "Ted Crilly";
    private static final int EMPLOYEE_NUM = 12345;

    @Test
    public void ifInvalidEmployeeNumberThenEmployeeNotCreatedAndExceptionThrown() {
        //Exception exception = new Employee(EMPLOYEE_NAME, "");
        assert("Invalid employee number error - not 5 digits", exception.getMessage());
    }
}
