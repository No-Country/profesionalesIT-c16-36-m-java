package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.SSDto;
import java.util.List;
import java.util.Optional;

/**
 * Service interface for managing skills.
 * This interface defines methods for retrieving, creating, updating, and deleting skills.
 *
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-05
 */
public interface SSService {

    List<SSDto> skillList();


    Optional<SSDto> findById(Integer id);

    SSDto save(SSDto skill);

    SSDto update(Integer id, SSDto skill);


    void deleteById (Integer id);
}
