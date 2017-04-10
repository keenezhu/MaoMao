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
 *         JSON格式文本
 * 
 */
public class JSONText {
	private String jsonHeader = "{";
	private String jsonBody = "\"" + "MenuItems" + "\":[";
	private String jsonFooter = "]}";
	boolean firstElement = true;

	/**
	 * 向json文本中添加元素
	 * 
	 * @param text
	 *            json元素内容
	 */
	public void add(String text) {
		if (firstElement) {
			jsonBody += text;
			firstElement=false;
		} else {
			jsonBody += "," + text;
		}
	}

	/**
	 * 获取完整的json文本
	 * 
	 * @return json文本
	 */
	public String getText() {
		return jsonHeader + jsonBody + jsonFooter;
	}
}
