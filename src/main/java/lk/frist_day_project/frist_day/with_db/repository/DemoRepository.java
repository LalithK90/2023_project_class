package lk.frist_day_project.frist_day.with_db.repository;


import lk.frist_day_project.frist_day.with_db.entity.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepository extends JpaRepository<DemoEntity, Long> {
}
