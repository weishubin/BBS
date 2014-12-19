package com.weishubin.bbs.action;

import com.opensymphony.xwork2.ActionSupport;
import com.weishubin.bbs.service.UserService;


@Controller
@Scope("prototype")
public class LoginAction extends ActionSupport {
	
	@Autowired
	private UserService userSerivce;
	
	

	public String welcome() throws Exception {
        
	    return SUCCESS;
	 
	}
	
	public String execute() throws Exception {
	         
	    return SUCCESS;
	 
	}
	 
}
