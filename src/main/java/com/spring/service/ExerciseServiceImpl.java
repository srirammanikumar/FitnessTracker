package com.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.model.Activity;

@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {

	@Override
	public List<Activity> findAllActivities() {

		List<Activity> activities = new ArrayList<Activity>();

		Activity bike = new Activity();
		bike.setDesc("Bike");
		activities.add(bike);
		Activity swim = new Activity();
		swim.setDesc("Swim");
		activities.add(swim);
		Activity run = new Activity();
		run.setDesc("Run");
		activities.add(run);

		return activities;
	}
}
