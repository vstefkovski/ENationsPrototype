package mk.ukim.finki.enationsprototype.model;

import mk.ukim.finki.enationsprototype.model.PoliticalParty;

import javax.persistence.*;

@Entity
@Table(name = "party_member")
public class PartyMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pmember")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_party")
    private PoliticalParty politicalParty;

    @OneToOne
    @JoinColumn(name = "id_user")
    private User user;


    public PartyMember(PoliticalParty politicalParty, User user) {
        this.politicalParty = politicalParty;
        this.user = user;
    }

    public PartyMember() {
    }
}
