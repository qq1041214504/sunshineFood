package renying.service;

import java.util.List;

import org.entity.Buyer;

public interface BuyerService {
	Buyer login(String buyerName,String buyerPassword);
	int addBuyer(String buyerName,String buyerPassword);
	Buyer selByName(String buyerName);
	List<Buyer> getAllBuyer();
}
