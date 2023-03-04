package mk.ukim.finki.enationsprototype.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.security.Timestamp;

@Entity
@Data
@Table(name = "law_proposals")
public class LawProposal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_lawprop")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cmember")
    private CongressMember congressMember;

    @Column(name = "type")
    private Integer type;

    @Column(name = "reason")
    private String reason;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "yes")
    private Integer yes;

    @Column(name = "no")
    private Integer no;

    @Column(name = "expected_votes")
    private Integer expectedVotes;

    @Column(name = "finished")
    private Integer finished;

    @Column(name = "created_at")
    private Timestamp createdAt;

    public LawProposal(CongressMember congressMember, Integer type, String reason, Double amount, Integer yes, Integer no, Integer expectedVotes, Integer finished, Timestamp createdAt) {
        this.congressMember = congressMember;
        this.type = type;
        this.reason = reason;
        this.amount = amount;
        this.yes = yes;
        this.no = no;
        this.expectedVotes = expectedVotes;
        this.finished = finished;
        this.createdAt = createdAt;
    }

    public LawProposal() {
    }
}
