package org.app.service;

import java.util.List;
import org.entity.Seller;
public interface SellerService {
	
	List<Seller>SellerList();	
	List<Seller>findSellerBy(String sellerName,int sellerTypeid);	
	int AddSeller(Seller seller);
	int UpdateSeller(int id,Seller seller);
	int DelSeller(int id);
}
