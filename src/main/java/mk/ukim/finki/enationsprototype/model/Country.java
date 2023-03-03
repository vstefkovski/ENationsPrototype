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

//    @OneToMany
//    private List<Region> regions;
//
//    @OneToMany(mappedBy = "id_country")
//    private List<PoliticalParty> politicalParties;
//
//    @OneToMany(mappedBy = "id_country")
//    private List<ItemOffer> itemOffers;
//
//    @OneToMany(mappedBy = "country")
//    private List<User> users;
//
//    @OneToOne(mappedBy = "id_country")
//    private CountryFunds countryFunds;

//    public Country(String name, String currency, Integer capital, List<Region> regions, List<PoliticalParty> politicalParties, List<ItemOffer> itemOffers, CountryFunds countryFunds) {
//        this.name = name;
//        this.currency = currency;
//        this.capital = capital;
//        this.regions = regions;
//        this.politicalParties = politicalParties;
//        this.itemOffers = itemOffers;
//        this.countryFunds = countryFunds;
//    }

    public Country(String name, String currency, Integer capital) {
        this.name = name;
        this.currency = currency;
        this.capital = capital;
    }

    public Country() {
    }
}
