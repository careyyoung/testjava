package list.about;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListQueryAbout {
	public static void main(String[] args) {

		// List 遍历
		List<String> list = new ArrayList<String>();
		// 插入元素
		list.add("list1");
		list.add("list2");
		list.add("list3");

		System.out.println("第一种遍历方法 - >");
		for (String str : list) {
			System.out.println(str);
		}

		System.out.println("第二种遍历方法 - >");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("第三种遍历方法 - >");
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		// List 遍历时移除元素
		List<String> alist = new ArrayList<String>();
		// 插入元素
		alist.add("list1");
		alist.add("list2");
		alist.add("list2");
		alist.add("list3");

		// 实例化新的list防止因传递地址而达不到测试效果。
		remove1(new ArrayList<String>(list));
		remove2(new ArrayList<String>(list));
		remove2_1(new ArrayList<String>(list));
		remove3(new ArrayList<String>(list));
	}

	public static void remove1(List<String> list) {
		System.out.print("第一种方法 - > ");
		try {
			for (String str : list) {
				if (str.equals("list2"))
					list.remove(str);
			}
		} catch (Exception e) {
			System.out.println("移除失败!");
		}
	}

	public static void remove2(List<String> list) {
		System.out.print("第二种方法 - > ");
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			if (str.equals("list2"))
				list.remove(str);
		}
		System.out.println(list);
		System.out.println("也有异常，可以用下面的方法避免。");
	}

	public static void remove2_1(List<String> list) {
		System.out.print("第二种方法修正 - > ");
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			if (str.equals("list2")) {
				list.remove(str);
				// 因移除了元素,位置发生偏移,需要重新对当前位置的元素进行判断。
				i--;
			}
		}
		System.out.println(list);
	}

	public static void remove3(List<String> list) {
		System.out.print("第三种方法 - > ");
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String str = iter.next();
			if (str.equals("list2"))
				iter.remove();
		}

		System.out.println(list);
	}

}
