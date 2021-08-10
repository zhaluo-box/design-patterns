package com.example.design.patterns.factory;

import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FactoryDemo2 {

    public static void main(String[] args) {

    }

    public static abstract class CommonCreate {
        public void create() {
            log.info("通用的生产逻辑逻辑!");
            this.factoryMethod();
        }
        protected abstract Product factoryMethod();
    }

    public static class Factory1 extends CommonCreate {
        @Override
        protected Product factoryMethod() {
            log.info("特殊生产逻辑");
            return new CreateProduct();
        }
    }

    public  interface Product {
        void excute();
    }

    public static class CreateProduct implements Product {
        @Override
        public void excute() {
            log.info("特殊的生产逻辑!");
        }
    }


}

