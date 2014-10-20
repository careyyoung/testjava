package tools.some;

import java.io.File;
import java.util.Scanner;

public class ReadDirectory {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();// 输入路径，如："E:\\bootstrap-3.2.0-dist";
		sc.close();
//		String s = "E:\\bootstrap-3.2.0-dist";
		
		File f = new File(s);// 实例化File类的对象
		System.out.println("打印出所有文件的绝对路径：");
		print1(f);
		
		System.out.println();
		System.out.println("打印出目录树：");
		String[] folder = s.split("\\\\");
		System.out.println(folder[folder.length - 1] + "\\");

		printTree(s, "");
	}

//	 递归调用此方法列出目录下的所有目录和文件
	public static void print1(File file) {
		if (file != null) {
			if (file.isDirectory()) {
				File f[] = file.listFiles();// 列出全部的文件
				if (f != null) {
					for (int i = 0; i < f.length; i++) {
						print1(f[i]);// 递归调用自身
					}
				}
			} else {
				System.out.println(file);// 输出路径
			}
		}
	}

//	以树形结构输出目录
	static void printTree(String root, String init) {

		File path = new File(root);
		if (path.isDirectory()) {
			File[] files = path.listFiles();
			for (int i = 0, length = files.length; i < length; i++) {
				File f = files[i];
				System.out.print(init + "|----" + f.getName());
				if (f.isDirectory()) {
					System.out.println("\\");
				} else {
					System.out.println();
				}
				if (f.isDirectory()) {
					printTree(f.getAbsolutePath(), init + (i == length ? " " : "|    "));
				}
			}
		}
	}
}