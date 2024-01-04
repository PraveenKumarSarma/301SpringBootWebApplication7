package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NumberController 
{
	@RequestMapping("/")
	public String numberForm()
	{
		return "number";
	}
	

	@RequestMapping("/req1")
	public String bigNumber(@RequestParam int fNumber,@RequestParam int sNumber,@RequestParam int tNumber,ModelMap model)
	{
		model.put("fNumber", fNumber);
		model.put("sNumber", sNumber);
		model.put("tNumber", tNumber);
		
		String message=null;
		if(fNumber > sNumber && fNumber > sNumber)
		{
			message="first Number is Biggest";
		}
		else if(sNumber > fNumber && sNumber > tNumber)
		{
			message="second Number is Biggest";
		}
		else
		{
			message="third Number is Biggest";
		}
		
		model.put("message", message);
		return "result";
				
	}
}
