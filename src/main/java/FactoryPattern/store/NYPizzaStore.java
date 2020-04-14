package FactoryPattern.store;

import FactoryPattern.entity.NYClamStylePizza;
import FactoryPattern.entity.NYVeggieStylePizza;
import FactoryPattern.entity.NYCheeseStylePizza;
import FactoryPattern.entity.abstractPizza;

/**
 * @ClassName: NYPizzaStore
 * @Description TODO
 * @Author Ligy
 * @Date 2020/4/14 9:16
 **/
public class NYPizzaStore extends AbstractPizzaStore {


    @Override
    protected abstractPizza createPizza(String pizzeType) {

        if ("cheese".equals(pizzeType)){
            return new NYCheeseStylePizza(pizzeType);
        }else if ("veggie".equals(pizzeType)){
            return new NYVeggieStylePizza(pizzeType);
        }else if ("clam".equals(pizzeType)){
            return new NYClamStylePizza(pizzeType);
        }else{
            System.out.println("没有该口味的披萨");
            return null;
        }
    }
}
