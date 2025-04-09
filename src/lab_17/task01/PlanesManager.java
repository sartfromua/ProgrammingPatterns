package lab_17.task01;

import java.util.ArrayList;
import java.util.List;

public class PlanesManager implements Mediator {

	private List<Component> components = new ArrayList<Component>();

	void addComponent(Component component) {
		components.add(component);
	}

	@Override
	public void broadcast(Component componentFrom, String message) {
		System.out.printf("\n%s: , %s\n", componentFrom.toString(), message);
		for (Component component : components) {
			if (message.contains("taking off") || message.contains("landing")) {
				if (component instanceof PlanesInFlight
						|| component instanceof PlanesOnGround
						|| component instanceof Runway)
					component.handleMessage(componentFrom, message);
			}
			if (message.contains("Runway is available")) {
				if (component instanceof Plane) component.handleMessage(componentFrom, message);
			}
		}
	}
}
