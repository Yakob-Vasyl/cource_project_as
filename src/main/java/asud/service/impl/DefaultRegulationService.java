package asud.service.impl;

import asud.dao.RegulationDAO;
import asud.entity.Regulation;
import asud.service.RegulationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultRegulationService implements RegulationService {

  @Autowired
  private RegulationDAO regulationDAO;

  @Override
  public void save(final Regulation category) {
    regulationDAO.save(category);
  }

  @Override
  public List<Regulation> findAll() {
    return regulationDAO.findAll();
  }

  @Override
  public Regulation findOne(final long id) {
    return regulationDAO.findOne(id);
  }

  @Override
  public void delete(final long id) {
    regulationDAO.delete(id);
  }
}
