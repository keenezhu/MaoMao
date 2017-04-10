package ustc.maomao.patterns.builder;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         XML格式文本
 *      
 */
public class XMLText {
	
	private String xmlHeader="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n";
	private String xmlBody="<MenuItems>\n";
	private String xmlFooter="</MenuItems>";
	
	/**
	 * 用于向xml文本中添加元素内容
	 * @param text xml元素内容
	 */
	public void add(String text){		
		xmlBody+=text;
	}
	/**
	 * 用于获取完整的xml文本
	 * @return xml文本
	 */
	public String getText(){		
		return xmlHeader+xmlBody+xmlFooter;
	}

}
