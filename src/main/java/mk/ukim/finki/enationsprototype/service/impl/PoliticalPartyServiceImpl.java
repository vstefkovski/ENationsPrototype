package mk.ukim.finki.enationsprototype.service.impl;

import mk.ukim.finki.enationsprototype.model.PoliticalParty;
import mk.ukim.finki.enationsprototype.model.exceptions.PolitcalPartyNotFound;
import mk.ukim.finki.enationsprototype.repository.PoliticalPartyRepository;
import mk.ukim.finki.enationsprototype.service.PoliticalPartyService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PoliticalPartyServiceImpl implements PoliticalPartyService {

    private final PoliticalPartyRepository politicalPartyRepository;

    public PoliticalPartyServiceImpl(PoliticalPartyRepository politicalPartyRepository) {
        this.politicalPartyRepository = politicalPartyRepository;
    }


    @Override
    public PoliticalParty create(PoliticalParty politicalParty) {
        return politicalPartyRepository.save(politicalParty);
    }

    @Override
    public PoliticalParty findById(Long id) {
        return politicalPartyRepository.findById(id)
                .orElseThrow(() -> new PolitcalPartyNotFound(id));
    }

    public List<PoliticalParty> findAll() {
        return politicalPartyRepository.findAll();
    }

    public PoliticalParty update(PoliticalParty politicalParty) {
        return politicalPartyRepository.save(politicalParty);
    }

    public void delete(Long id) {
        PoliticalParty politicalParty = findById(id);
        politicalPartyRepository.delete(politicalParty);
    }
}
