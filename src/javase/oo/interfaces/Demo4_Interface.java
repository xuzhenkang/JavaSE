package javase.oo.interfaces;

public class Demo4_Interface {

}
interface 某干爹 {
	public abstract void 关系();
	public abstract void 潜规则();
}
class 某女星 implements 某干爹 {

	@Override
	public void 关系() {
		System.out.println("借助干爹关系上位");
	}

	@Override
	public void 潜规则() {
		System.out.println("你们懂得");
	}
	
}