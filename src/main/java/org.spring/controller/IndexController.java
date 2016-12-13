package org.spring.controller;

import org.spring.model.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ningzhao6 on 2016/12/13 0013.
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String defaultIndex(ModelMap modelMap){
        List<UserBean> userBeans = new ArrayList<UserBean>();
        UserBean userBeanA = new UserBean();
        UserBean userBeanB = new UserBean();

        userBeanA.setName("zhang");
        userBeanA.setAge(27);
        userBeanB.setName("li");
        userBeanB.setAge(35);

        userBeans.add(userBeanA);
        userBeans.add(userBeanB);
        modelMap.addAttribute("users", userBeans);

        return "index";
    }
}
