package com.QA.Tests;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.QA.Base.TestBase;
import com.QA.Client.RestClient;
import com.QA.util.TestUtil;

public class GetOfferAPITest extends TestBase {
	
	TestBase testBase;
	String serviceUrl;
	String apiUrl;
	String url;
	RestClient restClient;
	CloseableHttpResponse closeableHttpResponse;
	
	@BeforeMethod
	public void setUp() throws ClientProtocolException, IOException {
		testBase = new TestBase();
		serviceUrl = prop.getProperty("URL");
		
	}
	
	@Test(priority=1)
	public void getOfferAPIforSWTest() throws ClientProtocolException, IOException {
		
	    restClient = new RestClient();
	    
	    HashMap<String, String> headerMap = new HashMap<String, String>();
	    headerMap.put("Content-Type", "application/json");
	    headerMap.put("PartyID", "84745");
	    headerMap.put("appuserID", "12670");
	    headerMap.put("username", "rleever");
	    headerMap.put("retailercode", "SW_QA_07");
	    headerMap.put("culturecode", "en-US");
	    headerMap.put("OAuth", "oauth_consumer_key=8737055b-0cc8-4977-99d2-573252fe9906&oauth_nonce=188465&oauth_signature_method=HMAC-SHA1&oauth_timestamp=1384200442&oauth_version=1.0&oauth_signature=60Zy575Xv2oQDMo%2FGBUjcyXTF6Y%3D");
	    
        String apiUrl = "/API/v1/Offers/4202231/";
		
		// http://10.100.0.8:8076/API/v1/Offers/4202231/
		url = serviceUrl + apiUrl;
	    
	    
	    closeableHttpResponse = restClient.get(url, headerMap);
	    
	    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX GetOffer API Automated for Safeway retailer Started XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX \n");
	    
		
		// a. status code
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Status Code---->" + statusCode);
		Assert.assertEquals(statusCode, Response_Status_Code_200, "StatusCode is not 200");

		// b. Json string
		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");

		JSONObject responseJson = new JSONObject(responseString);
		System.out.println("Response Json from API ---->" + responseJson);
		
		
		// c. All Headers
		Header[] headersArray = closeableHttpResponse.getAllHeaders();
		HashMap<String, String> allHeaders = new HashMap<String, String>();
		for(Header header : headersArray) {
			allHeaders.put(header.getName(), header.getValue());
		}
		//System.out.println("Headers Array--->" + allHeaders);
		
	}
	
	@Test(priority=2)
	public void getOfferAPIforGR_TopsTest() throws ClientProtocolException, IOException {
		
	    restClient = new RestClient();
	    
	    HashMap<String, String> headerMap = new HashMap<String, String>();
	    headerMap.put("Content-Type", "application/json");
	    headerMap.put("PartyID", "63182");
	    headerMap.put("appuserID", "7931");
	    headerMap.put("username", "aarchambeault");
	    headerMap.put("retailercode", "GR_QA_05");
	    headerMap.put("culturecode", "en-US");
	    headerMap.put("OAuth", "oauth_consumer_key=8737055b-0cc8-4977-99d2-573252fe9906&oauth_nonce=188465&oauth_signature_method=HMAC-SHA1&oauth_timestamp=1384200442&oauth_version=1.0&oauth_signature=60Zy575Xv2oQDMo%2FGBUjcyXTF6Y%3D");
	    
        String apiUrl = "/API/v1/Offers/T1489063/";
		
		// http://10.100.0.8:8076/API/v1/Offers/T1489063/
		url = serviceUrl + apiUrl;
	    
	    closeableHttpResponse = restClient.get(url, headerMap);
		
	    System.out.println("\n \n \n XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX GetOffer API Automated for Tops retailer Started XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
	    
		// a. status code
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Status Code---->" + statusCode);
		Assert.assertEquals(statusCode, Response_Status_Code_200, "StatusCode is not 200");

		// b. Json string
		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");

		JSONObject responseJson = new JSONObject(responseString);
		System.out.println("Response Json from API ---->" + responseJson);
		
		// c. All Headers
		Header[] headersArray = closeableHttpResponse.getAllHeaders();
		HashMap<String, String> allHeaders = new HashMap<String, String>();
		for(Header header : headersArray) {
			allHeaders.put(header.getName(), header.getValue());
		}
		//System.out.println("Headers Array--->" + allHeaders);
		
	}
	
	@Test(priority=3)
	public void getOfferAPIforKrogerTest() throws ClientProtocolException, IOException {
		
	    restClient = new RestClient();
	    
	    HashMap<String, String> headerMap = new HashMap<String, String>();
	    headerMap.put("Content-Type", "application/json");
	    headerMap.put("PartyID", "168237");
	    headerMap.put("appuserID", "114419");
	    headerMap.put("username", "afrank1");
	    headerMap.put("retailercode", "KR_QA_07");
	    headerMap.put("culturecode", "en-US");
	    headerMap.put("OAuth", "oauth_consumer_key=8737055b-0cc8-4977-99d2-573252fe9906&oauth_nonce=188465&oauth_signature_method=HMAC-SHA1&oauth_timestamp=1384200442&oauth_version=1.0&oauth_signature=60Zy575Xv2oQDMo%2FGBUjcyXTF6Y%3D");
	    
        String apiUrl = "/API/v1/Offers/1798434/";
		
		// http://10.100.0.8:8076/API/v1/Offers/1798434/
		url = serviceUrl + apiUrl;
	    
	    closeableHttpResponse = restClient.get(url, headerMap);
	    
	    System.out.println(" \n \n \n XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX GetOffer API Automated for Kroger retailer Started XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		
		// a. status code
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Status Code---->" + statusCode);
		Assert.assertEquals(statusCode, Response_Status_Code_200, "StatusCode is not 200");

		// b. Json string
		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");

		JSONObject responseJson = new JSONObject(responseString);
		System.out.println("Response Json from API ---->" + responseJson);
		
		// c. All Headers
		Header[] headersArray = closeableHttpResponse.getAllHeaders();
		HashMap<String, String> allHeaders = new HashMap<String, String>();
		for(Header header : headersArray) {
			allHeaders.put(header.getName(), header.getValue());
		}
		//System.out.println("Headers Array--->" + allHeaders);
		
	}
	
	@Test(priority=4)
	public void getOfferAPIforSamsTest() throws ClientProtocolException, IOException {
		
	    restClient = new RestClient();
	    
	    HashMap<String, String> headerMap = new HashMap<String, String>();
	    headerMap.put("Content-Type", "application/json");
	    headerMap.put("PartyID", "127105");
	    headerMap.put("appuserID", "2354");
	    headerMap.put("username", "aarchambeault");
	    headerMap.put("retailercode", "SAMS_QA_05");
	    headerMap.put("culturecode", "en-US");
	    headerMap.put("OAuth", "oauth_consumer_key=8737055b-0cc8-4977-99d2-573252fe9906&oauth_nonce=188465&oauth_signature_method=HMAC-SHA1&oauth_timestamp=1384200442&oauth_version=1.0&oauth_signature=60Zy575Xv2oQDMo%2FGBUjcyXTF6Y%3D");
	    
        String apiUrl = "/API/v1/Offers/1046575/";
		
		// http://10.100.0.8:8076/API/v1/Offers/1046575/
		url = serviceUrl + apiUrl;
	    
	    closeableHttpResponse = restClient.get(url, headerMap);
	    
	    System.out.println(" \n \n \n XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX GetOffer API Automated for Sams retailer Started XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX ");
		
	    // a. status code
		int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();
		System.out.println("Status Code---->" + statusCode);
		Assert.assertEquals(statusCode, Response_Status_Code_200, "StatusCode is not 200");

		// b. Json string
		String responseString = EntityUtils.toString(closeableHttpResponse.getEntity(), "UTF-8");

		JSONObject responseJson = new JSONObject(responseString);
		System.out.println("Response Json from API ---->" + responseJson);
		
		System.out.println("\n \n \n \n \n");
		
		// c. All Headers
		Header[] headersArray = closeableHttpResponse.getAllHeaders();
		HashMap<String, String> allHeaders = new HashMap<String, String>();
		for(Header header : headersArray) {
			allHeaders.put(header.getName(), header.getValue());
		}
		//System.out.println("Headers Array--->" + allHeaders);
		
	}




}
