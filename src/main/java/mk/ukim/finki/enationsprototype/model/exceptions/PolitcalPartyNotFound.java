package mk.ukim.finki.enationsprototype.model.exceptions;

public class PolitcalPartyNotFound extends RuntimeException {
    public PolitcalPartyNotFound(Long id) {
        super(String.format("Politcal party with id: %d not found", id));
    }
}
