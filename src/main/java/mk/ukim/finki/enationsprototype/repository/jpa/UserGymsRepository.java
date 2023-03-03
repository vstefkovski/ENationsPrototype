package mk.ukim.finki.enationsprototype.repository.jpa;

import mk.ukim.finki.enationsprototype.model.UserGyms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserGymsRepository extends JpaRepository<UserGyms, Integer> {
}
