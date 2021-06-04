package pl.coderslab.services;

import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import pl.coderslab.entity.Donation;
import pl.coderslab.repository.DonationRepository;
import java.util.List;


@Service
@AllArgsConstructor
public class DonationService {
    private final DonationRepository donationRepository;

    public void addDonation(Donation newDonation) {

        donationRepository.save(newDonation);
    }

    public int countSum (){
        return donationRepository.sumBags();
    }

    public int countDonations (){
        List<Donation> list = donationRepository.findAll();
        return list.size();
    }

    public void save (Donation donation){
        donationRepository.save(donation);
    }
}
