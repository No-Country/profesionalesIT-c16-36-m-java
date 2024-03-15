package com.nocountry.professionalIT.service;

import com.nocountry.professionalIT.dto.HSDto;
import java.util.List;
import java.util.Optional;
/**
 * HSService is the service interface for managing hard skills.
 * This interface defines methods for retrieving, creating, updating, and deleting hard skills.
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-03-05
 */
public interface HSService {
        /**
         * Retrieves a list of all hard skills.
         * @return a list of all hard skills.
         */
        List<HSDto> skillList();

        /**
         * Retrieves a hard skill by its identifier.
         * @param id the identifier of the hard skill to retrieve.
         * @return the hard skill with the given identifier, or an empty optional if no hard skill was found.
         */
        Optional<HSDto> findById(Integer id);

        /**
         * Saves a new hard skill.
         * @param skill the hard skill to save.
         * @return the saved hard skill.
         */
        HSDto save(HSDto skill);

        /**
         * Updates an existing hard skill.
         * @param id the identifier of the hard skill to update.
         * @param skill the updated hard skill.
         * @return the updated hard skill.
         */
        HSDto update(Integer id, HSDto skill);

        /**
         * Deletes a hard skill by its identifier.
         * @param id the identifier of the hard skill to delete.
         */
        void deleteById(Integer id);
}

