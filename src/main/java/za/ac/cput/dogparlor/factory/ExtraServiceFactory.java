/*  ExtraServiceFactory.java
    Factory for the extra services
    Author: Lindiwe Thokozile Somana (218076509)
    Date: 5 April 2023
*/

package za.ac.cput.dogparlor.factory;

        import za.ac.cput.dogparlor.domain.ExtraService;
        import za.ac.cput.dogparlor.util.Helper;

public class ExtraServiceFactory {
    public static ExtraService createService(int id, String name){

        if(id == 0)
            return  null;
        if(Helper.isNullOrEmpty(name))
            return null;

        return new ExtraService.Builder().setExtraId(id).setExtraServiceName(name).build();
    }
}