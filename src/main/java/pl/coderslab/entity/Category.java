package pl.coderslab.entity;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Data
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 2)
     private String name;
}
