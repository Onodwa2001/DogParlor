/*Service.java
  Factory class for the Service
  Author: Karabo Magagula (220042292)
  Date: 05 April 2023
 */
package za.ac.cput.dogparlor.factory;

import za.ac.cput.dogparlor.domain.Service;
import za.ac.cput.dogparlor.util.Helper;

public class ServiceFactory {

    public static Service createService(int serviceId, double price, String serviceType, String serviceDuration, String serviceDescription, String servicePackage) {
        if (Helper.isNullOrEmpty(serviceType) || Helper.isNullOrEmpty(serviceDuration) || Helper.isNullOrEmpty(serviceDescription) || Helper.isNullOrEmpty(servicePackage)) {
            return null;
        }
        if (serviceId == 0)
            return null;

        return new Service.Builder().setServiceId(serviceId)
                .setPrice(price)
                .setServiceType(serviceType)
                .setServiceDuration(serviceDuration)
                .setServiceDescription(serviceDescription)
                .setServicePackage(servicePackage)
                .build();

    }
}
