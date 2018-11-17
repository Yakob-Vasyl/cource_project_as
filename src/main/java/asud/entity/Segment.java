package asud.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "segment")
public class Segment {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String name;

  @ManyToOne
  private Category category;

  @OneToMany(mappedBy = "segment", fetch = FetchType.LAZY)
  private List<ThreatProtection> threatProtections;

  @OneToMany(mappedBy = "segment", fetch = FetchType.LAZY)
  private List<Regulation> regulations;

  @OneToMany(mappedBy = "segment", fetch = FetchType.LAZY)
  private List<SubSegment> subSegments;

  public Segment() {
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

  public Category getCategory() {
    return category;
  }

  public void setCategory(final Category category) {
    this.category = category;
  }

  public List<ThreatProtection> getThreatProtections() {
    return threatProtections;
  }

  public void setThreatProtections(final List<ThreatProtection> threatProtections) {
    this.threatProtections = threatProtections;
  }

  public List<Regulation> getRegulations() {
    return regulations;
  }

  public void setRegulations(final List<Regulation> regulations) {
    this.regulations = regulations;
  }

  public List<SubSegment> getSubSegments() {
    return subSegments;
  }

  public void setSubSegments(final List<SubSegment> subSegments) {
    this.subSegments = subSegments;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    final Segment segment = (Segment) o;
    return id == segment.id &&
            Objects.equals(name, segment.name) &&
            Objects.equals(category, segment.category) &&
            Objects.equals(threatProtections, segment.threatProtections) &&
            Objects.equals(regulations, segment.regulations) &&
            Objects.equals(subSegments, segment.subSegments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, category, threatProtections, regulations, subSegments);
  }
}
