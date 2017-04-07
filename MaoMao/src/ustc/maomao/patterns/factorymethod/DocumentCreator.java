package ustc.maomao.patterns.factorymethod;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         文档导出类
 *      
 */
public abstract class DocumentCreator {
	
	
	/**
	 * @param fileName 文件名称
	 * @return boolean 文件导出结果
	 */
	public boolean exportDocument(String fileName){
		
		boolean result=true;
		Document doc=createDocument(fileName);
		try {
			FileOutputStream fos=new FileOutputStream(doc.getFileName());			
			doc.writeFileContent(fos);
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			result=false;
			e.printStackTrace();			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			result=false;
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * @param fileName 文件名称
	 * @return 文档对象
	 */
	public abstract Document createDocument(String fileName);

}
