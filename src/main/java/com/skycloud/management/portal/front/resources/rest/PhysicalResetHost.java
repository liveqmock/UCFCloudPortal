package com.skycloud.management.portal.front.resources.rest;


public class PhysicalResetHost extends RestfulPath{

	//获取物理机电源状态
	public static final String PATH_RESET_HOST = "/rest/phyhost/resetHost";//重起
	
	public static final String ID = "id";
	public static final String RESULT = "result";
	
	private long id;//物理主机ID
	private String result;//执行结果

	public PhysicalResetHost() {
		super(PATH_RESET_HOST);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
		this.setParameter(ID, id);
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
		this.setParameter(RESULT, id);
	}

}
