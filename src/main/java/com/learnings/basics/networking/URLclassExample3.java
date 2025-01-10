package com.learnings.basics.networking;

import java.net.*;

public class URLclassExample3 {

	public static void main(String[] args)
		throws MalformedURLException
	{

		URL url = new URL(
			"https://write.geeksforgeeks.org/post/3038131");

		// to get and print the default port of the URL
		int defaultPort = url.getDefaultPort();

		System.out.println("Default Port : " + defaultPort);

		// to get and print the path of the URL
		String path = url.getPath();

		System.out.println("Path : " + path);
	}
}
