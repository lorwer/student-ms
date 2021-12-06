package cn.lorw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author luo
 *
 * 该项目于2021年12月6日（星期一）正式启动
 * (12.06)
 * 		1.完成学生登陆功能(上午已完成)
 * 	TODO 下午计划：完成登出功能、完成管理个人信息功能
 *
 */

@SpringBootApplication
// mapper扫描器
@MapperScan(basePackages = "cn.lorw.dao")
public class StudentMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentMsApplication.class, args);
	}

}
