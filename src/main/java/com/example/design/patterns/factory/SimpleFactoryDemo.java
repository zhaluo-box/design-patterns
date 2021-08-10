package com.example.design.patterns.factory;

import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class SimpleFactoryDemo {

    public static void main(String[] args) {
        Product product = ProductFactory.createFactory();
        product.operation();
    }

    @Data
    @ToString
    public static class Product {
        private static void operation() {
            log.info("生产产品!");
        }
    }

    public static class ProductFactory {

        public static Product createFactory() {
            return new Product();
        }
    }


}
