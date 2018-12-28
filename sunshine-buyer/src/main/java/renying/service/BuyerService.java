package renying.service;

import org.entity.Buyer;

public interface BuyerService {
	Buyer login(String buyerName,String buyerPassword);
	int addBuyer(String buyerName,String buyerPassword);
	Buyer selByName(String buyerName);
}
