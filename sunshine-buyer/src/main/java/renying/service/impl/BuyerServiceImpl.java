package renying.service.impl;

import org.dao.BuyerMapper;
import org.entity.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import renying.service.BuyerService;

@Service
public class BuyerServiceImpl implements BuyerService{
	@Autowired
	private BuyerMapper buyerMapper;
	
	@Override
	public Buyer login(String buyerName,String buyerPassword) {
		Buyer buyer=buyerMapper.login(buyerName);
		if(buyer.getBuyerPassword().equals(buyerPassword)) {
			return buyer;
		}
		return null;
	}

	@Override
	public int addBuyer(String buyerName, String buyerPassword) {
		return buyerMapper.addBuyer(buyerName, buyerPassword);
	}

	@Override
	public Buyer selByName(String buyerName) {
		return buyerMapper.login(buyerName);
	}

}
