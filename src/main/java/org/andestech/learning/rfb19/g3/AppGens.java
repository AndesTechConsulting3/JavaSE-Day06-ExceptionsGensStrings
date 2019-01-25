package org.andestech.learning.rfb19.g3;

//import java.lang.*;

class B{}

class A2
{
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

class Num<T extends Number>{
    T a,b;

    double summa(){
        return a.doubleValue() + b.doubleValue();

    }

}

class C {

    static <T> void getRef(T t)
    {
        System.out.println(t.getClass().getName());
    }

}

class Dictionary<K,V>
{

}

class Troi<T>
{
    T a,b,c;
}


class A<T>
{
    private T data;

    public T getData2() {
        return data2;
    }

    public void setData2(T data2) {
        this.data2 = data2;
    }

    public T getRes() {
       // res = data + data2;
        return res;
    }

    public void setRes(T res) {
        this.res = res;
    }

    private T data2;
    private T res;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public A(T data) {
        this.data = data;
    }

    public A(){}

    public void printDataType(){
        System.out.println( data.getClass().getName());
    }
}

public class AppGens {

    public static void main(String[] args)
    {
     A<String> a1 = new A<>();
     a1.setData("SSSS");
     a1.printDataType();

     A<B> a2 = new A<>();
     a2.setData(new B());
     a2.printDataType();

     A2 a3 = new A2();
     a3.setData(new B());
     a3.setData("AAAA");
     a3.setData(1937987);

     // pack unpack

     Integer i = 123;
     int k = 123;

     k = i;

     // byte -> Byte
     // short -> Short
     // int   -> Integer
     // long -> Long
     // char -> Character
     // bool -> Boolean
     // float -> Float
     // double -> Double

     Double d;


     Num<Integer> num = new Num<>();
     num.a = 123; num.b=123;
     System.out.println(num.summa());

     Class<?> c;

     C.getRef(new Object());
     C.getRef(a2);

     //--------------------
     Object[] arr = new Object[3];
     arr[0] = a2;
     arr[1] = new B();
     arr[2] = -123.34234;

     A[] arr2  = new A[3];
     arr2[0] = a2;
     arr2[1] = new A();



        System.out.println(arr[0].getClass().getName());
//-------------------
        Troi<B> t = new Troi<>();
        t.a=new B();
        t.b=new B();
        t.b=new B();

    }
}
