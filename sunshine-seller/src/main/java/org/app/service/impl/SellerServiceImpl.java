package org.app.service.impl;

import java.util.List;

import org.app.service.SellerService;
import org.dao.SellerMapper;
import org.entity.Seller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class SellerServiceImpl implements SellerService {
  @Autowired
  private SellerMapper sellermapper;
	@Override
	public List<Seller> SellerList() {
		
		return sellermapper.SellerList();
	}

	@Override
	public List<Seller> findSellerBy(String sellerName,int sellerTypeid) {
	
		return sellermapper.findSellerBy(sellerName,sellerTypeid);
	}

	@Override
	public int AddSeller(Seller seller) {
		
		return sellermapper.AddSeller(seller);
	}

	@Override
	public int UpdateSeller(int id, Seller seller) {
		
		return sellermapper.UpdateSeller(id, seller);
	}

	@Override
	public int DelSeller(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
