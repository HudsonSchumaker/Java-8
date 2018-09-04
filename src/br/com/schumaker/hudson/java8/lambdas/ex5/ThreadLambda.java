package br.com.schumaker.hudson.java8.lambdas.ex5;

/**
 *
 * @author hudsonschumaker
 */
public class ThreadLambda {

    public static void main(String[] args) {

        //Maneira velha (classe anonima)
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 1000; i++) {
                    System.out.println("R: " + i);
                }
            }
        };
        new Thread(r).start();

        //Lambda - 1 
        Runnable r1 = () -> {
            for (int i = 0; i <= 1000; i++) {
                System.out.println("r1: " + i);
            }
        };
        new Thread(r1).start();

        //Lambda - 2
        new Thread(() -> {
            for (int i = 0; i <= 1000; i++) {
                System.out.println("T: " + i);
            }
        }).start();
        
         //Lambda - 3
        Runnable o = () -> {
            System.out.println("O que sou eu? Que lambda?");
        };
        new Thread(o).start();
    }
}
