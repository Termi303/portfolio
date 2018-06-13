package human;
import food.Food;
import juice.Juice;
/**
 *
 * @author termi303
 */
public class Human {
    private Food foodToEat;
    private Juice juiceToDrink;
    private String identifier;
    private void greet() {
        System.out.print(identifier + ": ");
    }
    
    public Human() {
        identifier = "Human";
    }
    public void setJuice(Juice juice) {
        juiceToDrink = juice;
    } 
    public void setFood(Food food) {
        foodToEat = food;
    }
    public void eatFood() {
        greet();
        
    }
    public void drinkFood() {
        greet();
    }
}
