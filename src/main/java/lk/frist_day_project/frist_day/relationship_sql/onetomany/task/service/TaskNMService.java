package lk.frist_day_project.frist_day.relationship_sql.onetomany.task.service;



import lk.frist_day_project.frist_day.relationship_sql.manytoone.task.repository.TaskMNRepository;
import lk.frist_day_project.frist_day.relationship_sql.onetomany.task.entity.TaskNM;
import lk.frist_day_project.frist_day.relationship_sql.onetomany.task.repository.TaskNMRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskNMService {

    private final TaskNMRepository taskRepository;
    public void persist(TaskNM task) {
        taskRepository.save(task);
    }

    public List<TaskNM> findAll() {
        return taskRepository.findAll();
    }

    public TaskNM findById(Long id) {
        return taskRepository.getReferenceById(id);}

    public void deleteById(Long id) {
        taskRepository.deleteById(id);
    }
}
