package lk.frist_day_project.frist_day.with_db.service;

import lk.frist_day_project.frist_day.with_db.entity.DemoEntity;
import lk.frist_day_project.frist_day.with_db.repository.DemoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DemoService {

    private final DemoRepository demoRepository;
    public void persist(DemoEntity demoEntity) {
        demoRepository.save(demoEntity);
    }

    public List<DemoEntity> findAll() {
        return demoRepository.findAll();
    }

    public DemoEntity findById(Long id) {
        return demoRepository.getReferenceById(id);}

    public void deleteById(Long id) {
        demoRepository.deleteById(id);
    }
}
