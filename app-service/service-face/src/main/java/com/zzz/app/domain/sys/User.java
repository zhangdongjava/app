package com.zzz.app.domain.sys;

import com.zzz.app.domain.base.BaseModel;

public class User extends BaseModel{

	private static final long serialVersionUID = 1L;
	
	private String userName;
	
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + "]";
	}
	
	

}
