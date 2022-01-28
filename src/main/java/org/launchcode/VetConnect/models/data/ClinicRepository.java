package org.launchcode.VetConnect.models.data;

import org.launchcode.VetConnect.models.Clinic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClinicRepository extends CrudRepository<Clinic, Integer> {

    List<Clinic> findByCity(String city);
    List<Clinic> findByState(String state);


}
