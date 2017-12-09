package ustc.maomao.patterns.facade;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         工资抵扣账单
 *      
 */
public class Bill {
   private Account acount;//账户	
   
   /**
    * 生成账单
 * @return 账单
 */
public Bill createBill(){
	   Bill bill=new Bill();
	   //生成账单
	   System.out.println("工资抵扣账单已生成！");
	   return bill;
   }
}
