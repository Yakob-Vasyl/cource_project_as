package asud.service;

import asud.entity.Regulation;

import java.util.List;

public interface RegulationService {
  void save(Regulation category);

  List<Regulation> findAll();

  Regulation findOne(long id);

  void delete(long id);
}
