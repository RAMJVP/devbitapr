package com.example.devbitjson;


public class Photo {
	
	
	private int id;
	private String url;

	private Photo(Builder builder) {
		this.id = builder.id;
		this.url = builder.url;
	}
	
	public Photo(){
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Photo [id=" + id + ", url=" + url + "]";
	}


	public static Builder builder() {
		return new Builder();
	}
	public static final class Builder {
		private int id;
		private String url;

		public Builder() {
		}

		public Builder withId(int id) {
			this.id = id;
			return this;
		}

		public Builder withUrl(String url) {
			this.url = url;
			return this;
		}

		public Photo build() {
			return new Photo(this);
		}
	}
	
	
	
	
	

}
