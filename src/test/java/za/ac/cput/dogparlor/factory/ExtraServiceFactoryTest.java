/*  ExtraServiceFactoryTest.java
    Factory test for the extra services
    Author: Lindiwe Thokozile Somana (218076509)
    Date: 5 April 2023
*/

package za.ac.cput.dogparlor.factory;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.dogparlor.domain.ExtraService;

import static org.junit.jupiter.api.Assertions.*;

class ExtraServiceFactoryTest {

    ExtraService extraService1;
    ExtraService extraService2;
    ExtraService extraService3;

    @BeforeEach
    void setUpTest() {
        extraService1 = ExtraServiceFactory.createService(52, "Summer Cut");
        extraService2 = ExtraServiceFactory.createService(03, "Dipping");
    }

    @Test
    void objectTest(){
        assertNotNull(extraService1);
    }

    @Test
    void ObjectEqualityTest(){
        extraService1 = extraService3;
        assertEquals(extraService1,extraService3);
    }

    public void objectIdentity() {
        extraService1 = extraService3;
        assertSame(extraService1,extraService3);
    }
    @Test
    void failingTest(){
        assertSame(extraService1,extraService2);
    }

    @Test
    void timeoutTest() throws InterruptedException{
        Thread.sleep(500);
        System.out.println("Test will be passed within this duration");
    }

    @Ignore
    @Test
    public void ignoreThisTest() {
        assertNotNull(extraService1);
    }
}
