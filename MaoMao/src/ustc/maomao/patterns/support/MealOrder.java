package ustc.maomao.patterns.support;

import java.util.ArrayList;
import java.util.List;

import ustc.maomao.patterns.visitor.MealOrderVisitor;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         菜品订单
 *      
 */
public class MealOrder {
     List<FoodItem> foods;//菜品列表 
     
     public MealOrder(){
    	 foods=new ArrayList<FoodItem>();
     }
     
     /**
      * 向订单中加入菜品
     * @param food 菜品
     */
    public void addFood(FoodItem food){
    	 foods.add(food);
     }
    
     /**
      * 统计订单菜品
     * @param visitor
     */
    public void statis(MealOrderVisitor visitor){
    	 for (FoodItem food:foods){
    		 food.accept(visitor);
    	 }
     }
     
}
