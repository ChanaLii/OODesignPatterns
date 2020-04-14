package FactoryPattern.entity;

/**
 * @ClassName: NYCheeseStypePizza
 * @Description TODO
 * @Author Ligy
 * @Date 2020/4/14 9:30
 **/
public class NYCheeseStylePizza extends abstractPizza {
    public NYCheeseStylePizza(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("纽约口味的芝士披萨 --> 原材料准备");
    }

    @Override
    public void bake() {
        System.out.println("纽约口味的芝士披萨 --> 烘焙");
    }

    @Override
    public void cut() {
        System.out.println("纽约口味的芝士披萨 --> 切成4大块");
    }

    @Override
    public void box() {
        System.out.println("纽约口味的芝士披萨 --> 打包，附上番茄酱");
    }
}
