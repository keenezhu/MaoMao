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
 *         Configuration是COS系统的配置类，根据项目的xml或json配置文件进行初始化对象
 *         Configuration向所有的客户对象提供共享单例，保证项目配置的共享和一致
 *      
 */
public class Configuration {
	
	//cosConfig是静态域，将在Configuration类首次加载时初始化
	private static Configuration cosConfig=createInstance();
	
	private Configuration(){};
	
	/**
	 * @return c 已根据COS的xml配置文件进行初始化后的对象
	 */
	private static Configuration createInstance(){
		Configuration c=new Configuration();		
		//initialize c instance from xml or json
		//other operations
		return c;
	}
	

	
	/**
	 * @return cosConfig 共享给所有的客户对象//cosConfig是静态域，将在Configuration类首次加载时初始化
	 */
	public static Configuration getInstance(){		
		return cosConfig;
	}

}
