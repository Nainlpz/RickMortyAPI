package org.example;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultsItem{

	@JsonProperty("image")
	private String image;

	@JsonProperty("gender")
	private String gender;

	@JsonProperty("species")
	private String species;

	@JsonProperty("created")
	private String created;

	@JsonProperty("origin")
	private Origin origin;

	@JsonProperty("name")
	private String name;

	@JsonProperty("location")
	private Location location;

	@JsonProperty("episode")
	private List<String> episode;

	@JsonProperty("id")
	private int id;

	@JsonProperty("type")
	private String type;

	@JsonProperty("url")
	private String url;

	@JsonProperty("status")
	private String status;

	public String getImage(){
		return image;
	}

	public String getGender(){
		return gender;
	}

	public String getSpecies(){
		return species;
	}

	public String getCreated(){
		return created;
	}

	public Origin getOrigin(){
		return origin;
	}

	public String getName(){
		return name;
	}

	public Location getLocation(){
		return location;
	}

	public List<String> getEpisode(){
		return episode;
	}

	public int getId(){
		return id;
	}

	public String getType(){
		return type;
	}

	public String getUrl(){
		return url;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"ResultsItem{" + 
			"image = '" + image + '\'' + 
			",gender = '" + gender + '\'' + 
			",species = '" + species + '\'' + 
			",created = '" + created + '\'' + 
			",origin = '" + origin + '\'' + 
			",name = '" + name + '\'' + 
			",location = '" + location + '\'' + 
			",episode = '" + episode + '\'' + 
			",id = '" + id + '\'' + 
			",type = '" + type + '\'' + 
			",url = '" + url + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}