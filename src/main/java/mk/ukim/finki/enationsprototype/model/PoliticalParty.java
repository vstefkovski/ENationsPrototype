package mk.ukim.finki.enationsprototype.model;

import lombok.Data;

import javax.persistence.*;


@Entity
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}