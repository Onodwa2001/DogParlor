package za.ac.cput.dogparlor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.dogparlor.domain.Staff;
import za.ac.cput.dogparlor.factory.StaffFactory;
import za.ac.cput.dogparlor.service.StaffService;


import java.util.Set;

@RestController
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private StaffService service;

    @PostMapping("/create")
    public Staff create(@RequestBody Staff staff) {
        Staff createdStaff = StaffFactory.createStaff(staff.getStaffID(), staff.getSalary(),
                staff.getHandleArea(), staff.getIdRole() , staff.getPersonID());

        return service.create(createdStaff);
    }

    @GetMapping("/read/{id}")
    public Staff read(@PathVariable int id) {
        return service.read(id);
    }

    @PostMapping("/update")
    public Staff update(@RequestBody Staff staff) {
        return service.update(staff);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id) {
        return service.delete(id);
    }

    @GetMapping("/getall")
    public Set<Staff> getAll() {
        return service.getAll();
    }
}
