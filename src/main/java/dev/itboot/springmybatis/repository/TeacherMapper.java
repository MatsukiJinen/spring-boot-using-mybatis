package dev.itboot.springmybatis.repository;

import dev.itboot.springmybatis.model.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TeacherMapper {
    @Select("SELECT * FROM teacher")
    List<Teacher> selectAll();

    @Select({
            "SELECT * FROM teacher",
            "WHERE id = #{id}"
    })
    Teacher selectByPrimaryKey(Long id);

    @Insert({
            "INSERT INTO teacher(user_name, email)",
            "VALUES(#{userName}, #{email})"
    })
    int insert(Teacher record);

    @Update({
            "UPDATE teacher",
            "SET user_name = #{userName}, email = #{email}",
            "WHERE id = #{id}"
    })
    int updateByPrimaryKey(Teacher record);

    @Delete({
            "DELETE FROM teacher",
            "WHERE id = #{id}"
    })
    int deleteByPrimaryKey(Long id);
}
