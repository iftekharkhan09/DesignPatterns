package com.src.design.creational.prototype;

public class Movie {
	private String name;
	private String url;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.setName("abc");
		movie.setUrl("url1");

		System.out.println(movie);
		movie.setName("abc1");
		System.out.println(movie);
	}
}
