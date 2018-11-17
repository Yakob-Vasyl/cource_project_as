package asud.service.impl;

import asud.dao.UserDAO;
import asud.entity.Role;
import asud.entity.User;
import asud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service("userDetailsService")
public class DefaultUserService implements UserService, UserDetailsService {

  @Autowired
  private UserDAO userDAO;

  @Autowired
  private BCryptPasswordEncoder encoder;

  @Override
  public void save(final User user) {
    user.setRole(Role.ROLE_USER);
    user.setPassword(encoder.encode(user.getPassword()));
    userDAO.save(user);
  }

  @Override
  public User findUnique(final String email, final String password) {
    return userDAO.findUnique(email, password);
  }

  @Override
  public User findByEmail(final String email) {
    return userDAO.findByEmail(email);
  }

  @Override
  public UserDetails loadUserByUsername(final String s) throws UsernameNotFoundException {
    return userDAO.findByEmail(s);
  }

  @PostConstruct
  public void addUser() {
    User user = userDAO.findByEmail("defaultUser");
    if (user == null) {
      user = new User();
      user.setEmail("defaultUser");
      user.setPassword(encoder.encode("defaultUser"));
      user.setRole(Role.ROLE_USER);
      userDAO.save(user);
    }
  }
}
