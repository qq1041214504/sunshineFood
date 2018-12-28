package orm.rider.controller;

import org.entity.Rider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import orm.rider.service.RiderService;

@RestController
public class RiderController {
	@Autowired
	private RiderService riderService;
	@RequestMapping("login")
	public Object login(@RequestParam("riderPhone")String riderPhone,
			@RequestParam("riderPassword")String riderPassword){
		Rider rider = new Rider();
		rider.setRiderPassword(riderPassword);
		rider.setRiderPhone(riderPhone);
		
		return riderService.login(rider);
	}
}
