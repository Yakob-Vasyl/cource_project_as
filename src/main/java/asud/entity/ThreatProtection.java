package asud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "threat_protection")
public class ThreatProtection {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String threat;

  private String protection;

  @ManyToOne
  private Segment segment;

  public ThreatProtection() {
  }

  public long getId() {
    return id;
  }

  public void setId(final long id) {
    this.id = id;
  }

  public String getThreat() {
    return threat;
  }

  public void setThreat(final String threat) {
    this.threat = threat;
  }

  public String getProtection() {
    return protection;
  }

  public void setProtection(final String protection) {
    this.protection = protection;
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
    final ThreatProtection that = (ThreatProtection) o;
    return id == that.id &&
            Objects.equals(threat, that.threat) &&
            Objects.equals(protection, that.protection) &&
            Objects.equals(segment, that.segment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, threat, protection, segment);
  }
}
