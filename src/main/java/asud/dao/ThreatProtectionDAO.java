package asud.dao;

import asud.entity.ThreatProtection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ThreatProtectionDAO extends JpaRepository<ThreatProtection, Long> {
  List<ThreatProtection> findThreatProtectionBySegmentName(final String name);
}
