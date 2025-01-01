package Observer.observable;

import Observer.Product;
import Observer.observer.NotificationAlertObserver;

public interface Observable {
	public void add(NotificationAlertObserver observer, Product product);
	public void remove(NotificationAlertObserver observer, Product product);
	public void Notify(Product product);
	public void setProductQty(Product product, int qty);
}
