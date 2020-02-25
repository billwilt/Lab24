package co.grandcircus.CoffeeShopDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import co.grandcircus.CoffeeShopDemo.beans.User;

@Controller
public class UserController {
	
	@Autowired
	UserDao uDao;
	
	@RequestMapping("/register")
	public ModelAndView register() {
		
		return new ModelAndView("register");
	}

	@PostMapping("/register")
	public ModelAndView register(@RequestParam("firstName") String firstName, 
			@RequestParam("lastName") String lastName,
			@RequestParam("email") String email,
			@RequestParam("phoneNumber") String phoneNumber,
			@RequestParam("password") String password) {
	
	User user = new User(firstName, lastName, email, phoneNumber, password);
	ModelAndView mv = new ModelAndView("Confirm");
	mv.addObject(user);
	uDao.addUser(user);
	return null;
}
}
