package mk.ukim.finki.enationsprototype.service;

import mk.ukim.finki.enationsprototype.model.PoliticalParty;

import java.util.List;

public interface PoliticalPartyService {

    PoliticalParty create(PoliticalParty politicalParty);

    PoliticalParty findById(Long id);

    List<PoliticalParty> findAll();

    PoliticalParty update(PoliticalParty politicalParty);

    void delete(Long id);
}
