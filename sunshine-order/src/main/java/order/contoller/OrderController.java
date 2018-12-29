package order.contoller;

import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.entity.OrderMaster;
import org.entity.Paramt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;

import order.service.OrderService;

@Controller
public class OrderController {
	
	@Autowired private OrderService orderService;
	
	@RequestMapping(value="/see")
	@ResponseBody
	public Object getAll() {
		List<OrderMaster> list = orderService.getAllOrder();
		Integer a = list.size();
		return JSON.toJSON(a.toString());
	}
	
	@RequestMapping(value="/getone")
	@ResponseBody
	public Object getOrderMasterById(HttpServletRequest request) {
		String orderId = request.getParameter("orderId");
		Paramt param = orderService.getOrderMasterById(orderId);
		return JSON.toJSON(param);
	}
	
}
