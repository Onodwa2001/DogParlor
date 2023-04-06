/*  ServicePackageFactory.java
    Factory for the services package
    Author: Lindiwe Thokozile Somana (218076509)
    Date: 5 April 2023
*/
package za.ac.cput.dogparlor.factory;


import za.ac.cput.dogparlor.domain.ServicePackage;
import za.ac.cput.dogparlor.util.Helper;


public class ServicePackageFactory {
    public static ServicePackage createPackage(int serviceId, int extraId){

        if(serviceId == 0 || extraId == 0)
            return  null;

        return new ServicePackage.Builder().setServiceId(serviceId).setExtraId(extraId).build();
    }
}
