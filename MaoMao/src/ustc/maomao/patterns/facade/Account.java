package ustc.maomao.patterns.facade;

import java.util.List;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         账户
 *      
 */
public class Account {
      private List<Bill> bills;//属于该账户的账单
      public boolean expense(){
    	  System.out.println("账户支出完成!");
    	  return true;
      }
}
