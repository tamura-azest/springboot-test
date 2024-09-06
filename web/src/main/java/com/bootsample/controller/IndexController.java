package com.bootsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import com.bootsample.service.UserService;

@Controller
public class IndexController {

    @Autowired
	UserService userService;

	private static final Logger log = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String helloWorld(Model model) throws InterruptedException {

		log.info("Index");

		for (int i = 0; i < 100; i++) {
			userService.findAll();
		}

		log.info("Access!!");

        return "index";
    }

    @RequestMapping(value = "/check", method = RequestMethod.GET)
    public String check(Model model) throws InterruptedException {

		log.info("Check");

        return "check";
    }
}
