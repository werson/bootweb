import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Auther: werson
 * @Date: 2018/5/11 10:57
 * @Description: 队列测试类1
 */
public class TestQueue1 {

	private static final Basket basket = new Basket();

	static class Producer implements Runnable{
		@Override
		public void run() {
			try{
				while (true){
					System.out.println("生产者准备生产苹果" + System.currentTimeMillis());
					basket.produce();
					System.out.println("生产苹果完毕" + System.currentTimeMillis());
					System.out.println("生产后有苹果:" + basket.getAppleNumber() + "个");
					Thread.sleep(3000);
				}
			} catch (InterruptedException e){
				System.out.println("error:" +e.getMessage());
			}
		}
	}

	private static void test(){
		System.out.println("starting");
		ExecutorService service = Executors.newCachedThreadPool();
		service.submit(new Producer());
		service.submit(() -> {
			try{
				while (true){
					System.out.println("生产者准备消费苹果" + System.currentTimeMillis());
					basket.consume();
					System.out.println("消费苹果完毕" + System.currentTimeMillis());
					System.out.println("消费后有苹果:" + basket.getAppleNumber() + "个");
					Thread.sleep(1000);
				}
			}catch (InterruptedException e){
				System.out.println("error:" +e.getMessage());
			}
		});
		System.out.println("running");
		try{
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("error:" +e.getMessage());
		}
		service.shutdownNow();
		System.out.println("ending");
	}

	public static void main(String[] args) {
		test();
	}

}
