package org.launchcode.VetConnect.data;

import org.launchcode.VetConnect.models.Clinic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicRepository extends CrudRepository<Clinic, Integer> {
}
