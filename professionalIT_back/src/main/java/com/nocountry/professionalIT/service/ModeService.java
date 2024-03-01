package com.nocountry.professionalIT.service;

import java.util.List;
import java.util.Optional;

public interface ModeService {
    List<ModeService> modeList();

    Optional<ModeService> findById(Integer id);

    ModeService save(ModeService mode);
    void deleteById (Integer id);
}
