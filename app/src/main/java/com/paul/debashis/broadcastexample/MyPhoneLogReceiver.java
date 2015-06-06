package com.paul.debashis.broadcastexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;

public class MyPhoneLogReceiver extends BroadcastReceiver {
    public MyPhoneLogReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle mBundle = intent.getExtras();
        if(mBundle!=null){
            String mState = mBundle.getString(TelephonyManager.EXTRA_STATE);
            Log.d("DEB","The state is = "+mState);
            if (mState.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
                String mPhoneNumber = mBundle.getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
                Log.d("DEB","The phone number is = "+mPhoneNumber);
            }
        }
    }
}
