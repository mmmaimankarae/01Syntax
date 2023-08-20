package main;
import facade.MyFacade;
/* Client */
public class Facade {
    public static void main(String[] args) {
        MyFacade obj = MyFacade.getMyFacadeObject();
        obj.class1Func();
        obj.class2Func();
    }
}
