package asud.dao;

import asud.entity.Intruder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IntruderDAO extends JpaRepository<Intruder, Long> {
}
