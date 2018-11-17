package asud.dao;

import asud.entity.Regulation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegulationDAO extends JpaRepository<Regulation, Long> {
  List<Regulation> findRegulationBySegmentName(final String name);
}
