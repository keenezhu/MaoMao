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
 *         {usage}
 *      
 */
public class XMLBuilder implements TextBuilder {
	
	
	private XMLText xml;//xml文本对象
	
	public XMLBuilder(){
		xml=new XMLText();
	}
	
	
	/**
	 * 获取xml文本
	 * @return xml文本
	 */
	public String getXMLText(){		
		return xml.getText();
	}

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.builder.TextBuilder#convertmType(int)
	 */
	@Override
	public void convertmType(int mType) {
		String type="<MenuItem><MType value=";
        type+="\""+mType+"\"/>";
        xml.add(type);
	}

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.builder.TextBuilder#convertmName(java.lang.String)
	 */
	@Override
	public void convertmName(String mName) {
		String name="<MName value=";
        name+="\""+mName+"\"/>";
        xml.add(name);
	}

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.builder.TextBuilder#convertmPrice(float)
	 */
	@Override
	public void convertmPrice(float mPrice) {
		String price="<MPrice value=";
        price+="\""+price+"\"/></MenuItem>";
        xml.add(price);
	}

}
