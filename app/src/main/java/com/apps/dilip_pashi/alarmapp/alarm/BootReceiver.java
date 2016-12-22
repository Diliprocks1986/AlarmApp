package com.apps.dilip_pashi.alarmapp.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.apps.dilip_pashi.alarmapp.Actions;
import com.apps.dilip_pashi.alarmapp.App;

import trikita.jedux.Action;

public class BootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (App.getState().alarm().on()) {
            App.dispatch(new Action<>(Actions.Alarm.RESTART_ALARM));
        }
    }
}
