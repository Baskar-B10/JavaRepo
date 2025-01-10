package com.learnings.basics.exceptionHandling.methodOverriden.case1;

// Superclass declares an exception
class SuperClass {
    void method() throws RuntimeException {
        System.out.println("SuperClass");
    }
}

// Subclass declares an unrelated exception
class SubClass extends SuperClass {
    @Override
    void method() {//throws Exception {
      
        // Exception is not a child of RuntimeException
        System.out.println("SubClass");
    }

    public static void main(String[] args) {
        SuperClass o = new SubClass();
        o.method();
    }
}