/*
 * Small exercise project to practise Strategy Pattern.
 */
package main;
import human.*;
import food.*;
import juice.*;

/**
 *
 * @author termi303
 */
public class HumanSimulator {
    public static void main(String[] args) {
        Human human = new AdultMale();
        human.setFood(new CheeseBurger());
        human.setJuice(new OrangeJuice());
        human.eatFood();
        human.drinkJuice();
        human.setFood(new Pizza());
        human.eatFood();
        
        human = new Child();
        human.setJuice(new AppleJuice());
        human.drinkJuice();
        
    }
}
