package lab_17.task01;

public interface Component {
	void broadcastMessage(String message);
	void handleMessage(Component componentFrom, String message);
	void setMediator(Mediator mediator);
}
