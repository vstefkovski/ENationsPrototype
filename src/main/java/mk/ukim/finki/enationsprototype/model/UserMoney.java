package mk.ukim.finki.enationsprototype.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "user_money")
public class UserMoney {

    @Id
    @Column(name = "id_user")
    private Integer id;

    private Double gold;

    private Double curr;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_user")
    private User user;

    public UserMoney() {
    }

    public UserMoney(int id, Double gold, Double curr, User user) {
        this.id = id;
        this.gold = gold;
        this.curr = curr;
        this.user = user;
    }
}
