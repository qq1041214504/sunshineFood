package cn.backstage.service.impl;

import java.util.List;

import org.dao.BuyerMapper;
import org.entity.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.backstage.service.BackstageService;
@Service
public class BackstageServiceImpl  implements BackstageService{
	@Autowired
	private BuyerMapper buyerMapper;
	@Override
	public List<Buyer> getAll(int pageNo) {
		return null;
	}

	@Override
	public int addBuyer(String buyerName, String buyerPassword) {
		// TODO Auto-generated method stub
		return buyerMapper.addBuyer(buyerName, buyerPassword);
	}

}
