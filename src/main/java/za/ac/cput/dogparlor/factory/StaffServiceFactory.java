/* StaffServiceFactory.java
  Factory for the StaffService entity
  Author: Byron Young (218155077)
  Date:05 April 2023
 */
package za.ac.cput.dogparlor.factory;

import za.ac.cput.dogparlor.domain.StaffService;

public class StaffServiceFactory {

    public static StaffService createStaffService(int staffID, int serviceID) {
        if (staffID == 0 || serviceID == 0)
            return null;

        return new StaffService.Builder()
                .setStaffID(staffID)
                .setServiceID(serviceID)
                .build();
    }
}
