package alarm.util;

import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by Fayaj on 15.08.2017.
 */
public class Service extends android.app.Service {
    @Nullable
    @Override
    public final IBinder onBind(Intent intent) {
        return null;
    }
}
