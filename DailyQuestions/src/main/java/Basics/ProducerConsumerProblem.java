package Basics;

public class ProducerConsumerProblem {
  public static void main(String[] args) {
    Box box = new Box();

    Thread producerThread =
        new Thread(() -> {
          for (int i = 0; i <= 20; ++i) {
            try {
              Thread.sleep(100);
            } catch (InterruptedException e) {

            }
            box.produce(i);
          }
        });

    Thread consumerThread =
        new Thread(() -> {
          for (int i = 0; i <= 20; ++i) {

            try {
              Thread.sleep(70);
            } catch (InterruptedException e) {

            }
            box.consume();
          }
        });

    producerThread.start();
    consumerThread.start();
  }
}

class Box {
  public Integer item;
  public boolean flag;

  Box() {
    item = null;
    flag = false;
  }

  void produce(int value) {
    item = value;
    flag = true;
    System.out.println("Producer Produced " + value);
  }

  void consume() {
    System.out.println("Consumer consumed " + item);
    item = null;
    flag = true;
  }
}
