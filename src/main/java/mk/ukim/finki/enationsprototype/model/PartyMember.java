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

    public PartyMember(PoliticalParty politicalParty) {
        this.politicalParty = politicalParty;
    }

    public PartyMember() {
    }
}
