package orm.rider.service.impl;

import org.dao.RiderMapper;
import org.entity.Rider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import orm.rider.service.RiderService;
@Service
public class RiderServiceImpl implements RiderService{
	
	@Autowired
	private RiderMapper riderMapper;
	@Override
	public Rider login(Rider rider) {
		// TODO Auto-generated method stub
		Rider newRider=riderMapper.selectByPhone(rider.getRiderPhone());
		if (newRider.getRiderPassword().equals(rider.getRiderPassword())&&rider.getRiderPassword()!=null) {
			return newRider;
		}else{
		return null;
		}
	}

}
