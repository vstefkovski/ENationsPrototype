package mk.ukim.finki.enationsprototype.model;


import javax.persistence.*;
import java.security.Timestamp;

@Entity
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

    // constructors, getters and setters


    public Company(Integer type, Integer quality, Timestamp lastWorked) {
        this.type = type;
        this.quality = quality;
        this.lastWorked = lastWorked;
    }

    public Company() {
    }
}
