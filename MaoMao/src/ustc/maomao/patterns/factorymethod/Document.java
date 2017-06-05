package ustc.maomao.patterns.factorymethod;

import java.io.FileOutputStream;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         抽象的文档类型
 *      
 */
public abstract class Document {
	
     protected String fileName;   

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	/**
	 * 将文件内容输出
	 * @param fos 文件输出流
	 */
	public abstract void writeFileContent(FileOutputStream fos);
     
}
