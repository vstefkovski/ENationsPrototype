package mk.ukim.finki.enationsprototype.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "political_party")
public class PoliticalParty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_party")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "id_country")
    private Country country;

    public PoliticalParty(String name, String description, Country country) {
        this.name = name;
        this.description = description;
        this.country = country;
    }

    // Constructors, getters, and setters

    public PoliticalParty() {
    }
}