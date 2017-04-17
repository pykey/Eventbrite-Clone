package com.example.eventbrite;

import java.io.IOException;
import android.content.Context;
import android.widget.Toast;

public final class ExecptionHandler {

	public static void register(Context context, Exception e) {
		if (e instanceof IOException) {
			Toast.makeText(context, R.string.network_not_reachable, Toast.LENGTH_LONG).show();
		}
	}
}
