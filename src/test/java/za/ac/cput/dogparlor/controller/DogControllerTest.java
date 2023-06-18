
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
        import za.ac.cput.dogparlor.domain.Dog;
        import za.ac.cput.dogparlor.factory.DogFactory;

        import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DogControllerTest {

    private Dog dog = DogFactory.createDog(45632, "Jack", 2, "Maltese","small" , "long");
    @Autowired
    private TestRestTemplate restTemplate;
    private final String baseURL = "http://localhost:8080/dog";

    @Test
    void a_create() {
        String url = baseURL + "/create";
        ResponseEntity<Dog> postResponse = restTemplate.postForEntity(url, dog, Dog.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());

        Dog savedDog = postResponse.getBody();
        System.out.println("Saved data: " + savedDog);
        assertEquals(dog.getDogID(), savedDog.getDogID());
    }

    @Test
    void b_read() {
        String url = baseURL + "/read/" + dog.getDogID();
        ResponseEntity<Dog> responseEntity = restTemplate.getForEntity(url, Dog.class);
        assertEquals(dog.getDogID(), responseEntity.getBody().getDogID());
        System.out.println(responseEntity.getBody());
    }

    @Test
    void c_update() {
        Dog updatedDog = new Dog.Builder().copy(dog)
                .setName("Snowy")
                .build();
        String url = baseURL + "/update";
        System.out.println("URL: " + url);
        System.out.println("Post data: " + updatedDog);
        ResponseEntity<Dog> responseEntity = restTemplate.postForEntity(url, updatedDog, Dog.class);
        assertNotNull(responseEntity.getBody());
    }

    @Test
    @Disabled
    void e_delete() {
        String url = baseURL + "/delete/" + dog.getDogID();
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