package Adapter;

//客户端类：想上网，但是插不上网线
public class Computer {
    public void net(NetToolUsb adapter){
        adapter.handleRequest();
    }

    public static void main(String[] args) {
        //电脑适配器网线
        Computer computer=new Computer();
        Adapter adapter = new Adapter();
        adaptee adaptee = new adaptee();//转接器

        computer.net(adaptee);
    }
}
