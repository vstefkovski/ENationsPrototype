package mk.ukim.finki.enationsprototype.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "user_money")
public class UserMoney {

    @Id
    private int id_user;

    private double gold;

    private double curr;

    @OneToOne
    @PrimaryKeyJoinColumn
    private User user;

    public UserMoney() {
    }

    public UserMoney(int id_user, double gold, double curr, User user) {
        this.id_user = id_user;
        this.gold = gold;
        this.curr = curr;
        this.user = user;
    }
}
