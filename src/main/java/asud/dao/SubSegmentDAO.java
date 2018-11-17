package asud.dao;

import asud.entity.SubSegment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubSegmentDAO extends JpaRepository<SubSegment, Long> {
  List<SubSegment> findSubSegmentBySegmentName(final String name);
}
