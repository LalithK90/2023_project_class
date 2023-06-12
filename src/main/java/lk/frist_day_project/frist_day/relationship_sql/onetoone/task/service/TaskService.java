package lk.frist_day_project.frist_day.relationship_sql.onetoone.task.service;

import lk.frist_day_project.frist_day.relationship_sql.onetoone.task.entity.Task;
import lk.frist_day_project.frist_day.relationship_sql.onetoone.task.repository.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;
    public void persist(Task task) {
        taskRepository.save(task);
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    public Task findById(Long id) {
        return taskRepository.getReferenceById(id);}

    public void deleteById(Long id) {
        taskRepository.deleteById(id);
    }
}
