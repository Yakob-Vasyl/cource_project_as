package asud.dao;


import asud.entity.AutomationSystem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutomationSystemDAO extends JpaRepository<AutomationSystem, Long> {
}
