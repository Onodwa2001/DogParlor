/* ExtraServiceServiceImpl.java
   Service for ExtraService entity
   Author: Lindiwe Thokozile Somana (218076509)
   Date:11 June 2023
 */
package za.ac.cput.dogparlor.service.impl;

import za.ac.cput.dogparlor.domain.ExtraService;
import za.ac.cput.dogparlor.repository.ExtraServiceRepository;
import za.ac.cput.dogparlor.service.ExtraServiceService;

import java.util.Set;

public class ExtraServiceServiceImpl implements ExtraServiceService {

    private static ExtraServiceServiceImpl service = null;

    private ExtraServiceRepository repo = null;


    private ExtraServiceServiceImpl() {
        if (repo == null) {
            repo = ExtraServiceRepository.getRepository();
        }
    }

    public static ExtraServiceService getService() {
        if (service == null) {
            service = new ExtraServiceServiceImpl();
        }
        return service;
    }

    @Override
    public ExtraService create(ExtraService extraService) {
        return repo.create(extraService);
    }

    @Override
    public ExtraService read(Integer integer) {
        return repo.read(integer);
    }

    @Override
    public ExtraService update(ExtraService extraService) {
        return repo.update(extraService);
    }


    @Override
    public boolean delete(Integer integer) {
        return repo.delete(integer);
    }

    @Override
    public Set<ExtraService> getAll() {
        return repo.getAll();
    }
}