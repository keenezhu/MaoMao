package ustc.maomao.patterns.flyweight;

import ustc.maomao.patterns.support.Patron;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         消息接口
 *      
 */
public interface IMessage {
    /**
     * 发送消息
     * @return 发送结果
     */
    public boolean send(Patron receiver);
}
