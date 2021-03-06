package alarm.statemachine;

/**
 * Created by Fayaj on 07.03.2017.
 */
public interface IHandler {
    void sendMessageAtFrontOfQueue(Message message);

    void sendMessage(Message what);

    ImmutableMessage obtainMessage(int what, Object obj);

    ImmutableMessage obtainMessage(int what);
}
