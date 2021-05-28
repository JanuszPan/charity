package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.entity.Institution;

import java.util.List;

public interface InstitutionRepository extends JpaRepository<Institution, Long> {

    List<Institution> findAll(String name);

    Institution findInstitutionById(Long id);

    Institution findInstitutionByName(String name);

}
