/*  ServicePackageFactoryTest.java
    Factory test for the services package
    Author: Lindiwe Thokozile Somana (218076509)
    Date: 5 April 2023
*/

package za.ac.cput.dogparlor.factory;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.dogparlor.domain.ServicePackage;

import static org.junit.jupiter.api.Assertions.*;

class ServicePackageFactoryTest {
    ServicePackage package1;
    ServicePackage package2;
    ServicePackage package3;
    @BeforeEach
    void setUpTest() {
        package1 = ServicePackageFactory.createPackage(1,3);
        package2 = ServicePackageFactory.createPackage(1, 7);
    }

    @Test
    void objectTest(){
        assertNotNull(package1);
    }

    @Test
    void ObjectEqualityTest(){
        package1 = package3;
        assertEquals(package1,package3);
    }

    @Test
    void failingTest(){
        assertSame(package1,package2);
    }

    @Test
    void timeoutTest() throws InterruptedException{
        Thread.sleep(500);
        System.out.println("Test will be passed within this duration");
    }

    @Ignore
    @Test
    public void ignoreThisTest() {
        assertNotNull(package1);
    }

}