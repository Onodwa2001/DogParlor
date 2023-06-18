/* RoleControllerTest.java
   Controller testcase for Role entity
   Author: Lindiwe Thokozile Somana (218076509)
   Date: 18 June 2023
 */

package za.ac.cput.dogparlor.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import za.ac.cput.dogparlor.domain.Role;
import za.ac.cput.dogparlor.factory.RoleFactory;

import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RoleControllerTest {

    private static Role role;

    @Autowired
    private TestRestTemplate template; // allows you to execute your methods and controller.
    private String baseURL;


    @BeforeEach
    void setUp(){
        role = RoleFactory.createRole(123, "Employee","Shampooing Duty");
        baseURL = "http://localhost:8080/role";
    }

    @Test
    void a_create() {
        String url = baseURL + "/create";
        System.out.println("Url: " + url);
        ResponseEntity<Role> response = template.postForEntity(url,role, Role.class);
        System.out.println("Response: " + response);
        assertNotNull(response);
        assertNotNull(response.getBody());

        Role savedRole =response.getBody();
        System.out.println("Saved data: " + savedRole);
        assertEquals(role.getRoleId(), savedRole.getRoleId());
    }

    @Test
    void b_read() {
        String url = baseURL + "/read/" + role.getRoleId();
        System.out.println("URL: " + url);
        ResponseEntity<Role> response = template.getForEntity(url,Role.class);
        System.out.println("Response: " + response);
        assertEquals(role.getRoleId(), response.getBody().getRoleId());
        System.out.println(response.getBody());
    }

    @Test
    void c_update() {
        Role update = new Role.Builder().copy(role).setDescription("Shaving Duty").build();

        String url = baseURL + "/update";
        System.out.println("URL: " + url);
        System.out.println("Post data: " + update);
        ResponseEntity<Role> response = template.postForEntity(url,update,Role.class);
        System.out.println("Response: " + response);
        assertNotNull(response.getBody());
        System.out.println(response.getBody());
    }

    @Test
    void e_delete() {
        String url = baseURL + "/delete/" + role.getRoleId();
        System.out.println("URL: " + url);
        template.delete(url);
    }

    @Test
    void d_getAll() {
        String url = baseURL + "/getall";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = template.exchange(url, HttpMethod.GET,entity, String.class);
        System.out.println("Show all: ");
        System.out.println(response);
        System.out.println(response.getBody());
    }
}