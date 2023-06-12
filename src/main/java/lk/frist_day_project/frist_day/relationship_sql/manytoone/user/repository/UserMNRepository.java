package lk.frist_day_project.frist_day.relationship_sql.manytoone.user.repository;


import lk.frist_day_project.frist_day.relationship_sql.manytoone.user.entity.UserMN;
import lk.frist_day_project.frist_day.relationship_sql.onetoone.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserMNRepository extends JpaRepository<UserMN, Long> {
}
