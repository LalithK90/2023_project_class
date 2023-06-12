package lk.frist_day_project.frist_day.relationship_sql.onetoone.task.repository;


import lk.frist_day_project.frist_day.relationship_sql.onetoone.task.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
