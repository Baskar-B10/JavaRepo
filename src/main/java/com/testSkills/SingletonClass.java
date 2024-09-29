package com.testSkills;

public class SingletonClass {

    //common
    private SingletonClass(){}
    //using Eager Initialization - thread safe
    private static final SingletonClass EAGER_INSTANCE = new SingletonClass();

    public static SingletonClass getEagerInstance(){
        return  EAGER_INSTANCE;
    }

    //using lazy Initialization - not thread safe
    private static  SingletonClass LAZY_INSTANCE ;
    public static SingletonClass getLazyInstance(){

        if(LAZY_INSTANCE ==null){
            LAZY_INSTANCE =new SingletonClass();
        }
        return  LAZY_INSTANCE;
    }


    //using thread safe - slower
    private static  SingletonClass THREAD_SAFE_INSTANCE = new SingletonClass();
    public static synchronized SingletonClass getThreadSafeInstance(){

        if(THREAD_SAFE_INSTANCE ==null){
            THREAD_SAFE_INSTANCE =new SingletonClass();
        }
        return  THREAD_SAFE_INSTANCE;
    }

    //Using Double checked locking - efficient and complex

    private static volatile SingletonClass DOUBLE_CHECKED_INSTANCE ;
    public static  SingletonClass getDoubleCheckedInstance(){

        if(DOUBLE_CHECKED_INSTANCE ==null){
            synchronized (SingletonClass.class){
                DOUBLE_CHECKED_INSTANCE =new SingletonClass();
            }

        }
        return  DOUBLE_CHECKED_INSTANCE;
    }

    //Using Bill Pugh locking - efficient and complex

    private static class BillPughHelper{
        private static  SingletonClass BILL_PUGH_INSTANCE = new SingletonClass();
    }

    public static  SingletonClass getBillPughInstance(){

        return  BillPughHelper.BILL_PUGH_INSTANCE;
    }

    //enum Singleton

    public enum SingletonClassEnum{
        ENUM_INSTANCE;
        public void doSomething(){

        }

    }
}
