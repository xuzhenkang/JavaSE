package thread.start;

import java.util.concurrent.Callable;

/**

 * @author kang
 *
 */
public class MethodThree implements Callable<Integer> {

	private int i;
	@Override
	public Integer call() throws Exception {
		for (; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+""+i);
        }
        return i;
	}

}
