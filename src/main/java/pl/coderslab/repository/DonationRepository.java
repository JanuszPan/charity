package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.coderslab.entity.Donation;

import java.util.List;

public interface DonationRepository extends JpaRepository<Donation, Long> {
    @Query("SELECT SUM(d.quantity) FROM Donation d")
    int allBags();

//    @Query("SELECT d FROM Donation d WHERE d.user.id = :id")
//    List<Donation> myDonations(Long id);

}
