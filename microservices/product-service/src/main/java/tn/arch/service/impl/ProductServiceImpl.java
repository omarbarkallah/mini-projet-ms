package tn.arch.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tn.arch.model.Product;
import tn.arch.model.ProductCategory;
import tn.arch.repository.ProductCategoryRepository;
import tn.arch.repository.ProductRepository;
import tn.arch.service.ProductService;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public List<ProductCategory> getAllProductCategories() {
        return productCategoryRepository.findAll();
    }

    @Override
    public ProductCategory getProductCategoryById(Long id) {
        try {
            return productCategoryRepository.findById(id)
                    .orElseThrow(() -> new Exception("ProductCategory not found with id " + id));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ProductCategory createProductCategory(ProductCategory productCategory) {
         return productCategoryRepository.save(productCategory);
    }

    @Override
    public ProductCategory updateProductCategory(Long id, ProductCategory productCategory) {
        getProductById(id);
        productCategory.setId(id);
        return productCategoryRepository.save(productCategory);
    }

    @Override
    public Product getProductById(Long id) {
        try {
            return productRepository.findById(id)
                    .orElseThrow(() -> new Exception("Product not found with id " + id));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        //FIXME Fix this update
        getProductById(id);
        product.setId(id);
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        Product existingProduct = getProductById(id);
        productRepository.delete(existingProduct);
    }

}
