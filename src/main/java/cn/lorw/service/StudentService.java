package cn.lorw.service;

import cn.lorw.domain.Student;
import cn.lorw.exception.LoginException;

public interface StudentService {

    Student queryByLogin(String sid, String spassword) throws LoginException;
}
