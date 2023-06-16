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
import za.ac.cput.dogparlor.domain.Location;
import za.ac.cput.dogparlor.factory.LocationFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class LocationControllerTest {

    private Location location = LocationFactory.createLocation(342, "Lab", "-34.567", "10.434");
    @Autowired
    private TestRestTemplate testRestTemplate;
    private final String baseURL = "http://localhost:8080/location";


    @Test
    void a_create() {
        String url = baseURL + "/create";
        ResponseEntity<Location> postResponse = testRestTemplate.postForEntity(url, location, Location.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());

        Location savedLocation = postResponse.getBody();
        System.out.println("Saved data: " + savedLocation);
        assertEquals(location.getLocationID(), savedLocation.getLocationID());
    }

    @Test
    void b_read() {
        String url = baseURL + "/read/" + location.getLocationID();
        ResponseEntity<Location> responseEntity = testRestTemplate.getForEntity(url, Location.class);
        assertEquals(location.getLocationID(), responseEntity.getBody().getLocationID());
        System.out.println(responseEntity.getBody());
    }

    @Test
    void c_update() {
        Location updatedLocation = new Location.LocationBuilder().copy(location)
                .setName("Hive")
                .build();

        String url = baseURL + "/update";
        ResponseEntity<Location> responseEntity = testRestTemplate.postForEntity(url, updatedLocation, Location.class);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    void e_delete() {
        String url = baseURL + "/delete/" + location.getLocationID();
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