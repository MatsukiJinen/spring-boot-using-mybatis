package dev.itboot.springmybatis.service;

import dev.itboot.springmybatis.model.Teacher;
import dev.itboot.springmybatis.repository.TeacherMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class TeacherService {

    private final TeacherMapper mapper;

    public List<Teacher> selectAll() {
        return mapper.selectAll();
    }

    public Teacher selectByPrimaryKey(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    public void save(Teacher teacher) {
        if (teacher.getId() == null) {
            mapper.insert(teacher);
        } else {
            mapper.updateByPrimaryKey(teacher);
        }
    }

    public void deleteByPrimaryKey(Long id) {
        mapper.deleteByPrimaryKey(id);
    }
}
