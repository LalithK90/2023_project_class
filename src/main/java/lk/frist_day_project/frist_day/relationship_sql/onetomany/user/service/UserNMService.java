package lk.frist_day_project.frist_day.relationship_sql.onetomany.user.service;


import lk.frist_day_project.frist_day.relationship_sql.onetomany.user.entity.UserNM;
import lk.frist_day_project.frist_day.relationship_sql.onetomany.user.repository.UserNMRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserNMService {

    private final UserNMRepository userRepository;
    public void persist(UserNM user) {
        userRepository.save(user);
    }

    public List<UserNM> findAll() {
        return userRepository.findAll();
    }

    public UserNM findById(Long id) {
        return userRepository.getReferenceById(id);}

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
