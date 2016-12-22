package com.apps.dilip_pashi.alarmapp.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.apps.dilip_pashi.alarmapp.Actions;
import com.apps.dilip_pashi.alarmapp.App;

import trikita.jedux.Action;

public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        App.dispatch(new Action<>(Actions.Alarm.WAKEUP));
    }
}
