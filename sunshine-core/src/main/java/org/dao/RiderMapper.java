package org.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.entity.Rider;
@Mapper
public interface RiderMapper {

	Rider selectByPhone(@Param("riderPhone")String riderPhone);
	
	int insertRider(Rider rider);
	
	int deleteRider(@Param("riderId") Integer riderId);
	
	int updateRider(Rider rider);
}
