package cn.lorw.dao;

import cn.lorw.domain.Student;
import org.apache.ibatis.annotations.Param;

public interface StudentDao {

    /**
     * 学生登陆的dao接口
     * @param sid 学号
     * @param spassword 学生密码
     * @return Student实体类
     */
    Student queryByLogin(@Param("sid") String sid, @Param("spassword") String spassword);

}
