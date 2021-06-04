package pl.coderslab.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.coderslab.entity.Donation;
import pl.coderslab.entity.Institution;
import pl.coderslab.repository.DonationRepository;
import pl.coderslab.services.DonationService;

import javax.validation.Valid;

@Controller
@AllArgsConstructor
public class DonationController {
    private final DonationService donationService;

    @GetMapping("donation/add")
    public String addDonation(Model model) {
        model.addAttribute("newDonation", new Donation());
        return "addDonation";
    }

    @PostMapping("donation/add")
    public String addDonationSuccess(@Valid @ModelAttribute Donation newDonation) {
        donationService.addDonation(newDonation);
        return "redirect:donationAll";
    }



}
