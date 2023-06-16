package za.ac.cput.dogparlor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.dogparlor.domain.Location;
import za.ac.cput.dogparlor.factory.LocationFactory;
import za.ac.cput.dogparlor.service.LocationService;

import java.util.Set;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private LocationService service;

    @PostMapping("/create")
    public Location create(@RequestBody Location location) {
        Location createdLocation = LocationFactory.createLocation(location.getLocationID(), location.getName(),
                location.getLatitude(), location.getLongitude());

        return service.create(createdLocation);
    }

    @GetMapping("/read/{id}")
    public Location read(@PathVariable int id) {
        return service.read(id);
    }

    @PostMapping("/update")
    public Location update(@RequestBody Location location) {
        return service.update(location);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id) {
        return service.delete(id);
    }

    @GetMapping("/getall")
    public Set<Location> getAll() {
        return service.getALlLocations();
    }

}
