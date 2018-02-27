-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`CATEGORY`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`CATEGORY` (
  `ID` LONG NOT NULL,
  `NAME` VARCHAR(45) NULL,
  `PATENT_CATEGORY_ID` LONG NOT NULL,
  PRIMARY KEY (`ID`),
  INDEX `fk_CATEGORY_CATEGORY_idx` (`PATENT_CATEGORY_ID` ASC),
  CONSTRAINT `fk_CATEGORY_CATEGORY`
    FOREIGN KEY (`PATENT_CATEGORY_ID`)
    REFERENCES `mydb`.`CATEGORY` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`MANUFACTURER`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`MANUFACTURER` (
  `ID` LONG NOT NULL,
  `NAME` VARCHAR(45) NULL,
  `IMAGE` VARCHAR(45) NULL,
  `DESCRIPTION` VARCHAR(45) NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`PRODUCT`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`PRODUCT` (
  `ID` LONG NOT NULL,
  `NAME` VARCHAR(45) NULL,
  `DESCRIPTION` VARCHAR(45) NULL,
  `PRICE` FLOAT NULL,
  `AMOUNT` FLOAT NULL,
  `LENGTH` FLOAT NULL,
  `WIDTH` FLOAT NULL,
  `HEIGHT` FLOAT NULL,
  `WEIGHT` FLOAT NULL,
  `RAM` FLOAT NULL,
  `ROM` VARCHAR(45) NULL,
  `MANUFACTURER_ID` LONG NOT NULL,
  `CATEGORY_ID` LONG NOT NULL,
  PRIMARY KEY (`ID`),
  INDEX `fk_PRODUCT_MANUFACTURER1_idx` (`MANUFACTURER_ID` ASC),
  INDEX `fk_PRODUCT_CATEGORY1_idx` (`CATEGORY_ID` ASC),
  CONSTRAINT `fk_PRODUCT_MANUFACTURER1`
    FOREIGN KEY (`MANUFACTURER_ID`)
    REFERENCES `mydb`.`MANUFACTURER` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_PRODUCT_CATEGORY1`
    FOREIGN KEY (`CATEGORY_ID`)
    REFERENCES `mydb`.`CATEGORY` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`ACCOUNT`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`ACCOUNT` (
  `ID` LONG NOT NULL,
  `USERNAME` VARCHAR(45) NULL,
  `EMAIL` VARCHAR(45) NULL,
  `PASSWORD` VARCHAR(45) NULL,
  `CREATE_TIME` DATE NULL,
  `LAST_ACCESS` DATE NULL,
  `ACTIVE` TINYINT(1) NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`ADDRESS`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`ADDRESS` (
  `ID` LONG NOT NULL,
  `SECTION` VARCHAR(45) NULL,
  `ROAD` VARCHAR(45) NULL,
  `TOWN` VARCHAR(45) NULL,
  `DISTRICT` VARCHAR(45) NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`CUSTOMER`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`CUSTOMER` (
  `ID` LONG NOT NULL,
  `FIRST_NAME` VARCHAR(45) NULL,
  `MIDDLE_NAME` VARCHAR(45) NULL,
  `LAST_NAME` VARCHAR(45) NULL,
  `GENDR` INT NULL,
  `BIRTH_DAY` DATE NULL,
  `PHONE` VARCHAR(45) NULL,
  `ACCOUNT_ID` LONG NOT NULL,
  `ADDRESS_ID` LONG NOT NULL,
  PRIMARY KEY (`ID`),
  INDEX `fk_CUSTOMER_ACCOUNT1_idx` (`ACCOUNT_ID` ASC),
  INDEX `fk_CUSTOMER_ADDRESS1_idx` (`ADDRESS_ID` ASC),
  CONSTRAINT `fk_CUSTOMER_ACCOUNT1`
    FOREIGN KEY (`ACCOUNT_ID`)
    REFERENCES `mydb`.`ACCOUNT` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_CUSTOMER_ADDRESS1`
    FOREIGN KEY (`ADDRESS_ID`)
    REFERENCES `mydb`.`ADDRESS` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`EMPLOYEE`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`EMPLOYEE` (
  `ID` LONG NOT NULL,
  `FIRST_NAME` VARCHAR(45) NULL,
  `MIDDLE_NAME` VARCHAR(45) NULL,
  `LAST_NAME` VARCHAR(45) NULL,
  `GENDER` INT NULL,
  `BIRTH_DAY` VARCHAR(45) NULL,
  `PHONE` VARCHAR(45) NULL,
  `SALARY` FLOAT NULL,
  `ACCOUNT_ID` LONG NOT NULL,
  `ADDRESS_ID` LONG NOT NULL,
  PRIMARY KEY (`ID`),
  INDEX `fk_EMPLOYEE_ACCOUNT1_idx` (`ACCOUNT_ID` ASC),
  INDEX `fk_EMPLOYEE_ADDRESS1_idx` (`ADDRESS_ID` ASC),
  CONSTRAINT `fk_EMPLOYEE_ACCOUNT1`
    FOREIGN KEY (`ACCOUNT_ID`)
    REFERENCES `mydb`.`ACCOUNT` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_EMPLOYEE_ADDRESS1`
    FOREIGN KEY (`ADDRESS_ID`)
    REFERENCES `mydb`.`ADDRESS` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`PRODUCT_IMAGE`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`PRODUCT_IMAGE` (
  `ID` LONG NOT NULL,
  `URL` VARCHAR(45) NULL,
  `ALTER` VARCHAR(45) NULL,
  `IS_MAIN` TINYINT(1) NULL,
  `PRODUCT_ID` LONG NOT NULL,
  PRIMARY KEY (`ID`, `PRODUCT_ID`),
  INDEX `fk_PRODUCT_IMAGE_PRODUCT1_idx` (`PRODUCT_ID` ASC),
  CONSTRAINT `fk_PRODUCT_IMAGE_PRODUCT1`
    FOREIGN KEY (`PRODUCT_ID`)
    REFERENCES `mydb`.`PRODUCT` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`ATTRIBUTE`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`ATTRIBUTE` (
  `ID` LONG NOT NULL,
  `NAME` VARCHAR(45) NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`ATTRIBUTE_VALUE`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`ATTRIBUTE_VALUE` (
  `ID` LONG NOT NULL,
  `NAME` VARCHAR(45) NULL,
  `ATTRIBUTE_ID` LONG NOT NULL,
  PRIMARY KEY (`ID`, `ATTRIBUTE_ID`),
  INDEX `fk_ATTRIBUTE_VALUE_ATTRIBUTE1_idx` (`ATTRIBUTE_ID` ASC),
  CONSTRAINT `fk_ATTRIBUTE_VALUE_ATTRIBUTE1`
    FOREIGN KEY (`ATTRIBUTE_ID`)
    REFERENCES `mydb`.`ATTRIBUTE` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`PRODUCT_ATTRIBUTE`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`PRODUCT_ATTRIBUTE` (
  `PRODUCT_ID` LONG NOT NULL,
  `ATTRIBUTE_VALUE_ID` LONG NOT NULL,
  `ADDITIONAL_PRICE` FLOAT NOT NULL,
  PRIMARY KEY (`PRODUCT_ID`, `ATTRIBUTE_VALUE_ID`),
  INDEX `fk_PRODUCT_ATTRIBUTE_ATTRIBUTE_VALUE1_idx` (`ATTRIBUTE_VALUE_ID` ASC),
  CONSTRAINT `fk_PRODUCT_ATTRIBUTE_PRODUCT1`
    FOREIGN KEY (`PRODUCT_ID`)
    REFERENCES `mydb`.`PRODUCT` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_PRODUCT_ATTRIBUTE_ATTRIBUTE_VALUE1`
    FOREIGN KEY (`ATTRIBUTE_VALUE_ID`)
    REFERENCES `mydb`.`ATTRIBUTE_VALUE` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`PRODUCT_REVIEW`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`PRODUCT_REVIEW` (
  `ID` LONG NOT NULL,
  `REVIEW_RATING` INT NULL,
  `REVIEW_DATE` DATE NULL,
  `REVIEW_CONTENT` VARCHAR(45) NULL,
  `PRODUCT_ID` LONG NOT NULL,
  `CUSTOMER_ID` LONG NOT NULL,
  PRIMARY KEY (`ID`),
  INDEX `fk_PRODUCT_REVIEW_PRODUCT1_idx` (`PRODUCT_ID` ASC),
  INDEX `fk_PRODUCT_REVIEW_CUSTOMER1_idx` (`CUSTOMER_ID` ASC),
  CONSTRAINT `fk_PRODUCT_REVIEW_PRODUCT1`
    FOREIGN KEY (`PRODUCT_ID`)
    REFERENCES `mydb`.`PRODUCT` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_PRODUCT_REVIEW_CUSTOMER1`
    FOREIGN KEY (`CUSTOMER_ID`)
    REFERENCES `mydb`.`CUSTOMER` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`COUPON`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`COUPON` (
  `ID` LONG NOT NULL,
  `CODE` VARCHAR(45) NULL,
  `SALE` FLOAT NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`SHIPPING`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`SHIPPING` (
  `ID` LONG NOT NULL,
  `SHIPPING_TYPE` INT NULL,
  `SHIPPING_COST` FLOAT NULL,
  `ADDRESS_ID` LONG NOT NULL,
  PRIMARY KEY (`ID`),
  INDEX `fk_SHIPPING_ADDRESS1_idx` (`ADDRESS_ID` ASC),
  CONSTRAINT `fk_SHIPPING_ADDRESS1`
    FOREIGN KEY (`ADDRESS_ID`)
    REFERENCES `mydb`.`ADDRESS` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`ORDER`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`ORDER` (
  `ID` LONG NOT NULL,
  `DATE_ORDER` DATE NULL,
  `LAST_MODIFIED` DATE NULL,
  `PAYMENT_TYPE` INT NULL,
  `STATUS` INT NULL,
  `COUPON_ID` LONG NOT NULL,
  `SHIPPING_ID` LONG NOT NULL,
  `CUSTOMER_ID` LONG NOT NULL,
  PRIMARY KEY (`ID`),
  INDEX `fk_ORDER_COUPON1_idx` (`COUPON_ID` ASC),
  INDEX `fk_ORDER_SHIPPING1_idx` (`SHIPPING_ID` ASC),
  INDEX `fk_ORDER_CUSTOMER1_idx` (`CUSTOMER_ID` ASC),
  CONSTRAINT `fk_ORDER_COUPON1`
    FOREIGN KEY (`COUPON_ID`)
    REFERENCES `mydb`.`COUPON` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ORDER_SHIPPING1`
    FOREIGN KEY (`SHIPPING_ID`)
    REFERENCES `mydb`.`SHIPPING` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ORDER_CUSTOMER1`
    FOREIGN KEY (`CUSTOMER_ID`)
    REFERENCES `mydb`.`CUSTOMER` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
