package net.learn.templates.dao;

import net.learn.templates.model.ProductModel;
import java.util.List;

public interface ProductDAOOperations {
	
	public abstract int addProduct(ProductModel productModel);
	
	public abstract ProductModel retriveProductById(long productId);
	
	public abstract List<ProductModel> retriveAllProducts();

}
