package lk.frist_day_project.frist_day.relationship_sql.manytomany.task.service;


import lk.frist_day_project.frist_day.relationship_sql.manytomany.task.entity.TaskMM;
import lk.frist_day_project.frist_day.relationship_sql.manytomany.task.repository.TaskMMRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskMMService {

    private final TaskMMRepository taskRepository;
    public void persist(TaskMM task) {
        taskRepository.save(task);
    }

    public List<TaskMM> findAll() {
        return taskRepository.findAll();
    }

    public TaskMM findById(Long id) {
        return taskRepository.getReferenceById(id);}

    public void deleteById(Long id) {
        taskRepository.deleteById(id);
    }
}
