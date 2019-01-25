package com.mutzym.mapper;
import org.springframework.stereotype.Repository;


import com.mutzym.Model.User;


@Repository("com.mutzym.mapper.MutzymMapper")
public interface MutzymMapper {
	//public int UserListCount() throws Exception;
	
	public User UserLogin(User user) throws Exception;

}


