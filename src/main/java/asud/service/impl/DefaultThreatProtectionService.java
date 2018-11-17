package asud.service.impl;

import asud.dao.ThreatProtectionDAO;
import asud.entity.ThreatProtection;
import asud.service.ThreatProtectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultThreatProtectionService implements ThreatProtectionService {

  @Autowired
  private ThreatProtectionDAO threatProtectionDAO;

  @Override
  public void save(final ThreatProtection category) {
    threatProtectionDAO.save(category);
  }

  @Override
  public List<ThreatProtection> findAll() {
    return threatProtectionDAO.findAll();
  }

  @Override
  public ThreatProtection findOne(final long id) {
    return threatProtectionDAO.findOne(id);
  }

  @Override
  public void delete(final long id) {
    threatProtectionDAO.delete(id);
  }
}
