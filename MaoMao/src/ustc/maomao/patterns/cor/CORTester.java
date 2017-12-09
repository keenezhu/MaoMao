package ustc.maomao.patterns.cor;

import ustc.maomao.patterns.support.MealOrder;
import ustc.maomao.patterns.support.Patron;
import ustc.maomao.patterns.support.PatternTester;
import ustc.maomao.patterns.templatemethod.PayCard;
import ustc.maomao.patterns.templatemethod.PayOrder;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         责任链模式测试器
 *      
 */
public class CORTester implements PatternTester {

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.support.PatternTester#test()
	 */
	@Override
	public void test() {
		// TODO Auto-generated method stub
		//构造验证器责任链
		OrderValidator chainHeader=new PatronValidator();
		OrderValidator node2=new InventoryValidator();
		OrderValidator node3=new PayValidator();
		node2.setSuccessor(node3);
		chainHeader.setSuccessor(node2);
		//初始化订单控制器
		MealOrderController orderController=new MealOrderController();
		orderController.setValidator(chainHeader);
		
		//构造责任链使用场景
		/**
		 * 客户p1下订单
		 */
	    System.out.println("------客户p1下订单-------分割线");
        Patron p1=new Patron();        
        p1.setLoginState(true);
        MealOrder p1Order=p1.orderFood();
        PayOrder po=new PayCard();
        p1.setPayOption(po);
        p1.pay();
        orderController.validateOrder(p1Order);
        /**
		 * 客户p2下订单
		 */
        System.out.println("------客户p2下订单-------分割线");
        Patron p2=new Patron();        
        p2.setLoginState(true);
        MealOrder p2Order=p2.orderFood();        
        orderController.validateOrder(p2Order);      
        
	}

}
