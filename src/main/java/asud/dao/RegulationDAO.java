package asud.dao;

import asud.entity.Regulation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegulationDAO extends JpaRepository<Regulation, Long> {
}
