package asud.service.impl;

import asud.dao.SegmentDAO;
import asud.entity.Segment;
import asud.service.SegmentService;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class DefaultSegmentService implements SegmentService {

  @Autowired
  private SegmentDAO segmentDAO;

  @Override
  public void save(final Segment category) {
    segmentDAO.save(category);
  }

  @Override
  public List<Segment> findAll() {
    return segmentDAO.findAll();
  }

  @Override
  public Segment findOne(final long id) {
    return segmentDAO.findOne(id);
  }

  @Override
  public void delete(final long id) {
    segmentDAO.delete(id);
  }

  @Override
  public List<Segment> findSegmentsByCategory(final String name) {
    final List<Segment> segments = segmentDAO.findByCategoryName(name);
    return segments.stream().map(this::getFullSegment).collect(Collectors.toList());
  }

  @Override
  public Segment getFullSegment(final Segment segment) {
    Hibernate.initialize(segment.getRegulations());
    Hibernate.initialize(segment.getSubSegments());
    Hibernate.initialize(segment.getThreatProtections());
    return segment;
  }
}
