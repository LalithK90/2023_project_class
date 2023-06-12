package lk.frist_day_project.frist_day.relationship_sql.manytoone.user.service;


import lk.frist_day_project.frist_day.relationship_sql.manytoone.user.entity.UserMN;
import lk.frist_day_project.frist_day.relationship_sql.manytoone.user.repository.UserMNRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserMNService {

    private final UserMNRepository userRepository;
    public void persist(UserMN user) {
        userRepository.save(user);
    }

    public List<UserMN> findAll() {
        return userRepository.findAll();
    }

    public UserMN findById(Long id) {
        return userRepository.getReferenceById(id);}

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
