package com.nocountry.professionalIT.repository;

import com.nocountry.professionalIT.entities.EnterpriseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository interface for performing CRUD operations on EnterpriseEntity objects.
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-02-29
 * */
@Repository
public interface EnterpriseRepository extends JpaRepository<EnterpriseEntity,Integer> {

  /**
   * Finds enterprises by name, ignoring case.
   *
   * @param search The search string to match against enterprise names.
   * @return A list of enterprises containing the search string in their names, ignoring case.
   */
  List<EnterpriseEntity> findByNameContainingIgnoreCase (String search);
}
