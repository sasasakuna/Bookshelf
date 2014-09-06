package com.thoughtworks.bs.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

//    @RequestMapping(value = "/toLogin", method = RequestMethod.GET)
//    public String toLoginPage(HttpServletRequest request, Model model) {
//        Map<String, ?> map = RequestContextUtils.getInputFlashMap(request);
//        map = map == null ? new HashMap() : map;
//        if (map.containsKey("loginError")) {
//            model.addAttribute("loginError", map.get("loginError"));
//            model.addAttribute("errorType", "loginError");
//        }
//        return "login";
//    }
//
//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    public String login(RedirectAttributes redirectAttributes) {
//        redirectAttributes.addFlashAttribute("loginError", "Username and password is invalid!");
//        return "redirect:/toLogin";
//    }

    @RequestMapping(value = "/toLogin", method = RequestMethod.POST)
    public String toLoginPage(HttpServletRequest request, Model model) {
        String userName = request.getParameter("username");
        System.out.println(userName);
        String password = request.getParameter("password");
        System.out.println(password);

        if(userName.equals("admin")&&password.equals("123")){
            return "admin";
        }
        else{
            return "login";
        }

    }

}
