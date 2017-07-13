package ustc.maomao.patterns.factorymethod;

import java.io.FileOutputStream;

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
 *         Html文档类型
 *      
 */
public class HtmlDocument extends Document {
	
	private Data htmlFileFormatData;//html文件数据

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.factorymethod.Document#writeFileContent(java.io.FileOutputStream)
	 */
	@Override
	public void writeFileContent(FileOutputStream fos) {
		// TODO Auto-generated method stub
		System.out.println(this.getFileName()+"文件导出....");
	}

	/**
	 * @param htmlFileFormatData the htmlFileFormatData to set
	 */
	public void setHtmlFileFormatData(Data htmlFileFormatData) {
		this.htmlFileFormatData = htmlFileFormatData;
	}
	
	

}
