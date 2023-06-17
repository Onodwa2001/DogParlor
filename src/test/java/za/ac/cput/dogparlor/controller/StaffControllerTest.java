package za.ac.cput.dogparlor.controller;

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
import za.ac.cput.dogparlor.domain.Staff;
import za.ac.cput.dogparlor.factory.StaffFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class StaffControllerTest {

    private Staff staff= StaffFactory.createStaff(101, 20000, "Mobile grooming van counter", 10,252);
    @Autowired
    private TestRestTemplate testRestTemplate;
    private final String baseURL = "http://localhost:8080/staff";
    @Test
    void a_create() {
        String url = baseURL + "/create";
        ResponseEntity<Staff> postResponse = testRestTemplate.postForEntity(url, staff, Staff.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());

        Staff savedStaff = postResponse.getBody();
        System.out.println("Saved data: " + savedStaff);
        assertEquals(staff.getStaffID(), savedStaff.getStaffID());
    }

    @Test
    void b_read() {
        String url = baseURL + "/read/" + staff.getStaffID();
        ResponseEntity<Staff> responseEntity = testRestTemplate.getForEntity(url, Staff.class);
        assertEquals(staff.getStaffID(), responseEntity.getBody().getStaffID());
        System.out.println(responseEntity.getBody());
    }

    @Test
    void c_update() {
        Staff updatedStaff = new Staff.Builder().copy(staff)
                .setHandleArea("Wash and Blow Area")
                .build();

        String url = baseURL + "/update";
        System.out.println("URL: " + url);
        System.out.println("Post data: " + updatedStaff);
        ResponseEntity<Staff> responseEntity = testRestTemplate.postForEntity(url, updatedStaff, Staff.class);
        assertNotNull(responseEntity.getBody());

    }

    @Test
    void e_delete() {
        String url = baseURL + "/delete/" + staff.getStaffID();
        System.out.println("URL: " + url);
        testRestTemplate.delete(url);
    }

    @Test
    void d_getAll() {
        String url = baseURL + "/getall";
        HttpHeaders httpHeaders = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, httpHeaders);
        ResponseEntity<String> response = testRestTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println("Show ALL:");
        System.out.println(response);
        System.out.println(response.getBody());
    }
}