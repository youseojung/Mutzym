package com.mutzym.Controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mutzym.Model.User;
import com.mutzym.mapper.MutzymMapper;

@Controller
 class LoginController {
	 
	 @Resource(name="com.mutzym.mapper.MutzymMapper")
	 MutzymMapper mMutzymMapper;

	@RequestMapping("/Login")
	private String Login(User user) throws Exception {
		System.out.println(user.getUSER_ID());
		System.out.println(user.getUSER_PWD());
		System.out.println(mMutzymMapper.UserLogin(user));
		return "home";
	}

}
