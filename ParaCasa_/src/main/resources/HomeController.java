package com.codersteam.Paracasa;

public class HomeController {
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.GetMapping;

	@Controller
	public class HomeController {
		
		@GetMapping("/")
			public String home() {
				return "home";
			}
		

	}


}
