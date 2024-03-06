-- MySQL Script generated by MySQL Workbench
-- Wed Feb 21 15:23:10 2024
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema itprofessionals
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema itprofessionals
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `itprofessionals` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `itprofessionals` ;

-- -----------------------------------------------------
-- Table `itprofessionals`.`availabities`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `itprofessionals`.`availabities` (
  `avail_id` INT NOT NULL AUTO_INCREMENT,
  `avail_startTime` TIME NULL DEFAULT NULL,
  `avail_endTime` TIME NULL DEFAULT NULL,
  `avail_travel` BIT NULL DEFAULT NULL,
  `avil_inmediate` BIT NULL,
  PRIMARY KEY (`avail_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `itprofessionals`.`companies`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `itprofessionals`.`companies` (
  `compa_id` INT NOT NULL AUTO_INCREMENT,
  `compa_name` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`compa_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `itprofessionals`.`countries`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `itprofessionals`.`countries` (
  `coun_id` VARCHAR(45) NOT NULL,
  `coun_name` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`coun_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `itprofessionals`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `itprofessionals`.`users` (
  `user_id` VARCHAR(100) NOT NULL,
  `user_email` VARCHAR(80) NOT NULL,
  `user_password` VARCHAR(255) NOT NULL,
  `user_status` BIT NULL DEFAULT NULL,
  `roles` ENUM('CUSTOMER', 'RECLUTER', 'PROFESSIONAL') NULL DEFAULT NULL,
  `data_created` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `itprofessionals`.`gender`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `itprofessionals`.`gender` (
  `gender_id` TINYINT NOT NULL AUTO_INCREMENT,
  `gender_name` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`gender_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `itprofessionals`.`people`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `itprofessionals`.`people` (
  `person_id` VARCHAR(100) NOT NULL,
  `pers_name` VARCHAR(80) NOT NULL,
  `pers_lastName` VARCHAR(120) NOT NULL,
  `pers_img` VARCHAR(255) NULL DEFAULT NULL,
  `pers_genderId` TINYINT NULL DEFAULT NULL,
  `pers_userId` VARCHAR(100) NULL DEFAULT NULL,
  `pers_counId` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`person_id`),
  INDEX `FK_Pers_User_idx` (`pers_userId` ASC) VISIBLE,
  INDEX `FK_Pers_Gender_idx` (`pers_genderId` ASC) VISIBLE,
  INDEX `FK_Pers_Coun_idx` (`pers_counId` ASC) VISIBLE,
  CONSTRAINT `FK_Pers_User`
    FOREIGN KEY (`pers_userId`)
    REFERENCES `itprofessionals`.`users` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Pers_Gender`
    FOREIGN KEY (`pers_genderId`)
    REFERENCES `itprofessionals`.`gender` (`gender_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Pers_Coun`
    FOREIGN KEY (`pers_counId`)
    REFERENCES `itprofessionals`.`countries` (`coun_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `itprofessionals`.`customers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `itprofessionals`.`customers` (
  `custo_id` VARCHAR(100) NOT NULL,
  `custo_personId` VARCHAR(100) NULL DEFAULT NULL,
  PRIMARY KEY (`custo_id`),
  INDEX `FK_Custo_Pers_idx` (`custo_personId` ASC) VISIBLE,
  CONSTRAINT `FK_Custo_Pers`
    FOREIGN KEY (`custo_personId`)
    REFERENCES `itprofessionals`.`people` (`person_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `itprofessionals`.`enterprises`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `itprofessionals`.`enterprises` (
  `enter_id` VARCHAR(100) NOT NULL,
  `enter_name` VARCHAR(50) NULL DEFAULT NULL,
  `enter_logo` VARCHAR(255) NULL DEFAULT NULL,
  `enter_description` VARCHAR(150) NULL DEFAULT NULL,
  PRIMARY KEY (`enter_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `itprofessionals`.`fields`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `itprofessionals`.`fields` (
  `field_id` TINYINT NOT NULL AUTO_INCREMENT,
  `field_name` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`field_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `itprofessionals`.`hard_skills`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `itprofessionals`.`hard_skills` (
  `HS_id` TINYINT NOT NULL AUTO_INCREMENT,
  `HS_name` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`HS_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `itprofessionals`.`languages`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `itprofessionals`.`languages` (
  `lang_id` TINYINT NOT NULL AUTO_INCREMENT,
  `lang_name` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`lang_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `itprofessionals`.`language_levels`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `itprofessionals`.`language_levels` (
  `LL_id` TINYINT NOT NULL AUTO_INCREMENT,
  `LL_level` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`LL_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `itprofessionals`.`known_languages`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `itprofessionals`.`known_languages` (
  `KL_id` INT NOT NULL AUTO_INCREMENT,
  `KL_langId` TINYINT NULL DEFAULT NULL,
  `KL_LLId` TINYINT NULL DEFAULT NULL,
  PRIMARY KEY (`KL_id`),
  INDEX `FK_KL_Lang_idx` (`KL_langId` ASC) VISIBLE,
  INDEX `FK_KL_LL_idx` (`KL_LLId` ASC) VISIBLE,
  CONSTRAINT `FK_KL_Lang`
    FOREIGN KEY (`KL_langId`)
    REFERENCES `itprofessionals`.`languages` (`lang_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_KL_LL`
    FOREIGN KEY (`KL_LLId`)
    REFERENCES `itprofessionals`.`language_levels` (`LL_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `itprofessionals`.`modes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `itprofessionals`.`modes` (
  `mode_id` TINYINT NOT NULL AUTO_INCREMENT,
  `mode_description` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`mode_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `itprofessionals`.`work_modes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `itprofessionals`.`work_modes` (
  `WK_id` INT NOT NULL,
  `WK_mode` TINYINT NULL DEFAULT NULL,
  PRIMARY KEY (`WK_id`),
  INDEX `FK_WK_modes_idx` (`WK_mode` ASC) VISIBLE,
  CONSTRAINT `FK_WK_modes`
    FOREIGN KEY (`WK_mode`)
    REFERENCES `itprofessionals`.`modes` (`mode_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `itprofessionals`.`soft_skills`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `itprofessionals`.`soft_skills` (
  `SS_id` TINYINT NOT NULL AUTO_INCREMENT,
  `SS_name` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`SS_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `itprofessionals`.`skills`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `itprofessionals`.`skills` (
  `skill_id` INT NOT NULL AUTO_INCREMENT,
  `skill_SSId` TINYINT NULL DEFAULT NULL,
  `skill_HSId` TINYINT NULL DEFAULT NULL,
  PRIMARY KEY (`skill_id`),
  INDEX `FK_Skill_SS_idx` (`skill_SSId` ASC) VISIBLE,
  INDEX `FK_Skill_HS_idx` (`skill_HSId` ASC) VISIBLE,
  CONSTRAINT `FK_Skill_SS`
    FOREIGN KEY (`skill_SSId`)
    REFERENCES `itprofessionals`.`soft_skills` (`SS_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Skill_HS`
    FOREIGN KEY (`skill_HSId`)
    REFERENCES `itprofessionals`.`hard_skills` (`HS_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `itprofessionals`.`seniorities`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `itprofessionals`.`seniorities` (
  `seni_id` TINYINT NOT NULL AUTO_INCREMENT,
  `seni_name` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`seni_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `itprofessionals`.`work_experiences`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `itprofessionals`.`work_experiences` (
  `WE_id` INT NOT NULL AUTO_INCREMENT,
  `WE_status` BIT NULL DEFAULT NULL,
  `WE_compaId` INT NULL DEFAULT NULL,
  `WE_position` VARCHAR(50) NULL DEFAULT NULL,
  `WE_description` VARCHAR(100) NULL DEFAULT NULL,
  `WE_startDate` DATE NULL DEFAULT NULL,
  `WE_endDate` DATE NULL DEFAULT NULL,
  `WE_workExperiance` VARCHAR(20) NULL DEFAULT NULL,
  PRIMARY KEY (`WE_id`),
  INDEX `FK_WE_Compa_idx` (`WE_compaId` ASC) VISIBLE,
  CONSTRAINT `FK_WE_Compa`
    FOREIGN KEY (`WE_compaId`)
    REFERENCES `itprofessionals`.`companies` (`compa_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `itprofessionals`.`professionals`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `itprofessionals`.`professionals` (
  `profe_id` VARCHAR(100) NOT NULL,
  `profe_portfolio` VARCHAR(255) NULL DEFAULT NULL,
  `Pers_dateBirth` DATE NULL DEFAULT NULL,
  `profe_WMId` INT NULL DEFAULT NULL,
  `profe_availId` INT NULL DEFAULT NULL,
  `profe_skillId` INT NULL DEFAULT NULL,
  `profe_personId` VARCHAR(100) NULL DEFAULT NULL,
  `profe_fieldId` TINYINT NULL DEFAULT NULL,
  `profe_seniId` TINYINT NULL DEFAULT NULL,
  `profe_WEId` INT NULL DEFAULT NULL,
  `profe_KLId` INT NULL DEFAULT NULL,
  `profe_dateUpdated` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`profe_id`),
  INDEX `FK_Profe_KL_idx` (`profe_KLId` ASC) VISIBLE,
  INDEX `FK_Profe_WM_idx` (`profe_WMId` ASC) VISIBLE,
  INDEX `FK_Profe_Avail_idx` (`profe_availId` ASC) VISIBLE,
  INDEX `FK_Profe_Skill_idx` (`profe_skillId` ASC) VISIBLE,
  INDEX `FK_Profe_Pers_idx` (`profe_personId` ASC) VISIBLE,
  INDEX `FK_Profe_Field_idx` (`profe_fieldId` ASC) VISIBLE,
  INDEX `FK_Profe_Seni_idx` (`profe_seniId` ASC) VISIBLE,
  INDEX `FK_Profe_WE_idx` (`profe_WEId` ASC) VISIBLE,
  CONSTRAINT `FK_Profe_KL`
    FOREIGN KEY (`profe_KLId`)
    REFERENCES `itprofessionals`.`known_languages` (`KL_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Profe_WM`
    FOREIGN KEY (`profe_WMId`)
    REFERENCES `itprofessionals`.`work_modes` (`WK_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Profe_Avail`
    FOREIGN KEY (`profe_availId`)
    REFERENCES `itprofessionals`.`availabities` (`avail_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Profe_Skill`
    FOREIGN KEY (`profe_skillId`)
    REFERENCES `itprofessionals`.`skills` (`skill_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Profe_Pers`
    FOREIGN KEY (`profe_personId`)
    REFERENCES `itprofessionals`.`people` (`person_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Profe_Field`
    FOREIGN KEY (`profe_fieldId`)
    REFERENCES `itprofessionals`.`fields` (`field_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Profe_Seni`
    FOREIGN KEY (`profe_seniId`)
    REFERENCES `itprofessionals`.`seniorities` (`seni_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Profe_WE`
    FOREIGN KEY (`profe_WEId`)
    REFERENCES `itprofessionals`.`work_experiences` (`WE_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `itprofessionals`.`provinces`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `itprofessionals`.`provinces` (
  `provi_id` SMALLINT NOT NULL AUTO_INCREMENT,
  `provi_name` VARCHAR(100) NULL DEFAULT NULL,
  `provi_counId` VARCHAR(45) NULL,
  PRIMARY KEY (`provi_id`),
  INDEX `FK_Provi_Coun_idx` (`provi_counId` ASC) VISIBLE,
  CONSTRAINT `FK_Provi_Coun`
    FOREIGN KEY (`provi_counId`)
    REFERENCES `itprofessionals`.`countries` (`coun_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `itprofessionals`.`recluters`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `itprofessionals`.`recluters` (
  `reclu_id` VARCHAR(100) NOT NULL,
  `reclu_enterId` VARCHAR(100) NULL DEFAULT NULL,
  `reclu_persId` VARCHAR(100) NULL DEFAULT NULL,
  PRIMARY KEY (`reclu_id`),
  INDEX `FK_Reclu_Enter_idx` (`reclu_enterId` ASC) VISIBLE,
  INDEX `FK_Reclu_Pers_idx` (`reclu_persId` ASC) VISIBLE,
  CONSTRAINT `FK_Reclu_Enter`
    FOREIGN KEY (`reclu_enterId`)
    REFERENCES `itprofessionals`.`enterprises` (`enter_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_Reclu_Pers`
    FOREIGN KEY (`reclu_persId`)
    REFERENCES `itprofessionals`.`people` (`person_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `itprofessionals`.`localities`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `itprofessionals`.`localities` (
  `local_id` INT NOT NULL AUTO_INCREMENT,
  `local_name` VARCHAR(60) NULL,
  `local_proviId` SMALLINT NULL,
  PRIMARY KEY (`local_id`),
  INDEX `FK_Local_Provi_idx` (`local_proviId` ASC) VISIBLE,
  CONSTRAINT `FK_Local_Provi`
    FOREIGN KEY (`local_proviId`)
    REFERENCES `itprofessionals`.`provinces` (`provi_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
