package org.example;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Characters{

	@JsonProperty("results")
	private List<ResultsItem> results;

	@JsonProperty("info")
	private Info info;

	public List<ResultsItem> getResults(){
		return results;
	}

	public Info getInfo(){
		return info;
	}

	@Override
 	public String toString(){
		return 
			"Characters{" + 
			"results = '" + results + '\'' + 
			",info = '" + info + '\'' + 
			"}";
		}
}