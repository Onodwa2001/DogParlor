/*ServiceFactoryTest.java
  Test class for the Service
  Author: Karabo Magagula (220042292)
  Date: 05 April 2023
 */
package za.ac.cput.dogparlor.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.dogparlor.domain.Service;
import static org.junit.jupiter.api.Assertions.*;

class ServiceFactoryTest {

    @Test
    public void test() {
        Service service = ServiceFactory.createService(0011, 156.89, "Grooming", "Grooming", "Trimming dog fur", "Gold");
        System.out.println(service.toString());
        assertNotNull(service);
    }

    @Test
    public void test_fail() {
        Service service = ServiceFactory.createService(0011, 156.89, "Grooming", "Grooming", "Trimming dog fur", "");
        System.out.println(service.toString());
        assertNotNull(service);
    }

}