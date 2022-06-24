package _16Collection;

import java.util.Comparator;

public class sortById implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		return p1.getProductId()>p2.getProductId() ? +1:-1;
	}

}
