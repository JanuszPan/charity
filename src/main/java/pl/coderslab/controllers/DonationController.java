package pl.coderslab.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.coderslab.entity.Donation;
import pl.coderslab.repository.CategoryRepository;
import pl.coderslab.services.DonationService;
import javax.validation.Valid;

@Controller
@AllArgsConstructor
public class DonationController {
    private final DonationService donationService;
    private final CategoryRepository categoryRepository;

    @GetMapping("donation/all")
    public String allDonations(Model model) {
        model.addAttribute("donationsAll", donationService.getAllDonationsSortedByPickUpDateAndPickUpTime());
        return "donationsAll";
    }

    @GetMapping("donation/add")
    public String addDonation(Model model) {
        model.addAttribute("newDonation", new Donation());
        model.addAttribute("categories", categoryRepository.findAll());
        return "addDonation";
    }

    @PostMapping("donation/add")
    public String addDonationSuccess(@Valid @ModelAttribute Donation newDonation) {
        donationService.addDonation(newDonation);
        return "redirect:donationAll";
    }
}
