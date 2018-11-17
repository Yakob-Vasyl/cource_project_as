package asud.dao;

import asud.entity.Segment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.validation.constraints.Size;
import java.util.List;

public interface SegmentDAO extends JpaRepository<Segment, Long> {
//  @Query("select s from Segment s where s.category.id=:id")
  List<Segment> findByCategoryName (final String name);
}
