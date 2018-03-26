package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * A Simple SpringMVC Demo 
 * @author wuMaoZheng
 * @date 2017年12月6日 下午8:20:30
 * @version V1.0.0
 */
@Controller
@RequestMapping(value = "/index")
public class HelloWorldController {

	@ResponseBody
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		modelAndView.addObject("msg", "Hello World!");
		return modelAndView;
	}

}