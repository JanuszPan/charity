package pl.coderslab.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import pl.coderslab.repository.DonationRepository;
import pl.coderslab.services.DonationService;

@Controller
@AllArgsConstructor
public class DonationController {
   DonationService donationService;
   DonationRepository donationRepository;

}
