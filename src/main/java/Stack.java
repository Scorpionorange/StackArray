/**
 * Created by ScorpionOrange on 2016/12/04.
 */
interface Stack{
    // 返回栈的大小
    public int getSize();

    // 判断堆栈是否为空
    public boolean isEmpty();

    // 数据元素 x 入栈
    public boolean push(Object x);

    // 栈顶元素出栈
    public Object pop();

    // 取栈顶元素
    public Object getTop();

    // 置栈空操作
    public void setEmpty();
}

