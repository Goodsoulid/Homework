package com.example.homework;

public class ThreadingHome {
//The second task
    public static void main(String[] args) {


        ThreadClass1 threadClass1 = new ThreadClass1();
        threadClass1.start();

        ThreadClass2 threadClass2 = new ThreadClass2();
        Thread thread1 = new Thread(threadClass2);
        thread1.start();

        ThreadClass3 threadClass3 = new ThreadClass3(){
            @Override
            public void run() {
                System.out.println("Run in Thread in anonym class");
            }
        };

        threadClass3.start();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous class with runnable");
            }
        };

        Thread thread4 = new Thread(runnable);
        thread4.start();
    }

    }



class ThreadClass1 extends Thread {

    @Override
    public void run() {
        System.out.println("The first inherited thread");
    }
}

class ThreadClass2 implements Runnable {

    @Override
    public void run() {
        System.out.println("The second stream on the interface");
    }
}

class ThreadClass3 extends Thread {

    @Override
    public void run() {
        System.out.println("I'm running in thread");
    }
}

class ThreadClass4 implements Runnable {

    @Override
    public void run() {
        System.out.println("I'm running in Runnable");
    }
}




