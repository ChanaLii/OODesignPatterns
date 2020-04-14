package FactoryPattern.pizzaEnum;

/***
 * 披萨口味枚举类
 **/
public enum PizzaType {
    /**
     * 芝士口味
     **/
    CHEESE(1),
    /***
     * 素菜口味
     **/
    VEGGIE(2),
    /***
     * 海鲜口味
     **/
    CLAM(3);

    int value;

    PizzaType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
