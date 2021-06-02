package pl.coderslab.controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.coderslab.entity.Institution;
import pl.coderslab.services.InstitutionService;

import javax.validation.Valid;

@Controller
@AllArgsConstructor
public class InstitutionController {
     private final InstitutionService institutionService;

     @GetMapping("institutions/add")
     public String addInstitution(Model model) {
          model.addAttribute("newInstitution", new Institution());
          return "addInstitution";
     }

     @PostMapping("institutions/add")
     public String addInstitutionSuccess(@Valid @ModelAttribute Institution newInstitution) {
          institutionService.addInstitution(newInstitution);
          return "redirect:/institutions/all";
     }

     @GetMapping("institutions/all")
     public String allInstitutions(Model model) {
          institutionService.getInstitutions(model);
          return "institutions";
     }

     @GetMapping("edit/{id}")
     public String editInstitution(Model model, @PathVariable Long id) {
          model.addAttribute("editInstitution", institutionService.getInstitution(id));
          return "editInstitution";
     }

     @PostMapping("edit/{id}")
     public String editInstitutionSuccess(@Valid @ModelAttribute Institution editInstitution) {
          institutionService.updateInstitution(editInstitution);
          return "redirect:/institutions/all";
     }

     @GetMapping("delete/{id}")
     public String deleteInstitution(@PathVariable Long id) {
          institutionService.removeInstitution(id);
          return "redirect:/institutions/all";
     }
}
