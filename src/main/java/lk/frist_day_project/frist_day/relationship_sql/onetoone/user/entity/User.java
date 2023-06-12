package lk.frist_day_project.frist_day.relationship_sql.onetoone.user.entity;

import jakarta.persistence.*;
import lk.frist_day_project.frist_day.relationship_sql.onetoone.task.entity.Task;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Task task;

}
