/* ExtraServiceRepository.java
   Repository for ExtraService entity
   Author: Lindiwe Thokozile Somana (218076509)
   Date:07 April 2023
 */

package za.ac.cput.dogparlor.repository;


import za.ac.cput.dogparlor.domain.ExtraService;

import java.util.HashSet;
import java.util.Set;

public class ExtraServiceRepository implements IExtraServiceRepository {

    private static ExtraServiceRepository repository = null;
    private Set<ExtraService> extraServiceDB  = null;

    private ExtraServiceRepository(){
        extraServiceDB = new HashSet<ExtraService>();
    }

    public static ExtraServiceRepository getRepository(){

        if (repository == null){
            repository = new ExtraServiceRepository();
        }
        return repository;
    }

    @Override
    public ExtraService create(ExtraService extraService){

        boolean success = extraServiceDB.add(extraService);

        if (!success) {
            return null;
        }

        return extraService;
    }

    @Override
    public ExtraService read(Integer id) {
               return extraServiceDB.stream()
                .filter( extraService -> extraService.getExtraId() == id )
                .findAny()
                .orElse(null);
    }

    @Override
    public ExtraService update(ExtraService extraService) {
        ExtraService oldService = read(extraService.getExtraId());

        if (oldService != null) {
            extraServiceDB.remove(oldService);
            extraServiceDB.add(extraService);
            return extraService;
        }
        return null;
    }

    @Override
    public ExtraService delete(ExtraService extraService) {
        ExtraService oldServices = read(extraService.getExtraId());

        if (oldServices != null) {
            extraServiceDB.remove(oldServices);
            return oldServices;
        }
        return null;
    }

    @Override
    public Set<ExtraService> getAll() {
        return extraServiceDB;
    }

}
