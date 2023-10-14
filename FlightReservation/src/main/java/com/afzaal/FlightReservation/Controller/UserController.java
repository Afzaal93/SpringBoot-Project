package com.afzaal.FlightReservation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.afzaal.FlightReservation.Dao.UserDao;
import com.afzaal.FlightReservation.Entities.User;

@Controller
public class UserController {
	@Autowired
	private UserDao dao;

	@RequestMapping("/Register")
	public String Register() {
		System.out.println("hello");
		return "User/Register";
	}

	@PostMapping("/RegisterServlet")
	public String save(@ModelAttribute("user") User user) {
		this.dao.save(user);
		System.out.println(user);
		return "User/login";
	}

	@RequestMapping("/loginPage")
	public String loginpage() {
		return "User/login";
	}

	@PostMapping("/login")
	public String login(@RequestParam("password") String password, @RequestParam("email") String email) {

		List<User> user = dao.findByEmail(email);
		//System.out.println(user);
		for (User user2 : user) {
			if (user2.getPassword().equals(password)) {
				System.out.println(password);
				return "Flight/FindFlight";
			}

		}
		return "User/login";

	}
}
