package com.meng.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
public class EventController {
    @RequestMapping("/doevent")
    @ResponseBody
    String doEvent(HttpServletRequest req, HttpServletResponse rsp){
        rsp.setContentType("text/event-stream");
        return "data:"+new Date().toString()+"\n\n";
    }
}
