package nl.han.aim.oose.dea;

import nl.han.aim.oose.dea.helpers.Product;
import nl.han.aim.oose.dea.helpers.ProductCategory;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsCalculateTotalCost {
    int calculateTotalCostOfAllProducts(List<Product> products) {

        return products.stream()
                .mapToInt(Product::getPrice)
                .sum();
    }

    int calculateTotalCostOfAllGadgets(List<Product> products) {
        return products.stream()
                .filter(w -> w.getCategory().equals(ProductCategory.GADGETS))
                .mapToInt(Product::getPrice)
                .sum();
    }
}
