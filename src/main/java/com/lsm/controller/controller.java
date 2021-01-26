package com.lsm.controller;

import com.lsm.pojo.bookinfo;
import com.lsm.server.impl.bookinfoimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.apache.log4j.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class controller {
    Logger logger = Logger.getLogger(controller.class);
    @Autowired
    private bookinfoimpl bookinfoimpl;
    @RequestMapping("/login")
    public String logina(){
        return "login";
    }
    @RequestMapping(value = "account/main")
    public String dd(String name, String pass, HttpSession session, HttpServletRequest request){
        System.out.println(name+" "+pass);
        logger.info("===LoginController类的adminLogin方法===");
        if ("admin".equals(name)&&"123".equals(pass)){
            session.setAttribute("loginuser",name);
            return "redirect:/main";
        }
        if (name==null||pass==null){
            request.setAttribute("error","请登录");
            return "login";
        }
        request.setAttribute("error","账号密码错误");
        return "login";
    }

    @RequestMapping(value = "zhuxiao")
    public String dd(HttpSession session){
        session.removeAttribute("loginuser");
        return "login";
    }
    @RequestMapping(value = "main")
    public String main(){
        return "test";
    }
    }
