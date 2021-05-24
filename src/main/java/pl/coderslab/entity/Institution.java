package pl.coderslab.entity;

import javax.persistence.*;

@Entity
@Table(name="institution")
public class Institution {
    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
}
