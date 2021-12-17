package com.Integracaocomapi;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
public class IntegrandoApiApplication {

	public static void main(String[] args) {
		System.out.println("Listagem de linhas");
		Model apiService = Model.getInstance();
		String path = "?a=nc&p=" + URLEncoder.encode("%", StandardCharsets.UTF_8)+ "&t=o";
		String response = apiService.doRequest(path);
		System.out.println(response);

		System.out.println("Listagem de itinerários");
		String pathItinerarios = "?a=il&p=5566";
		String responseItinerarios = apiService.doRequest(pathItinerarios);
		System.out.println(responseItinerarios);
	}


}
