package Adapter;

//真正的适配器 ； 需要连接USb 连接网线
public class adaptee extends Adapter implements NetToolUsb{
    @Override
    public void handleRequest() {
        super.request();//调用父类的request
    }
}
