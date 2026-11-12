package Basics;

// handle null consumption by consumer
// not handle the race condition
// Consumer may print first
public class BusyWaitingSolution {
  public static void main(String[] args) {
    BoxBusyWaiting boxBusyWaiting = new BoxBusyWaiting();

    Thread producerThread =
        new Thread(() -> {
          for (int i = 1; i <= 20; ++i) {
            try {
              Thread.sleep(100);
            } catch (InterruptedException e) {

            }
            boxBusyWaiting.produce(i);
          }
        });

    Thread consumerThread =
        new Thread(() -> {
          for (int i = 1; i <= 20; ++i) {
            try {
              Thread.sleep(80);
            } catch (InterruptedException e) {
            }
            boxBusyWaiting.consume();
          }
        });

    producerThread.start();
    consumerThread.start();
  }
}

class BoxBusyWaiting {
	volatile Integer item;
	volatile boolean flag;

	BoxBusyWaiting() {
		item = null;
		flag = false;
	}

	void produce(int value) {
		while (flag) {
			// wait for consumer to consume
		}
		item = value;
		flag = true;
		System.out.println("Producer produced: " + item);
	}

	void consume() {
		while (!flag) {
			// Wait for producer to produce
		}
		System.out.println("Consumer consumed: " + item);
		item = null;
		flag = false;
	}

}
