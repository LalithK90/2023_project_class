package lk.frist_day_project.frist_day.relationship_sql.manytoone.task.service;


import lk.frist_day_project.frist_day.relationship_sql.manytoone.task.entity.TaskMN;
import lk.frist_day_project.frist_day.relationship_sql.manytoone.task.repository.TaskMNRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskMNService {

    private final TaskMNRepository taskRepository;
    public void persist(TaskMN task) {
        taskRepository.save(task);
    }

    public List<TaskMN> findAll() {
        return taskRepository.findAll();
    }

    public TaskMN findById(Long id) {
        return taskRepository.getReferenceById(id);}

    public void deleteById(Long id) {
        taskRepository.deleteById(id);
    }
}
