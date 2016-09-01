package com.zzz.app.domain.base;

import java.io.Serializable;
import java.util.UUID;

public class BaseModel implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void setId() {
		this.id = UUID.randomUUID().toString().replaceAll("-", "");
	}

}
