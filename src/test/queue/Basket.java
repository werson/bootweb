import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @Auther: Administrator
 * @Date: 2018/5/11 11:18
 * @Description:
 */
public class Basket {

	private BlockingQueue<String> basket = new ArrayBlockingQueue<>(3);

	public void produce() throws InterruptedException{
		basket.put("An apple");
	}

	public String consume() throws InterruptedException {
		return basket.take();
	}

	public int getAppleNumber(){
		return basket.size();
	}
}
