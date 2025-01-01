package Observer.observer;

public class EmailNotificationObserverImpl implements NotificationAlertObserver {

	@Override
	public void update() {
		System.out.println("Email Observer Updated");

	}

}
