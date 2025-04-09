package lab_19.task_01;

import java.util.ArrayList;

public class EventManager {
	private final ArrayList<EventListener> listeners = new ArrayList<>();

	public void subscribe(EventListener listener) {
		listeners.add(listener);
	}

	public void unsubscribe(EventListener listener) {
		listeners.remove(listener);
	}

	public void notifyEvent(String line) {
		for (EventListener listener : listeners) {
			listener.update(line);
		}
	}
}
