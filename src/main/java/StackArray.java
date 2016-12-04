/**
 * Created by ScorpionOrange on 2016/12/04.
 */

public class StackArray implements Stack{
    private final int LEN = 10; // 数组的默认大小
    private int top; // 栈顶指针
    private Object[] elements; // 数据元素数组

    public StackArray(){
        top = -1;
        elements = new Object[LEN];
    }

    // 返回堆栈的大小
    public int getSize(){
        return top + 1;
    }

    // 判断堆栈是否为空
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        else {
            return false;
        }
    }

    // 数据元素 x 入栈
    public boolean push(Object x){
        if(getSize() >= elements.length){
            return false;
        }
        else {
            top++;
            elements[top] = x;
            return true;
        }
    }

    // 栈顶元素出栈
    public Object pop(){
        Object object;
        if(getSize() < 1){
            object = null;
        }
        else {
            object = elements[top];
            top--;
        }
        return object;
    }

    // 取栈顶元素
    public Object getTop(){
        Object object;
        if(getSize() < 1){
            object = null;
        }
        else {
            object = elements[top];
        }
        return object;
    }

    public void setEmpty() {
        top = -1;
    }
}

