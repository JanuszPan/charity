package pl.coderslab.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "donation")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantity;//liczba worków

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Category> categories = new ArrayList<>();

    @ManyToOne
    private Institution institution;

    private String street;

    private String city;

    private String zipCode;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate pickUpDate;

    private LocalTime pickUpTime;

    private String pickUpComment;

}
