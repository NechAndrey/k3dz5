package k3dz5;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Road extends Stage {
    private CyclicBarrier cb = new CyclicBarrier(4);
    public Road(int length) {
        this.length = length;
        this.description = "Дорога " + length + " метров";
    }
    @Override
    public void go(Car c) {
            System.out.println(c.getName() + " начал этап: " + description);
        try {
            Thread.sleep(length / c.getSpeed() * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(c.getName() + " закончил этап: " + description);
    }
}
