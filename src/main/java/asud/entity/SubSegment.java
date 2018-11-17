package asud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "sub_segment")
public class SubSegment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String name;

  @ManyToOne
  private Segment segment;

  public SubSegment() {
  }

  public long getId() {
    return id;
  }

  public void setId(final long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public Segment getSegment() {
    return segment;
  }

  public void setSegment(final Segment segment) {
    this.segment = segment;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    final SubSegment that = (SubSegment) o;
    return id == that.id &&
            Objects.equals(name, that.name) &&
            Objects.equals(segment, that.segment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, segment);
  }
}
