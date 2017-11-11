package com.venkat.mohan2;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties("app.foo.test")
public class MyOwnProperties {
	private int port = 8080;
	
	private Venkata venkat;
	
	private Rajani rajani;
	
	

	public Venkata getVenkat() {
		return venkat;
	}

	public void setVenkat(Venkata venkat) {
		this.venkat = venkat;
	}

	public Rajani getRajani() {
		return rajani;
	}

	public void setRajani(Rajani rajani) {
		this.rajani = rajani;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	

	public static class Venkata {
		private String name = "rittu";

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
	}
	
	public static class Rajani {
		private String name = "pavansai";

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
	}

}
