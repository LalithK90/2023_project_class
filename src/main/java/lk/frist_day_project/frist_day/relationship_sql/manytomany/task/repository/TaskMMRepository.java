package lk.frist_day_project.frist_day.relationship_sql.manytomany.task.repository;


import lk.frist_day_project.frist_day.relationship_sql.manytomany.task.entity.TaskMM;
import lk.frist_day_project.frist_day.relationship_sql.onetoone.task.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskMMRepository extends JpaRepository<TaskMM, Long> {
}
