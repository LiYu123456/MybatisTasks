package com.tasks.controller;

import com.tasks.entity.Student;
import com.tasks.entity.User;
import com.tasks.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    private List<User> userList = new ArrayList<User>();
    {
        userList.add(new User("孙悟空", new Date(), 1000, true));
        userList.add(new User("猪八戒", new Date(), 500, true));
        userList.add(new User("沙和尚", new Date(), 300, false));
        userList.add(new User("唐三藏", new Date(), 20, true));
    }

    private Map<String, User> userMap = new HashMap<String, User>();
    {
        userMap.put("1", new User("孙悟空", new Date(), 1000, true));
        userMap.put("2", new User("猪八戒", new Date(), 500, true));
        userMap.put("3", new User("沙和尚", new Date(), 300, false));
        userMap.put("4", new User("唐三藏", new Date(), 20, true));
    }

    private Map<String, String> appInfoMap = new HashMap<String, String>();
    {
        appInfoMap.put("风控", "1");
        appInfoMap.put("贸通", "2");
        appInfoMap.put("非贸", "3");
        appInfoMap.put("减免税", "4");
        appInfoMap.put("税管", "5");
    }

    @PostMapping("/insertStudent")
    public void insertStudent(@RequestBody Student student){
        studentService.insertStudent(student);
    }

    @GetMapping("/index")
    public String selectStudentById(Model model){
        model.addAttribute("name","三毛");
        model.addAttribute("userList", userList);
        model.addAttribute("userMap", userMap);

        model.addAttribute("appInfoMap",appInfoMap);
        return "index";
    }
}
