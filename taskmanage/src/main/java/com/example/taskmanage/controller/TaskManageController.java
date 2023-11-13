//演習40・41
package com.example.taskmanage.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;


import java.util.List;
import java.util.Map;

@Controller
public class TaskManageController {
//    //URLの後ろに?name=文字列　でnameのとこの表示を好きな文字列の表示に変更できる。
//    @GetMapping("/index")
//    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
//        model.addAttribute("name", name);
//        return "index";
//    }
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/")
    public String index(Model model) {
        String sql = "SELECT * FROM TASKS";
        System.out.println(jdbcTemplate.queryForList(sql));
//        List<Map<String, Object>> result = jdbcTemplate.queryForList(sql);
//        model.addAttribute("tasks", result);
        return "/task/index";
    }
}
//meta http-equiv="Content-Type" content="text/html; charset=UTF-8" /
