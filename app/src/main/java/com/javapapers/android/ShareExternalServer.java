package com.javapapers.android;

import android.content.Context;
import android.provider.Settings;

import org.apache.http.message.BasicNameValuePair;


public class ShareExternalServer {

	public String shareRegIdWithAppServer(final Context context,
			final String regId) {

        RestClient client = new RestClient(Config.APP_SERVER_URL);

        String deviceID = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);

        client.addPostParam(new BasicNameValuePair( "dev_id", deviceID ));
        client.addPostParam(new BasicNameValuePair("reg_id", regId));
        client.addPostParam(new BasicNameValuePair("name", "Arman's Phone"));
        client.execute();

		return "";
	}
}
