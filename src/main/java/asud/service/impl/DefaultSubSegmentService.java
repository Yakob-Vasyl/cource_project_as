package asud.service.impl;

import asud.dao.SubSegmentDAO;
import asud.entity.SubSegment;
import asud.service.SubSegmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultSubSegmentService implements SubSegmentService {

  @Autowired
  private SubSegmentDAO subSegmentDAO;

  @Override
  public void save(final SubSegment category) {

  }

  @Override
  public List<SubSegment> findAll() {
    return null;
  }

  @Override
  public SubSegment findOne(final long id) {
    return null;
  }

  @Override
  public void delete(final long id) {

  }
}
