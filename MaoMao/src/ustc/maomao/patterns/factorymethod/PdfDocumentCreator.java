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
 *         pdf格式文档创建者
 *      
 */
public class PdfDocumentCreator extends DocumentCreator {

	/* (non-Javadoc)
	 * @see ustc.maomao.patterns.factorymethod.DocumentCreator#createDocument()
	 */
	@Override
	public Document createDocument(String fileName) {
		PdfDocument pdf=new PdfDocument();
		Data fileData=new Data();
		pdf.setFileName(fileName+".pdf");
		pdf.setPdfFileFormatData(fileData);
		return pdf;
	}
}
