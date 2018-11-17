package asud.dao;

import asud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserDAO extends JpaRepository<User, Long> {
  @Query("select distinct u from User u where u.email=?1 and u.password=?2")
  User findUnique(String email, String password);

  @Query("select distinct u from User u where u.email=?1")
  User findByEmail(String s);
}
