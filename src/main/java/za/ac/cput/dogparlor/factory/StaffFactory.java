/* StaffFactory.java
  Factory for the Staff entity
  Author: Byron Young (218155077)
  Date:05 April 2023
 */
package za.ac.cput.dogparlor.factory;

import za.ac.cput.dogparlor.domain.Staff;
import za.ac.cput.dogparlor.util.Helper;

public class StaffFactory {


    public static Staff createStaff(int staffID, double salary, String handleArea,int idRole, int personID){
        if (staffID == 0 || idRole == 0 || personID == 0)
            return null;

        if (Helper.isNullOrEmpty(handleArea) )
            return null;

        if (!Helper.isValidString(handleArea))
            return null;


        return new Staff.Builder().setStaffID(staffID)
                .setSalary(salary)
                .setHandleArea(handleArea)
                .setIdRole(idRole)
                .setPersonID(personID)
                .build();

    }
}
