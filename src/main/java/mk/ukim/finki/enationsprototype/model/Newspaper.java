package mk.ukim.finki.enationsprototype.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "newspaper")
public class Newspaper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_newspaper")
    private Long id;

    @OneToOne
    @JoinColumn(name = "id_user")
    private User user;

    @Column(name = "newspaper_name")
    private String name;

    @Column(name = "description")
    private String description;

    public Newspaper(User user, String name, String description) {
        this.user = user;
        this.name = name;
        this.description = description;
    }

    public Newspaper() {
    }

}

