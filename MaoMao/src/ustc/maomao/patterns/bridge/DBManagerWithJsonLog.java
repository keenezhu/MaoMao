package ustc.maomao.patterns.bridge;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         json日志实现
 *      
 */
public class DBManagerWithJsonLog extends DBManager {

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.bridge.DBManager#log(java.lang.String)
	 */
	@Override
	public void log(String operation,Object o) {
		System.out.println("{\"operation\":\""+operation+"\"}");
	}

}
