package cn.contoller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.entity.Product;
import org.entity.ProductCategory;
import org.entity.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productservice;
	
	@RequestMapping("productcategoryselect")
	public String productcategoryselect(HttpServletRequest request,Model model,Integer seller) {
		List<ProductCategory> ProductCategory = productservice.productcategoryselect(seller);
		request.setAttribute("ProductCategory", ProductCategory);
		model.addAttribute("ProductCategory",ProductCategory);
		return null;
	}
	
	@RequestMapping("ProductSelect")
	public String ProductSelect(HttpServletRequest request,Model model,Integer categoryId) {
		List<Product> Product = productservice.ProductSelect(categoryId);
		request.setAttribute("Product", Product);
		model.addAttribute("Product",Product);
		return null;
	}
	
	/*@RequestMapping("select")shenzhijie
	public String select(HttpServletRequest request,Model model) {
		List<ProductCategory> ProductCategory=productservice.select();
		request.setAttribute("ProductCategory", ProductCategory);
		model.addAttribute("ProductCategory",ProductCategory);
		return null;
		
	}*/
}