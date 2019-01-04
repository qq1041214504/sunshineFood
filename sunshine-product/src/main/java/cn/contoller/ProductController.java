package cn.contoller;

import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productservice;
	
	@RequestMapping("productcategoryselect")
	public Object productcategoryselect(HttpServletRequest request,Model model,Integer sellerId) {
		/*List<ProductCategory> ProductCategory = productservice.productcategoryselect(seller);
		request.setAttribute("ProductCategory", ProductCategory);
		model.addAttribute("ProductCategory",ProductCategory);*/
	
        return productservice.productcategoryselect(sellerId);
	}
	
	@RequestMapping("ProductSelect")
	public Object ProductSelect(Integer categoryId) {
		
		return productservice.ProductSelect(categoryId);
	}
	
	/*@RequestMapping("select")
	public String select(HttpServletRequest request,Model model) {
		List<ProductCategory> ProductCategory=productservice.select();
		request.setAttribute("ProductCategory", ProductCategory);
		model.addAttribute("ProductCategory",ProductCategory);
		return null;
		
	}*/
}