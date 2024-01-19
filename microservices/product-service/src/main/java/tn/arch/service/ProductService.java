package tn.arch.service;

import org.springframework.stereotype.Service;
import tn.arch.model.Product;
import tn.arch.model.ProductCategory;

import java.util.List;

@Service
public interface ProductService {
    List<Product> getAllProduct();

    Product getProductById(Long id);

    Product createProduct(Product product);

    Product updateProduct(Long id, Product product);

    void deleteProduct(Long id);

    //    ===============================Product Category ============================
    List<ProductCategory> getAllProductCategories();

    ProductCategory getProductCategoryById(Long id);

    ProductCategory createProductCategory(ProductCategory productCategory);

    ProductCategory updateProductCategory(Long id, ProductCategory productCategory);

}
