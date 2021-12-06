package cn.lorw.service.impl;

import cn.lorw.dao.StudentDao;
import cn.lorw.domain.Student;
import cn.lorw.exception.LoginException;
import cn.lorw.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {

    // 注入学生dao接口
    @Resource
    StudentDao studentDao;

    @Override
    public Student queryByLogin(String sid, String spassword) throws LoginException {
        // 返回查询结果, return：Student实体
        //return studentDao.queryByLogin(sid, spassword);

        Student student = studentDao.queryByLogin(sid, spassword);

        // 抛出自定义异常，在controller中捕获给msg
        if(student == null) {
            throw new LoginException("账号或密码错误！");
        }

        return student;

    }
}
