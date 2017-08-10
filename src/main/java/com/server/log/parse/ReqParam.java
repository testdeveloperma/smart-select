package com.server.log.parse;

public class ReqParam {

	private Integer id;
	
	private String url;
	
	private String header;
	
	private String req;
	
	private String resp;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public String getReq() {
		return req;
	}

	public void setReq(String req) {
		this.req = req;
	}

	public String getResp() {
		return resp;
	}

	public void setResp(String resp) {
		this.resp = resp;
	}

	@Override
	public String toString() {
		return "ReqParam [id=" + id + ", url=" + url + ", header=" + header + ", req=" + req + ", resp=" + resp + "]";
	}
	
	
	
	
	
}
