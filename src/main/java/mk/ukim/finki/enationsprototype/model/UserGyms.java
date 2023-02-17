package mk.ukim.finki.enationsprototype.model;

import javax.persistence.*;
import java.security.Timestamp;

@Entity
@Table(name = "user_gyms")
public class UserGyms {
    @Id
    @Column(name = "id_user")
    private Integer id;

    @Column(name = "q1")
    private Timestamp q1;

    @Column(name = "q2")
    private Timestamp q2;

    @Column(name = "q3")
    private Timestamp q3;

    @Column(name = "q4")
    private Timestamp q4;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
    private User user;

    public UserGyms(Timestamp q1, Timestamp q2, Timestamp q3, Timestamp q4, User user) {
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q4;
        this.user = user;
    }
}
