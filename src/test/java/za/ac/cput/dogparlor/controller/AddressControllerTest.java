package za.ac.cput.dogparlor.controller;

import org.junit.jupiter.api.Disabled;
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
import za.ac.cput.dogparlor.domain.Address;
import za.ac.cput.dogparlor.factory.AddressFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AddressControllerTest {

    private Address address = AddressFactory.createAddress(23, "65 Soccer Street", "Cape Town", "Western Cape","7785" , "South Africa");
    @Autowired
    private TestRestTemplate restTemplate;
    private final String baseURL = "http://localhost:8080/address";

    @Test
    void a_create() {
        String url = baseURL + "/create";
        ResponseEntity<Address> postResponse = restTemplate.postForEntity(url, address, Address.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());

        Address savedAddress = postResponse.getBody();
        System.out.println("Saved data: " + savedAddress);
        assertEquals(address.getAddressID(), savedAddress.getAddressID());
    }

    @Test
    void b_read() {
        String url = baseURL + "/read/" + address.getAddressID();
        ResponseEntity<Address> responseEntity = restTemplate.getForEntity(url, Address.class);
        assertEquals(address.getAddressID(), responseEntity.getBody().getAddressID());
        System.out.println(responseEntity.getBody());
    }

    @Test
    void c_update() {
        Address updatedAddress = new Address.Builder().copy(address)
                .setStreetAddress("56 Venus Street")
                .build();
        String url = baseURL + "/update";
        System.out.println("URL: " + url);
        System.out.println("Post data: " + updatedAddress);
        ResponseEntity<Address> responseEntity = restTemplate.postForEntity(url, updatedAddress, Address.class);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    @Disabled
    void e_delete() {
        String url = baseURL + "/delete/" + address.getAddressID();
        System.out.println("URL: " + url);
        restTemplate.delete(url);
    }

    @Test
    void d_getAll() {
        String url = baseURL + "/getall";
        HttpHeaders httpHeaders = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, httpHeaders);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println("Show ALL:");
        System.out.println(response);
        System.out.println(response.getBody());
    }
}