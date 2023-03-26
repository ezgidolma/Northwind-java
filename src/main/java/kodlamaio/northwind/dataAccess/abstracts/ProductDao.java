package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer> {//product için 
	
	
	  Product getByProductName(String productName);
	  
	  Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);
	  
	  List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);
	  
	  List<Product> getByCategoryIn(List<Integer> categories);
	  
	  List<Product> getByProductNameContains(String productName);//ürün ismini içeriyorsa
	  
	  List<Product> getByProductNameStartsWith(String productName);//bu isimle başlayanlar demek
	  
	  @Query("From Product where productName=:productName and category.categoryId=:categoryId")//bunu yazarken veritabanı tablosunu unut
	  List<Product> getByNameAndCategory(String productName, int categoryId);
}
