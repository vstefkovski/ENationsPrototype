package mk.ukim.finki.enationsprototype.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "region")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_region")
    private Long id;

    @Column(name = "name")
    private String name;

//    @OneToMany
//    @JoinColumn(name = "id_country")
//    private List<Region> regions;

    @ManyToOne
    @JoinColumn(name = "id_country")
    private Country country;

//    @OneToMany(mappedBy = "region")
//    private List<User> users;

    public Region(String name, Country country) {
        this.name = name;
        this.country = country;
    }

    public Region() {
    }

    // Constructors, getters, and setters
    // ...

}

