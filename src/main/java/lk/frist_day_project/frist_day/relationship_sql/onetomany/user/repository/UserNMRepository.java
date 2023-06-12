package lk.frist_day_project.frist_day.relationship_sql.onetomany.user.repository;


import lk.frist_day_project.frist_day.relationship_sql.onetomany.user.entity.UserNM;
import lk.frist_day_project.frist_day.relationship_sql.onetoone.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserNMRepository extends JpaRepository<UserNM, Long> {
}
