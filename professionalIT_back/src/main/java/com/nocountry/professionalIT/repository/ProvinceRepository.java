package com.nocountry.professionalIT.repository;

import com.nocountry.professionalIT.entities.CountryEntity;
import com.nocountry.professionalIT.entities.ProvinceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository interface for performing CRUD operations on ProvinceEntity objects.
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-02-26
 * */
@Repository
public interface ProvinceRepository extends JpaRepository<ProvinceEntity,Integer> {

    /**
     * Finds provinces by country ID.
     *
     * @param id The ID of the country.
     * @return A list of provinces associated with the given country ID.
     */
    List<ProvinceEntity> findProvincesByCountryId (Integer id);

    /**
     * Searches for provinces by name and country.
     *
     * @param search The search string to match against province names.
     * @param country The country entity to filter provinces.
     * @return A list of provinces matching the search string and country.
     */
    @Query("SELECT p FROM ProvinceEntity p WHERE p.name LIKE CONCAT('%',?1,'%') AND p.country = ?2")
    List<ProvinceEntity> searchProvinces (String search, CountryEntity country);
}
