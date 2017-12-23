package com.javedak09.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by javed.khan on 12/23/2017.
 */

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {

            //Intent pushIntent = new Intent(context, MyService.class);
            //context.startService(pushIntent);

            Intent pushIntent = new Intent(context, MainActivity.class);
            context.startActivity(pushIntent);
        }
    }
}