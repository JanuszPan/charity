package pl.coderslab.services;

import lombok.Data;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import pl.coderslab.entity.Institution;
import pl.coderslab.repository.InstitutionRepository;

@Service
@Data
public class InstitutionService {
    private final InstitutionRepository institutionRepository;

    public void addInstitution(Institution newInstitution) {
        institutionRepository.save(newInstitution);
    }


    public void removeInstitution(Long id) {
        institutionRepository.delete(institutionRepository.findInstitutionById(id));
    }

    public Institution getInstitution(Long id) {

        return institutionRepository.findInstitutionById(id);
    }

    public void updateInstitution(Institution editInstitution) {
        Institution institution = institutionRepository.findInstitutionById(editInstitution.getId());
        institution.setName(editInstitution.getName());
        institution.setDescription(editInstitution.getDescription());
        institutionRepository.save(institution);
    }

    public void getInstitutions(Model model) {

        model.addAttribute("fundations", institutionRepository.findAll());
    }


}
