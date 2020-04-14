package FactoryPattern.entity;

import java.util.ArrayList;

/**
 * @ClassName: Pizze
 * @Description TODO
 * @Author Ligy
 * @Date 2020/4/14 9:07
 **/
public abstract class abstractPizza {

    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    public abstractPizza(String name) {
        this.name = name;
    }

    public void prepare(){
        System.out.println("Pizze --> 准备原材料");
    }

    public void bake(){
        System.out.println("Pizze --> 烘焙");
    }

    public void cut(){
        System.out.println("Pizze --> 切8大块");
    }

    public void box(){
        System.out.println("Pizze --> 打包");
    }

    public String getName() {
        return name;
    }
}
