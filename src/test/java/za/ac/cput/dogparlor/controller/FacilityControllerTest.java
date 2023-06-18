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
import za.ac.cput.dogparlor.domain.Facility;
import za.ac.cput.dogparlor.factory.FacilityFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class FacilityControllerTest {

    private Facility facility = FacilityFactory.createFacility(1112);
    @Autowired
    private TestRestTemplate testRestTemplate;
    private final String baseURL = "http://localhost:8080/facility";


    @Test
    void a_create() {
        String url = baseURL + "/create";
        ResponseEntity<Facility> postResponse = testRestTemplate.postForEntity(url, facility, Facility.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());

        Facility savedFacility = postResponse.getBody();
        System.out.println("Saved data: " + savedFacility);
        assertEquals(facility.getFacilityId(), savedFacility.getFacilityId());
    }

    @Test
    void b_read() {
        String url = baseURL + "/read/" + facility.getFacilityId();
        ResponseEntity<Facility> responseEntity = testRestTemplate.getForEntity(url, Facility.class);
        assertEquals(facility.getFacilityId(), responseEntity.getBody().getFacilityId());
        System.out.println(responseEntity.getBody());
    }

    @Test
    void c_update() {
        Facility updatedFacility = new Facility.Builder().copy(facility)
                .setFacilityId(1112)
                .build();

        String url = baseURL + "/update";
        ResponseEntity<Facility> responseEntity = testRestTemplate.postForEntity(url, updatedFacility, Facility.class);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    void e_delete() {
        String url = baseURL + "/delete/" + facility.getFacilityId();
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
