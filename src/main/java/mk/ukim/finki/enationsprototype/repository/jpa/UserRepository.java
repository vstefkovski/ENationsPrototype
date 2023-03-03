package mk.ukim.finki.enationsprototype.repository.jpa;

import mk.ukim.finki.enationsprototype.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
