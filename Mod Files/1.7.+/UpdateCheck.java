package com.NuggetMod.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class UpdateCheck {
	
	public static boolean isUpdateAvailable() throws IOException, MalformedURLException, UnknownHostException {
		BufferedReader versionFile = new BufferedReader(new InputStreamReader(new URL("https://dl.dropboxusercontent.com/u/95443072/NuggetMod%20Version.txt").openStream()));
		String curVersion = versionFile.readLine();

		if (!curVersion.contains(NuggetMain.version)) {
			return true;
		}
		versionFile.close();

		return false;
	}

}