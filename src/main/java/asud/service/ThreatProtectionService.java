package asud.service;

import asud.entity.ThreatProtection;

import java.util.List;

public interface ThreatProtectionService {
  void save(ThreatProtection category);

  List<ThreatProtection> findAll();

  ThreatProtection findOne(long id);

  void delete(long id);
}
