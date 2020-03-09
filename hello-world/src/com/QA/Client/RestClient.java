package com.QA.Client;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class RestClient {
	
	//Get Method With Headers
	public CloseableHttpResponse get(String url, HashMap<String, String> headerMap) throws ClientProtocolException, IOException {
		CloseableHttpClient httpclient = HttpClients.createDefault(); 
		HttpGet httpget = new HttpGet(url); //http get request
		
		for(Map.Entry<String, String> entry : headerMap.entrySet()) {
			httpget.addHeader(entry.getKey(), entry.getValue());
		}
		
		CloseableHttpResponse closeableHttpResponse = httpclient.execute(httpget);//hit the Get url
		
		return closeableHttpResponse;
		
	}
	

}
