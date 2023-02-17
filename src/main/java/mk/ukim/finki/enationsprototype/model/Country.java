package mk.ukim.finki.enationsprototype.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @Column(name = "id_country")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "currency")
    private String currency;

    @Column(name = "capital")
    private Integer capital;

    @OneToMany(mappedBy = "country")
    private List<Region> regions;

    @OneToMany(mappedBy = "country")
    private List<PoliticalParty> politicalParties;

    @OneToMany(mappedBy = "country")
    private List<ItemOffer> itemOffers;
//
//    @OneToMany(mappedBy = "country")
//    private List<User> users;
//
//    @OneToOne(mappedBy = "country")
//    private CountryFunds countryFunds;

    // Constructors, getters, and setters
    // ...

}
