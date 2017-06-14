package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.model.Activity;
import com.spring.model.Exercise;
import com.spring.service.ExerciseService;

@Controller
public class MinutesController {

	@Autowired
	private ExerciseService exerciseService;

	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {

		System.out.println("exercise :" + exercise.getMinutes());
		// return "redirect:addMoreMinutes.html";
		return "addMinutes";
	}

	@RequestMapping(value = "/activities", method = RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities() {

		return exerciseService.findAllActivities();
	}

	// commenting for static view
	/*
	 * @RequestMapping(value = "/addMoreMinutes") public String
	 * addMoreMinutes(@ModelAttribute ("exercise") Exercise exercise){
	 * 
	 * System.out.println("adding exercise:"+ exercise.getMinutes());
	 * 
	 * return "addMinutes"; }
	 */
}
