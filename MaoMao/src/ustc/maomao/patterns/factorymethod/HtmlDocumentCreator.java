package ustc.maomao.patterns.factorymethod;

import ustc.maomao.patterns.support.Data;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         html格式文档创建者
 *      
 */
public class HtmlDocumentCreator extends DocumentCreator {

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.factorymethod.DocumentCreator#createDocument(java.lang.String)
	 */
	@Override
	public Document createDocument(String fileName) {
		// TODO Auto-generated method stub
		HtmlDocument html=new HtmlDocument();
		Data fileData=new Data();
		
		html.setFileName(fileName+".html");
		html.setHtmlFileFormatData(fileData);
		return html;
	}

}
