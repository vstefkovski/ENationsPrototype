package mk.ukim.finki.enationsprototype.model;

import javax.persistence.*;

@Entity
@Table(name = "congress_member")
public class CongressMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cmember")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_party")
    private PoliticalParty party;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user")
    private User user;

    // constructors, getters and setters


    public CongressMember(PoliticalParty party, User user) {
        this.party = party;
        this.user = user;
    }

    public CongressMember() {
    }
}