package ustc.maomao.patterns.singleton;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         COS中使用Configuration对象的客户端2
 *      
 */
public class ConfigurationClient2 {
     public void useConfiguration(){
    	 Configuration instance=Configuration.getInstance();
    	 //use instance (just print its hashcode)
    	 System.out.println("正在被使用的Configuration对象的hash code是："+instance.hashCode());
     }
}
