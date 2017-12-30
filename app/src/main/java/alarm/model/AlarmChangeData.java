package alarm.model;

/**
 * Created by Fayaj on 08.07.2017.
 */

public interface AlarmChangeData extends  AlarmValue {
    boolean isPrealarm();

    String alertString();

    boolean isVibrate();
}
