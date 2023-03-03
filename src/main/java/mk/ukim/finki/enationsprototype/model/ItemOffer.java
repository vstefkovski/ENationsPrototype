package mk.ukim.finki.enationsprototype.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "item_offers")
public class ItemOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_itemoffer")
    private Integer id;

    @Column(name = "item")
    private Integer item;

    @Column(name = "quality")
    private Integer quality;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user")
    private User user;

    @Column(name = "price")
    private Double price;

    @Column(name = "quantity")
    private Integer quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_country")
    private Country country;

    // constructors, getters and setters


    public ItemOffer(Integer item, Integer quality, User user, Double price, Integer quantity, Country country) {
        this.item = item;
        this.quality = quality;
        this.user = user;
        this.price = price;
        this.quantity = quantity;
        this.country = country;
    }

    public ItemOffer() {
    }
}