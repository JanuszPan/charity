package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.coderslab.entity.Donation;

import java.util.List;
import java.util.Optional;

public interface DonationRepository extends JpaRepository<Donation, Long> {

    Donation  findDonationById(Long id);

    @Query(value = "SELECT SUM(quantity) FROM donation", nativeQuery = true)
    int sumBags();

}
