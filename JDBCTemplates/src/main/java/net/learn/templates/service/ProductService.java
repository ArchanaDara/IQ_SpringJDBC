package net.learn.templates.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import net.learn.templates.dao.ProductDao;
import net.learn.templates.model.ProductModel;

import java.util.List;


@Service
@Component
public class ProductService {
	
	@Autowired ProductDao productDao;
	
	public int addingNewProductInfomation(ProductModel productModel) {
		
		System.out.println("Product Service Class of Adding new product information into database "+productModel.toString());
		
		return productDao.addProduct(productModel);
	}
	
	public List<ProductModel> getAllProducts(){
		
		System.out.println("Getting all products information ");
		
		return productDao.retriveAllProducts();
	}
	
	

}
