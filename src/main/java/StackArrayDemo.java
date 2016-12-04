/**
 * Created by ScorpionOrange on 2016/12/04.
 */
public class StackArrayDemo {
    public static void main(String[] args){
        StackArray sa = new StackArray();
        sa.push(100);
        System.out.println("元素100入栈。");
        sa.push(150);
        System.out.println("元素150入栈。");
        sa.push(200);
        System.out.println("元素200入栈。");
        sa.push(500);
        System.out.println("元素500入栈。");
        sa.push(550);
        System.out.println("元素550入栈。");

        if(sa.isEmpty()){
            System.out.println("栈当前为空。");
        }
        else {
            System.out.println("栈当前不为空。");
        }
        System.out.println();

        System.out.println("栈内有" + sa.getSize() + "个元素");
        System.out.println();

        System.out.println("栈顶元素为：" + sa.getTop());
        System.out.println();

        sa.pop();
        System.out.println("弹出一个元素后，栈顶元素为：" + sa.getTop());
        System.out.println();

        sa.setEmpty();
        if(sa.isEmpty()){
            System.out.println("置栈空操作后，栈内为空");
        }
        System.out.println();
    }
}
