package com.gupaoedu.singleton.lazy;


public class DoubleCheck {

    private DoubleCheck(){}

    //volatile 关键字防止指令重排
    private volatile static DoubleCheck INSTANCE;

    public static DoubleCheck getInstance(){
        if(INSTANCE == null)
        {
            synchronized (DoubleCheck.class)
            {
                INSTANCE = new DoubleCheck();
            }
        }
        return INSTANCE;
    }

}
