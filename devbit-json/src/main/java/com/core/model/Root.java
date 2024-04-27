package com.core.model;
public class Root{
    public String id;
    public String name;
    public Data data;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Root [id=" + id + ", name=" + name + ", data=" + data + "]";
	}
    
}

