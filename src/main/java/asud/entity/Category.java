package asud.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "category")
public class Category {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String name;

  @OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
  private List<Segment> segments;

  public Category() {
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

  public List<Segment> getSegments() {
    return segments;
  }

  public void setSegments(final List<Segment> segments) {
    this.segments = segments;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    final Category category = (Category) o;
    return id == category.id &&
            Objects.equals(name, category.name) &&
            Objects.equals(segments, category.segments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, segments);
  }
}
