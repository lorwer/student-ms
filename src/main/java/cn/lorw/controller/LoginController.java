package cn.lorw.controller;

import cn.lorw.domain.Student;
import cn.lorw.exception.LoginException;
import cn.lorw.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login-controller")
public class LoginController {

    @Resource
    StudentService studentService;

    @RequestMapping("/student-login")
    public ModelAndView studentLogin(@RequestParam("sid") String sid, @RequestParam("spassword") String spassword,
                                     HttpSession session) {

        ModelAndView mv = new ModelAndView();

        try {
            Student student = studentService.queryByLogin(sid, spassword);
            session.setAttribute("sid", sid);
            session.setAttribute("sname", student.getSname());
            mv.setViewName("student/studentFace");
        } catch (LoginException e) {
            mv.addObject("msg", e.getMessage());
            mv.setViewName("fail");
        }

        return mv;
    }

}
