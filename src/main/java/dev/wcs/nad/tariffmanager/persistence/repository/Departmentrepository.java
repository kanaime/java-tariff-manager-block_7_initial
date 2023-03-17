package dev.wcs.nad.tariffmanager.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.wcs.nad.tariffmanager.persistence.entity.Department;

@Repository
public interface Departmentrepository extends JpaRepository<Department, Long> {

}
