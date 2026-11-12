package Basics;
// handle null consumption by consumer
// not handle the race condition
// Consumer may print first
public class BoxWithWaitNotify {
  public static void main(String[] args) {
    BoxWaitNotify boxBusyWaiting = new BoxWaitNotify();

    Thread producerThread =
      new Thread(() -> {
       for (int i = 1; i <= 20; ++i) {
        try {
         Thread.sleep(100);
         boxBusyWaiting.produce(i);
        } catch (InterruptedException e) {

        }
       }
      });

    Thread consumerThread =
      new Thread(() -> {
       for (int i = 1; i <= 20; ++i) {
        try {
         Thread.sleep(80);
         boxBusyWaiting.consume();
        } catch (InterruptedException e) {
        }
       }
      });

    producerThread.start();
    consumerThread.start();
  }
}

class BoxWaitNotify {
  volatile Integer item;
  volatile boolean flag;

  BoxWaitNotify() {
    item = null;
    flag = false;
  }

  synchronized void produce(int value) throws InterruptedException {
    while (flag) {
      // wait for consumer to consume
      wait();

    }
    item = value;
    flag = true;
    System.out.println("Producer produced: " + item);
    notifyAll();
  }

  synchronized void consume() throws InterruptedException {
    while (!flag) {
      wait();
    }
    System.out.println("Consumer consumed: " + item);
    item = null;
    flag = false;
    notifyAll();
  }
}
