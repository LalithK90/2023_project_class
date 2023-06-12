package lk.frist_day_project.frist_day.relationship_sql.onetoone.task.entity;

import jakarta.persistence.*;
import lk.frist_day_project.frist_day.relationship_sql.onetoone.user.entity.User;
import lombok.*;
import org.hibernate.sql.results.jdbc.internal.JdbcValuesResultSetImpl;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User  user;

}
