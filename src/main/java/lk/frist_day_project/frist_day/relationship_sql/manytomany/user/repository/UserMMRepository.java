package lk.frist_day_project.frist_day.relationship_sql.manytomany.user.repository;


import lk.frist_day_project.frist_day.relationship_sql.manytomany.user.entity.UserMM;
import lk.frist_day_project.frist_day.relationship_sql.onetoone.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserMMRepository extends JpaRepository<UserMM, Long> {
}
