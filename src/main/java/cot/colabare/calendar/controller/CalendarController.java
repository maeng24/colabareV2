package cot.colabare.calendar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/calendar/*")
@AllArgsConstructor
public class CalendarController {

	@GetMapping("/calendarform")
	public void calendarList(){
		
	}
	@GetMapping("/calendarform2")
	public void calendarList2(){
		
	}
	
}
