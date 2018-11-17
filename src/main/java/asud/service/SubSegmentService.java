package asud.service;

import asud.entity.SubSegment;

import java.util.List;

public interface SubSegmentService {
  void save(SubSegment category);

  List<SubSegment> findAll();

  SubSegment findOne(long id);

  void delete(long id);
}
