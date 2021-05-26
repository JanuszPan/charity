package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.entity.Institution;

import java.util.List;

public interface InstitutionRepository extends JpaRepository<Institution, Long> {

    List<Institution> findAllBy(String name);

    List<Institution> findInstitutionById(Long id);

    List<Institution> findAllById(Long id);

    List<Institution> findInstitutionByName(String name);





}
