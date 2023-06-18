package za.ac.cput.dogparlor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.dogparlor.domain.Facility;
import za.ac.cput.dogparlor.factory.FacilityFactory;
import za.ac.cput.dogparlor.service.FacilityService;

import java.util.Set;

@RestController
@RequestMapping("/facility")
public class FacilityController {

    @Autowired
    private FacilityService facilityService;

    @PostMapping("/create")
    public Facility create(@RequestBody Facility facility) {
        Facility facility1 = FacilityFactory.createFacility(facility.getFacilityId());
        return facilityService.create(facility1);
    }

    @GetMapping("/read/{id}")
    public Facility read(@PathVariable int id) {
        return facilityService.read(id);
    }

    @PostMapping("/update")
    public Facility update(@RequestBody Facility facility) {
        return facilityService.update(facility);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id) {
        return facilityService.delete(id);
    }

    @GetMapping("/getall")
    public Set<Facility> getAll() {
        return facilityService.getAll();
    }

}
