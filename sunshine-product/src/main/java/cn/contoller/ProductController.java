package cn.contoller;

import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productservice;
	
	/**
	 * 根据商家查询商品分类
	 * @param request
	 * @param model
	 * @param sellerId
	 * @return
	 */
	@RequestMapping("productcategoryselect")
	public Object productcategoryselect(HttpServletRequest request,Model model,Integer sellerId) {
		/*List<ProductCategory> ProductCategory = productservice.productcategoryselect(seller);
		request.setAttribute("ProductCategory", ProductCategory);
		model.addAttribute("ProductCategory",ProductCategory);*/
	
        return productservice.productcategoryselect(sellerId);
	}
	
	
	/**
	 * 根据商品分类查询商品
	 * @param categoryId
	 * @return
	 */
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
	
	/**
	 * 根据商家查询所有商品
	 * @param sellerId
	 * @return
	 */
	@RequestMapping("SpSelect")
	public Object SpSelect(Integer sellerId) {
		List<Product> list =productservice.SpSelect(sellerId);
		return list;
	}
	
	/**
	 * 新增商品
	 * @param product
	 * @return
	 */
	@RequestMapping("AddShangpin")
	public Object AddShangpin(Product product) {
		return	productservice.AddShangpin(product);
	}
	
	/**
	 * 修改商品
	 * @param product
	 * @return
	 */
	@RequestMapping("ShangPinUpdate")
	public Object ShangPinUpdate(Product product) {
		return productservice.ShangPinUpdate(product);
	}
	
	/**
	 * 删除商品
	 * @param productId
	 * @return
	 */
	@RequestMapping("ShangPinDel")
	public Object ShangPinDel(Integer productId) {
		return productservice.ShangPinDel(productId);
		
	}
	
}