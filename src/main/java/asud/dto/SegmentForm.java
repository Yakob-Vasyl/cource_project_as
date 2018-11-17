package asud.dto;

import asud.entity.Category;
import asud.entity.Regulation;
import asud.entity.SubSegment;
import asud.entity.ThreatProtection;

import java.util.List;

public class SegmentForm {

  private long id;

  private String name;

  private Category category;

  private List<ThreatProtection> threatProtections;

  private List<Regulation> regulations;

  private List<SubSegment> subSegments;

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
}

