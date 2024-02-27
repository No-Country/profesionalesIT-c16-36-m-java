package com.nocountry.professionalIT.repository;

import com.nocountry.professionalIT.entities.LocalityEntity;
import com.nocountry.professionalIT.entities.ProvinceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository interface for performing CRUD operations on LocalityEntity objects.
 * @author Rodys Rodriguez
 * @email: rodisenrique73@gmail.com
 * @version 1.0
 * @since 2024-02-26
 * */
@Repository
public interface LocalityRepository extends JpaRepository<LocalityEntity,Integer> {

    /**
     * Finds localities by province ID.
     *
     * @param id The ID of the province.
     * @return A list of localities associated with the given province ID.
     */
    List<LocalityEntity> findLocalitiesByProvinceId (Integer id);

    /**
     * Searches for localities based on the provided search string and province.
     *
     * @param search   The search string to match against locality names.
     * @param province The province entity to filter localities.
     * @return A list of localities matching the search string and province.
     */
    @Query("SELECT l FROM LocalityEntity l WHERE l.name LIKE CONCAT('%',?1,'%') AND l.province = ?2")
    List<LocalityEntity> searchLocalities (String search, ProvinceEntity province);
}
