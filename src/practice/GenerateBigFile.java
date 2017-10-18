package practice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;
// 生成5.84MB的数据
public class GenerateBigFile {
	public static void main(String[] args) throws IOException {
		File file = new File("numfile.txt");
		if (!file.exists()) {
			System.out.println("不存在");
			file.createNewFile();
		}
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		writeNums(bw, 1024);
		bw.close();
	}

	private static void writeNums(BufferedWriter bw, int size) throws IOException {
		Random random = new Random();
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < size; i++) {
			while (set.size() < 1024)
				set.add(random.nextInt(7000));
			StringBuilder sb = new StringBuilder();
			for (Integer integer : set) {
				sb.append(integer).append("\r\n");
			}
			set.clear();
			bw.write(sb.toString());
			bw.flush();
		}
	}
}
