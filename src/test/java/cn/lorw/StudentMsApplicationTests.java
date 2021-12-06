package cn.lorw;

import cn.lorw.domain.Student;
import cn.lorw.exception.LoginException;
import cn.lorw.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class StudentMsApplicationTests {

	@Resource
	StudentService studentService;
	@Test
	void contextLoads() {
		Student student = new Student();
		try {
			student = studentService.queryByLogin("10001", "123");
		} catch (LoginException e) {
			e.printStackTrace();
		}
		System.out.println("=====================");
		System.out.println(student);
		if (student == null) {
			System.out.println("登陆失败");
		} else {
			System.out.println(student.getSname());
		}
		System.out.println("=====================");
	}

}
