CREATE SCHEMA `student_db` ;

CREATE TABLE `student_db`.`tbl_student` (
  `rollno` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `percentage` DOUBLE NOT NULL,
  `attempts` INT NOT NULL,
  PRIMARY KEY (`rollno`));
  
 ALTER TABLE `student_db`.`tbl_student` 
ADD COLUMN `dob` DATE NULL AFTER `attempts`;