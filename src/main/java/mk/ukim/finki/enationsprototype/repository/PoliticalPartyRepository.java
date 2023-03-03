package mk.ukim.finki.enationsprototype.repository;

import mk.ukim.finki.enationsprototype.model.PoliticalParty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoliticalPartyRepository extends JpaRepository<PoliticalParty, Long> {
}
