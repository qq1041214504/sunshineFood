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
	
	@RequestMapping("dianpu")
	public String dianpu(HttpServletRequest request,Model model) {
		List<Seller> seller = productservice.SellerSelect();
		request.setAttribute("seller", seller);
		model.addAttribute("seller",seller);
		return null;
	}
	
	@RequestMapping("shangpinfenlei")
	public String shangpingfenlei(HttpServletRequest request,Model model) {
		List<Product> product = productservice.Productselect();
		request.setAttribute("product", product);
		model.addAttribute("product",product);
		return null;
	}
	
	@RequestMapping("dianjiashangping")
	public String dianjiaID(HttpServletRequest request,Model model,Integer sellerId) {
		List<Product> productseller = productservice.productSellerSelect(sellerId);
		request.setAttribute("productseller", productseller);
		model.addAttribute("productseller",productseller);
		return null;
	}
	
	@RequestMapping("selectProductCategory")
	public String selectProductCategory(HttpServletRequest request,Model model) {
		List<ProductCategory> ProductCategory = productservice.selectProductCategory();
		request.setAttribute("ProductCategory", ProductCategory);
		model.addAttribute("ProductCategory",ProductCategory);
		return null;
	}
}