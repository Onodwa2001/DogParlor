/*  RoleFactory.java
    Factory for the  role
    Author: Lindiwe Thokozile Somana (218076509)
    Date: 5 April 2023
*/
package za.ac.cput.dogparlor.factory;


import za.ac.cput.dogparlor.domain.Role;
import za.ac.cput.dogparlor.util.Helper;

public class RoleFactory {

       public static Role createRole(int id, String name, String  description){

        if(id == 0)
            return  null;

        if(Helper.isNullOrEmpty(name))
            return null;

        return new Role.Builder().setRoleId(id).setRoleName(name).setDescription(description).build();
    }
}
