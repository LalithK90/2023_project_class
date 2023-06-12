package lk.frist_day_project.frist_day.relationship_sql.onetoone.user.service;

import lk.frist_day_project.frist_day.relationship_sql.onetoone.user.entity.User;
import lk.frist_day_project.frist_day.relationship_sql.onetoone.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    public void persist(User user) {
        userRepository.save(user);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        return userRepository.getReferenceById(id);}

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
