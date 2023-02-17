package mk.ukim.finki.enationsprototype.repository.jpa;

import mk.ukim.finki.enationsprototype.model.PoliticalParty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PoliticalPartyRepository extends JpaRepository<PoliticalParty, Long> {
}
