package com.nocountry.professionalIT.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.nocountry.professionalIT.entities.*;
import com.nocountry.professionalIT.enums.LanguageLevel;
import com.nocountry.professionalIT.enums.Seniority;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * DTO for {@link ProfessionalEntity}
 * This class represents a Data Transfer Object (DTO) for professional entities.
 * This class is designed to transfer data related to a professional between different layers of an application.
 * This class is also designed to be serialized and deserialized using JSON format.
 * This class is also designed to be used as a request and response body for RESTful web services.
 * @author Claudia Ortiz
 * @version 1.0
 * @since 2024-02-26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProfessionalProfile implements Serializable {
    private UUID id;
    private String portfolio;
    private List<WorkModeEntityDto> workModes;
    private AvailabilityEntityDto availabilities;
    private Boolean availInmediate;
    private Boolean availTravel;
    private List<SoftSkillsEntityDto> softSkills;
    private List<HardSkillsEntityDto> hardSkills;
    private FieldEntityDto field;
    private Seniority seniority;
    private List<WorkExperienceEntityDto> workExperiences;
    private List<EducationEntityDto> educations;
    private List<KnowLanguageEntityDto> knowLanguage;
    private LocalDateTime updatedDate;
    private LocalDateTime createdDate;

    /**
     * DTO for {@link WorkModeEntity}
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class WorkModeEntityDto implements Serializable {
        private Integer id;
        private ModeEntityDto mode;

        /**
         * DTO for {@link ModeEntity}
         */
        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class ModeEntityDto implements Serializable {
            private Integer id;
            private String name;
        }
    }

    /**
     * DTO for {@link AvailabilityEntity}
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class AvailabilityEntityDto implements Serializable {
        private Integer Id;
        private String startTime;
        private String endTime;
    }

    /**
     * DTO for {@link SoftSkillsEntity}
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SoftSkillsEntityDto implements Serializable {
        private Integer id;
        private SSEntityDto ss;

        /**
         * DTO for {@link SSEntity}
         */
        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class SSEntityDto implements Serializable {
            private Integer id;
            private String name;
        }
    }

    /**
     * DTO for {@link HardSkillsEntity}
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class HardSkillsEntityDto implements Serializable {
        private Integer id;
        private HSEntityDto hs;

        /**
         * DTO for {@link HSEntity}
         */
        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class HSEntityDto implements Serializable {
            private Integer id;
            private String name;
        }
    }

    /**
     * DTO for {@link FieldEntity}
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class FieldEntityDto implements Serializable {
        private Integer id;
        private String name;
    }

    /**
     * DTO for {@link WorkExperienceEntity}
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class WorkExperienceEntityDto implements Serializable {
        private Integer id;
        private Boolean status;
        private CompanyEntityDto company;
        private String position;
        private String description;
        private Date startDate;
        private Date endDate;
        private String workExperience;

        /**
         * DTO for {@link CompanyEntity}
         */
        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class CompanyEntityDto implements Serializable {
            private Integer id;
            private String name;
        }
    }
    /**
     * DTO for {@link EducationEntity}
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class EducationEntityDto implements Serializable {
        private Integer id;
        private Boolean status;
        private SchoolEntityDto school;
        private String degree;
        private String studyField;
        private String grade;
        private String description;
        private String startDate;
        private String endDate;

        /**
         * DTO for {@link SchoolEntity}
         */
        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class SchoolEntityDto implements Serializable {
            private Integer id;
            private String name;
        }
    }
    /**
     * DTO for {@link KnowLanguageEntity}
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class KnowLanguageEntityDto implements Serializable {
        private Integer id;
        private LanguageEntityDto language;
        private LanguageLevel level;

        /**
         * DTO for {@link LanguageEntity}
         */
        @Data
        @AllArgsConstructor
        @NoArgsConstructor
        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class LanguageEntityDto implements Serializable {
            private Integer id;
            private String name;
        }
    }
}