package org.launchcode.VetConnect.models.data;

import org.launchcode.VetConnect.models.Clinic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClinicRepository extends CrudRepository<Clinic, Integer> {

    List<Clinic> findByCityIgnoreCaseContaining(String city);
    List<Clinic> findByStateIgnoreCaseContaining(String state);


}
