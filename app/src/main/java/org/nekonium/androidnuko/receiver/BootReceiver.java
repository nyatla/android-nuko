package org.nekonium.androidnuko.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import org.nekonium.androidnuko.services.NotificationLauncher;

public class BootReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationLauncher.getInstance().start(context);
    }

}