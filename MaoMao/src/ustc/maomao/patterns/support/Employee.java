package ustc.maomao.patterns.support;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         COS系统雇员角色
 *      
 */
public class Employee {
	
	protected String userName;//用户名
	protected String password;//密码
     //其他域或行为
     /**
     * 登录行为
     */
	public boolean login() {
         //登录逻辑
		return true;
	}
     /**
      * 验证密码行为
      */
	private boolean verifyPassword() {
          //验证逻辑
		return true;
	}

}
