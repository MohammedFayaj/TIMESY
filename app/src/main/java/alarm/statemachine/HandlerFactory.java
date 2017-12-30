package alarm.statemachine;

/**
 * Created by Fayaj on 07.03.2017.
 */
public interface HandlerFactory {
    IHandler create(MessageHandler messageHandler);
}
