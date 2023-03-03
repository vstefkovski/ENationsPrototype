package mk.ukim.finki.enationsprototype.repository.jpa;

import mk.ukim.finki.enationsprototype.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends JpaRepository<Region, Integer> {
}
