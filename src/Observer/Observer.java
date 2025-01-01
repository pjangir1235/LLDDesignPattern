package Observer;

import Observer.observable.Observable;
import Observer.observable.ObservableImpl;
import Observer.observer.EmailNotificationObserverImpl;
import Observer.observer.SMSNotificationObserverImpl;

public class Observer {
	
	public static void main(String[] args) {
		Product p1=new Product("Iphone", 0);

		Product p2=new Product("Samsung", 0);
		
		Observable observable = new  ObservableImpl();
		observable.add(new EmailNotificationObserverImpl(), p2);

		observable.add(new EmailNotificationObserverImpl(), p1);

		observable.add(new EmailNotificationObserverImpl(), p1);

		observable.add(new EmailNotificationObserverImpl(), p1);

		observable.add(new SMSNotificationObserverImpl(), p2);

		observable.add(new SMSNotificationObserverImpl(), p2);
		
		observable.setProductQty(p1, 3);
		
	}

}
