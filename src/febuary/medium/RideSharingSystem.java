package febuary.medium;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class RideSharingSystem {
    Queue<Integer> rider;
    Queue<Integer> driver;
    HashSet<Integer> cancel;
    HashSet<Integer> wait;

    public RideSharingSystem() {
        rider = new LinkedList<>();
        driver = new LinkedList<>();
        cancel = new HashSet<>();
        wait = new HashSet<>();
    }

    public void addRider(int riderId) {
        rider.offer(riderId);
        wait.add(riderId);
    }

    public void addDriver(int driverId) {
        driver.offer(driverId);
    }

    public int[] matchDriverWithRider() {

        if (rider.size() == 0 || driver.size() == 0){
            return new int[]{-1, -1};
        }

        while (cancel.contains(rider.peek())){
            cancel.remove(rider.peek());
            wait.remove(rider.poll());
        }

        if (rider.size() == 0 || driver.size() == 0){
            return new int[]{-1, -1};
        }

        return new int[]{driver.poll(), rider.poll()};

    }

    public void cancelRider(int riderId) {
        if (wait.contains(riderId)){
            cancel.add(riderId);
        }
    }
}
