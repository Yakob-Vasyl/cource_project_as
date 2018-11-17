package asud.service;


import asud.entity.User;

public interface UserService {

  void save(User user);

  User findUnique(String email, String password);

  User findByEmail(String email);
}
