package com.henryalonso.daikichipaths;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class AlonsohenrydaikichipathsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlonsohenrydaikichipathsApplication.class, args);
	} 
	@RestController
	@RequestMapping("/daikichi")
	public class DaikichiController {
		@RequestMapping("")
		public String index() {
			return "Welcome!";
		}
		
		@RequestMapping("/today")
		public String fortune1() {
			return "Today you will find good luck in all your endeavors!";
		}
		
		@RequestMapping("/tomorrow")
		public String fortune2() {
			return "Tomorrrow, an opportunity will arise, so be sure to be open to new ideas!";
		}
		
		@RequestMapping("/travel/{city}")
		public String travelToCity(@PathVariable("city") String city) {
			System.out.println("travelToCity method called with city = " + city);
			return "Congratulations! You will soon travel to " + city + "!";
		}
		
		@RequestMapping("/lotto/{number}")
		public String lotto(@PathVariable("number") int number) {
			String fortune;
			if (number % 2 == 0) {
				fortune = "You will take a grand journey in the near future, but be weary of tempting offers.";
			} else {
				fortune = "You have enjoyed the fruits of your labor but now it is a great time to spend time with family and friends.";
			}
			return fortune;
		}

	}
}
