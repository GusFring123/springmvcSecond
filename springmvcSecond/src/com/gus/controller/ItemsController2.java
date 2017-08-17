package com.gus.controller;

import com.gus.po.Items;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/**
 * The type Items controller 1.
 * 实现HttpRequestHandler接口的处理器
 */
public class ItemsController2 implements HttpRequestHandler {

//    使用这种方法可以改变response的响应的数据格式，比如响应json数据
    @Override
    public void handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

        List<Items> itemsList = new ArrayList<Items>();
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
//        设置模型数据
        httpServletRequest.setAttribute("itemsList", itemsList);
//        设置转发的视图
        httpServletRequest.getRequestDispatcher("/WEB-INF/jsp/items/itemsList.jsp").forward(httpServletRequest,httpServletResponse);


    }
//    @Override
//    public ModelAndView handleRequest(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) throws Exception {
////        将来这里整合service，dao之后
////        调用srevice查询数据库，查询商品列表，这里使用静态数据来模拟
//        List<Items> itemsList = new ArrayList<Items>();
////        填充静态数据
//
//        Items items_1 = new Items();
//        items_1.setName("联想笔记本");
//        items_1.setPrice(6000f);
//        items_1.setDetail("ThinkPad T430 联想笔记本电脑！");
//
//        Items items_2 = new Items();
//        items_2.setName("苹果手机");
//        items_2.setPrice(5000f);
//        items_2.setDetail("iphone6苹果手机！");
//
//        itemsList.add(items_1);
//        itemsList.add(items_2);
//
////        返回ModelAndView
//        ModelAndView modelAndView = new ModelAndView();
//
////        相当于request的setAttribute方法
//        modelAndView.addObject("itemsList",itemsList);
//
////        指定视图
//        modelAndView.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
//
//        return modelAndView;
//    }


}
