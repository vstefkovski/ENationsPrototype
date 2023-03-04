package mk.ukim.finki.enationsprototype.model;

import lombok.Data;

import javax.persistence.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "level")
    private Integer level;

    @Column(name = "xp")
    private Integer xp;

    @Column(name = "strength")
    private Integer strength;

    @ManyToOne
    @JoinColumn(name = "id_region")
    private Region region;

    @ManyToOne
    @JoinColumn(name = "id_company")
    private Company company;

    @ManyToOne
    @JoinColumn(name = "id_chat")
    private Chat chat;

    // Constructors, getters, and setters
    // ...


    public User(String username, String password, String email, Integer level, Integer xp, Integer strength, Region region, Company company, Chat chat) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.level = level;
        this.xp = xp;
        this.strength = strength;
        this.region = region;
        this.company = company;
        this.chat = chat;
    }

    public User() {
    }
}
