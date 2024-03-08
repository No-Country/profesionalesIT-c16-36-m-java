package com.nocountry.professionalIT.repository;

import com.nocountry.professionalIT.entities.AvailabilityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvailabilityRepository extends JpaRepository<AvailabilityEntity,Integer> {
}
