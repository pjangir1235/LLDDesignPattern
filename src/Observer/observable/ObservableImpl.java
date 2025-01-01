package Observer.observable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Observer.Product;
import Observer.observer.NotificationAlertObserver;


public class ObservableImpl implements Observable {

	Map<Product, List<NotificationAlertObserver>> map =new HashMap<>();
	
	@Override
	public void add(NotificationAlertObserver observer, Product product) {
		if(!map.containsKey(product)) {
			map.put(product, new ArrayList<NotificationAlertObserver>());
		}
		map.get(product).add(observer);

	}

	@Override
	public void remove(NotificationAlertObserver observer, Product product) {
		map.get(product).remove(observer);

	}

	@Override
	public void Notify(Product product) {
		
		map.get(product).forEach(l->l.update());
	}

	@Override
	public void setProductQty(Product product, int qty) {
		if(product.getQty()==0 && qty>0) {
			product.setQty(qty);
			Notify(product);
		}
		
	}


}
