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
 *         pdf文档类型
 *      
 */
public class PdfDocument extends Document {
	
	private Data pdfFileFormatData;//pdf格式数据

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.factorymethod.Document#writeFileContent(java.io.FileOutputStream)
	 */
	@Override
	public void writeFileContent(FileOutputStream fos) {
		System.out.println(this.getFileName()+"文件导出.....");		
	}

	/**
	 * @param pdfFileFormatData the pdfFileFormatData to set
	 */
	public void setPdfFileFormatData(Data pdfFileFormatData) {
		this.pdfFileFormatData = pdfFileFormatData;
	}
	
	

}
