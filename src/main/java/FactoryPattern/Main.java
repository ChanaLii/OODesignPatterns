package FactoryPattern;

import FactoryPattern.entity.abstractPizza;
import FactoryPattern.store.NYPizzaStore;

/**
 * @ClassName: Main
 * @Description TODO
 * @Author Ligy
 * @Date 2020/4/14 9:49
 **/
public class Main {

    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        abstractPizza veggie = nyPizzaStore.orderPizze("veggie");
        System.out.println("下单的披萨口味是 --> " + veggie.getName());
    }

}
