package mk.ukim.finki.enationsprototype.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "user_items")
public class UserItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_uitem")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user")
    private User user;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "quality")
    private Integer quality;


    public UserItem(User user, Integer quantity, Integer quality) {
        this.user = user;
        this.quantity = quantity;
        this.quality = quality;
    }

    public UserItem() {
    }
}

