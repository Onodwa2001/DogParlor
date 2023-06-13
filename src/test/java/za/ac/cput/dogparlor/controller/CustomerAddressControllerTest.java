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
import za.ac.cput.dogparlor.domain.CustomerAddress;
import za.ac.cput.dogparlor.factory.CustomerAddressFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CustomerAddressControllerTest {

    private CustomerAddress customerAddress = CustomerAddressFactory.createCustomerAddress(44234, 54823);
    @Autowired
    private TestRestTemplate restTemplate;
    private final String baseURL = "http://localhost:8080/customer";

    @Test
    void create() {
        String url = baseURL + "/create";
        ResponseEntity<CustomerAddress> postResponse = restTemplate.postForEntity(url, customerAddress, CustomerAddress.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());

        CustomerAddress savedCustomerAddress = postResponse.getBody();
        System.out.println("Saved data: " + savedCustomerAddress);
        assertEquals(customerAddress.getCustomerID(), savedCustomerAddress.getCustomerID());
    }

    @Test
    void read() {
        String url = baseURL + "/read/" + customerAddress.getCustomerID();
        System.out.println("URL: " + url);
        ResponseEntity<CustomerAddress> response = restTemplate.getForEntity(url, CustomerAddress.class);
        assertEquals(customerAddress.getCustomerID(), response.getBody().getCustomerID());
        System.out.println(response.getBody());
    }

    @Test
    void update() {
        CustomerAddress updatedCustomerAddress = new CustomerAddress.Builder().copy(customerAddress)
                .setCustomerID(43556)
                .build();
        String url = baseURL + "/update";
        System.out.println("URL: " + url);
        System.out.println("Post data: " + updatedCustomerAddress);
        ResponseEntity<CustomerAddress> response = restTemplate.postForEntity(url, updatedCustomerAddress, CustomerAddress.class);
        assertNotNull(response.getBody());
    }

    @Test
    @Disabled
    void delete() {
        String url = baseURL + "/delete/" + customerAddress.getCustomerID();
        System.out.println("URL: " + url);
        restTemplate.delete(url);
    }

    @Test
    void getAll() {
        String url = baseURL + "/getall";
        HttpHeaders httpHeaders = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, httpHeaders);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println("Show ALL:");
        System.out.println(response);
        System.out.println(response.getBody());
    }
}