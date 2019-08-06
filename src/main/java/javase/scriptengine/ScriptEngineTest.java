package javase.scriptengine;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.util.Scanner;

import javax.script.Bindings;
import javax.script.Invocable;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ScriptEngineTest {
	public static void main(String[] args) throws FileNotFoundException, ScriptException, NoSuchMethodException {
		URL resource = Thread.currentThread().getContextClassLoader().getResource("");
		System.out.println(resource.getPath());
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("javascript");
		Bindings bind = engine.createBindings();
		bind.put("factor", 1);
		engine.setBindings(bind, ScriptContext.ENGINE_SCOPE);
		Scanner input = new Scanner(System.in);
		while (input.hasNextInt()) {
			int first = input.nextInt();
			int sec = input.nextInt();
			System.out.println("输入参数是：" + first + ", " + sec);
			engine.eval(new FileReader(resource.getPath() + "javase\\scriptengine\\model.js"));
			if (engine instanceof Invocable) {
				Invocable in = (Invocable) engine;
				Double result = (Double) in.invokeFunction("formula", first, sec);
				System.out.println("运算结果是：" + result.intValue());
			}
		}
		input.close();
	}
}
