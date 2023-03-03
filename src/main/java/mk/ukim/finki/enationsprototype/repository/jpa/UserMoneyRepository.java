package mk.ukim.finki.enationsprototype.repository.jpa;

import mk.ukim.finki.enationsprototype.model.UserMoney;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMoneyRepository extends JpaRepository<UserMoney, Integer> {
}
