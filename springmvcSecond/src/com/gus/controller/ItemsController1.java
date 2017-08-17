package com.gus.controller;

import com.gus.po.Items;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Items controller 1.
 * 实现controller接口的处理器
 */
public class ItemsController1 implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws Exception {
//        将来这里整合service，dao之后
//        调用srevice查询数据库，查询商品列表，这里使用静态数据来模拟
        List<Items> itemsList = new ArrayList<Items>();
//        填充静态数据

        Items items_1 = new Items();
        items_1.setName("联想笔记本");
        items_1.setPrice(6000f);
        items_1.setDetail("ThinkPad T430 联想笔记本电脑！");

        Items items_2 = new Items();
        items_2.setName("苹果手机");
        items_2.setPrice(5000f);
        items_2.setDetail("iphone6苹果手机！");

        itemsList.add(items_1);
        itemsList.add(items_2);

//        返回ModelAndView
        ModelAndView modelAndView = new ModelAndView();

//        相当于request的setAttribute方法
        modelAndView.addObject("itemsList",itemsList);

//        指定视图
        modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");

        return modelAndView;
    }
}
