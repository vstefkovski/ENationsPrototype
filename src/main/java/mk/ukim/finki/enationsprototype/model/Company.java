package mk.ukim.finki.enationsprototype.model;


import lombok.Data;

import javax.persistence.*;
import java.security.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_company")
    private Integer id;

    @Column(name = "type", nullable = false)
    private Integer type;

    @Column(name = "quality", nullable = false)
    private Integer quality;

    @Column(name = "last_worked")
    private Timestamp lastWorked;

    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id_user")
    private User user;

    // constructors, getters and setters


    public Company(Integer type, Integer quality, Timestamp lastWorked, User user) {
        this.type = type;
        this.quality = quality;
        this.lastWorked = lastWorked;
        this.user = user;
    }

    public Company() {
    }
}
