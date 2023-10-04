package bandeau;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BandeauLock extends Bandeau{


    private final Lock lock = new ReentrantLock();


    public void verrouille()  {
        lock.lock();
    }

    public void deverrouille()  {
        lock.unlock();
    }

/**
    void m2() {
        lock.lock();
... // faire quelque chose qui
//change la condition
        condition1.signalAll(); //Prévenir que la
//condition a changé
        lock.unlock();
    }
    private boolean test() {
        return ... ;
    }
     */

}
