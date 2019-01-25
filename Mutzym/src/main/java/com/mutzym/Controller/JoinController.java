package com.mutzym.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class JoinController {
	
	@RequestMapping("/Join")
	public String root() {
		return "join";
	}

}
