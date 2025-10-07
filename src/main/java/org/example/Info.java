package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Info{

	@JsonProperty("next")
	private String next;

	@JsonProperty("pages")
	private int pages;

	@JsonProperty("prev")
	private Object prev;

	@JsonProperty("count")
	private int count;

	public String getNext(){
		return next;
	}

	public int getPages(){
		return pages;
	}

	public Object getPrev(){
		return prev;
	}

	public int getCount(){
		return count;
	}

	@Override
 	public String toString(){
		return 
			"Info{" + 
			"next = '" + next + '\'' + 
			",pages = '" + pages + '\'' + 
			",prev = '" + prev + '\'' + 
			",count = '" + count + '\'' + 
			"}";
		}
}