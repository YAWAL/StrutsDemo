package com.yavval.struts.example;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String sayHello() {
		return "success";
	}

	@Override
	public void validate() {
		if (name != null && name.equalsIgnoreCase("Valeriy")) {
			addActionMessage("Hello to U, " + name);
		} else {
			addActionError("You are not recognized");
		}
	}

}
