package lk.frist_day_project.frist_day.relationship_sql.manytoone.task.repository;


import lk.frist_day_project.frist_day.relationship_sql.manytoone.task.entity.TaskMN;
import lk.frist_day_project.frist_day.relationship_sql.onetoone.task.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskMNRepository extends JpaRepository<TaskMN, Long> {
}
