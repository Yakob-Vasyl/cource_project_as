package asud.service;

import asud.entity.Segment;

import java.util.List;

public interface SegmentService {
  void save(Segment category);

  List<Segment> findAll();

  Segment findOne(final long id);

  void delete(final long id);

  List<Segment> findSegmentsByCategory(final String name);

  Segment getFullSegment(final Segment segment);
}
