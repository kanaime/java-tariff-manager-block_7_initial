package dev.wcs.nad.tariffmanager.department;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import dev.wcs.nad.tariffmanager.persistence.entity.Department;
import dev.wcs.nad.tariffmanager.persistence.entity.Tariff;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class DepartmentTest {

    @Test
    public void shouldReturnAllDepartments() {
        Tariff tariff = new Tariff();
        Department department = new Department();
        tariff.setDepartment(department);
        assertThat(tariff.getDepartment()).isNotNull();
    }
}