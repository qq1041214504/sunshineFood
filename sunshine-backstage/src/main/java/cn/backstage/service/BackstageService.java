package cn.backstage.service;

import java.util.List;

import org.entity.Buyer;
import org.springframework.stereotype.Service;

public interface BackstageService {
	public List<Buyer> getAll(int pageNo);
	
	int addBuyer(String buyerName,String buyerPassword);

}
