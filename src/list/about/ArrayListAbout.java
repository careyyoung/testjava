package list.about;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAbout {
	public static void main(String[] args) {
		 
	    // ArrayList类实现一个可增长的动态数组
	    List<String> list = new ArrayList<String>();
	    // 插入元素
	    list.add("list1");
	    list.add("list2");
	    // 打印list的大小
	    System.out.println(list.size());
	 
	    // 按索引移除元素
	    list.remove(0);
	    // 按对象移除元素
	    list.remove("list2");
	    // 打印list的大小
	    System.out.println(list.size());
	 
	    // 清空list
	    list.clear();
	}

}
