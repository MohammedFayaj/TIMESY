package alarm;

import android.database.Cursor;

import com.better.alarm.model.AlarmContainer;
import com.better.alarm.model.Calendars;
import com.better.alarm.model.ContainerFactory;
import com.better.alarm.model.ImmutableAlarmContainer;
import com.better.alarm.model.ImmutableDaysOfWeek;

import java.util.Calendar;

/**
 * Created by Fayaj on 25.06.2017.
 */
public class TestContainerFactory implements ContainerFactory {
    private int idCounter;
    private Calendars calendars;

    public TestContainerFactory(Calendars calendars) {
        this.calendars = calendars;
    }

    @Override
    public AlarmContainer create() {
        Calendar now = calendars.now();
        return ImmutableAlarmContainer.builder()
                .id(-1)
                .isEnabled(false)
                .nextTime(now)
                .hour(now.get(Calendar.HOUR_OF_DAY))
                .minutes(now.get(Calendar.MINUTE))
                .isVibrate(true)
                .daysOfWeek(ImmutableDaysOfWeek.of(0))
                .alertString("")
                .isPrealarm(false)
                .label("")
                .state("")
                .id(idCounter++)
                .persistence(AlarmContainer.PERSISTENCE_STUB)
                .build();
    }

    @Override
    public AlarmContainer create(Cursor cursor) {
        throw new UnsupportedOperationException();
    }
}
