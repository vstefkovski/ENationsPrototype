package mk.ukim.finki.enationsprototype.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "country_funds")
public class CountryFunds {
    @Id
    @Column(name = "id_country")
    private int id;

    @Column(name = "gold", nullable = false)
    private double gold;

    @Column(name = "curr", nullable = false)
    private double curr;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id_country")
    private Country country;

    // Constructors
    public CountryFunds() {}

    public CountryFunds(double gold, double curr) {
        this.gold = gold;
        this.curr = curr;
    }
}
