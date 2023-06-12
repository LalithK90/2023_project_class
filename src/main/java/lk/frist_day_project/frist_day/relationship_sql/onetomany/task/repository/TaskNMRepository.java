package lk.frist_day_project.frist_day.relationship_sql.onetomany.task.repository;


import lk.frist_day_project.frist_day.relationship_sql.manytoone.task.entity.TaskMN;
import lk.frist_day_project.frist_day.relationship_sql.onetomany.task.entity.TaskNM;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskNMRepository extends JpaRepository<TaskNM, Long> {
}
