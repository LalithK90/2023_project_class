package lk.frist_day_project.frist_day.relationship_sql.manytomany.user.service;

import lk.frist_day_project.frist_day.relationship_sql.manytomany.user.entity.UserMM;
import lk.frist_day_project.frist_day.relationship_sql.manytomany.user.repository.UserMMRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserMMService {

    private final UserMMRepository userMMRepository;
    public void persist(UserMM userMM) {
        userMMRepository.save(userMM);
    }

    public List<UserMM> findAll() {
        return userMMRepository.findAll();
    }

    public UserMM findById(Long id) {
        return userMMRepository.getReferenceById(id);}

    public void deleteById(Long id) {
        userMMRepository.deleteById(id);
    }
}
