/*  RoleFactoryTest.java
    Factory test for the  role
    Author: Lindiwe Thokozile Somana (218076509)
    Date: 5 April 2023
*/
package za.ac.cput.dogparlor.factory;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ac.cput.dogparlor.domain.Role;

import static org.junit.jupiter.api.Assertions.*;

class RoleFactoryTest {

    Role role1;
    Role role2;
    Role role3;

    @BeforeEach
    void setUpTest() {
        role1 = RoleFactory.createRole(1, "Employee","Shampoo Queen");
        role2 = RoleFactory.createRole(3, "Manager", "Grooming Manager");
    }

    @Test
    void objectTest(){
        assertNotNull(role1);
    }

    @Test
    void ObjectEqualityTest(){
        role1 = role3;
        assertEquals(role1,role3);
    }

    @Test
    public void objectIdentity() {
        role1 = role3;
        assertSame(role1,role3);
    }
    @Test
    void failingTest(){
        assertSame(role1,role2);
    }

    @Test
    void timeoutTest() throws InterruptedException{
        Thread.sleep(500);
        System.out.println("Test will be passed within this duration");
    }

    @Ignore
    @Test
    public void ignoreThisTest() {
        assertNotNull(role1);
    }

}