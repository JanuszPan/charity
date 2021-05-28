package pl.coderslab.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.coderslab.repository.CategoryRepository;
import pl.coderslab.repository.DonationRepository;
import pl.coderslab.repository.InstitutionRepository;

@Service
@AllArgsConstructor
public class DonationService {
    private CategoryRepository categoryRepository;
    private DonationRepository donationRepository;
    private InstitutionRepository institutionRepository;

}
