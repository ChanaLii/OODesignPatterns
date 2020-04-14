package FactoryPattern.store;

import FactoryPattern.entity.abstractPizza;

/**
 * @ClassName: PizzaStore
 * @Description TODO
 * @Author Ligy
 * @Date 2020/4/14 9:05
 **/
public abstract class AbstractPizzaStore {

    public abstractPizza orderPizze(String pizzaType){
        System.out.println("PizzaStore --> 下单，口味是：" + pizzaType);
        abstractPizza abstractPizza = createPizza(pizzaType);

        abstractPizza.prepare();
        abstractPizza.bake();
        abstractPizza.cut();
        abstractPizza.box();
        return abstractPizza;
    }

    protected abstract abstractPizza createPizza(String pizzeType);

}
