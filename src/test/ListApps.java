package test;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListApps {

	public static void print(List<Integer> list) {
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
			System.out.print(", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		List<Integer> s = new ArrayList<Integer>();
		for (Integer i = 0; i < 10; i++) {
			s.add(i);
		}
		print(s);

		Iterator<Integer> itr = s.iterator();
		while (itr.hasNext()) {
			Integer i = itr.next();
			if (i % 3 == 0) {
				itr.remove();
			}
		}
		print(s);
		
		
		
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
		
		
	    // LinkedList类实现了链表，可初始化化为空或者已存在的集合
	    LinkedList<String> llist = new LinkedList<String>();
	    // 插入元素
	    llist.add("list2");
	    llist.add("list3");
	    // 向链表头插入数据
	    llist.addFirst("list1");
	    // 向链表尾插入数据
	    llist.addLast("list4");
	    for (String str : list) {
	        System.out.println(str);
	    }
	    // 获取链表头数据
	    System.out.println("链表头数据:" + llist.getFirst());
	    // 获取链表尾数据
	    System.out.println("链表尾数据:" + llist.getLast());
		
		
	    // 创建list
	    List<Integer> alist = new ArrayList<Integer>();
	    // 插入元素
	    alist.add(2);
	    alist.add(0);
	    alist.add(3);
	    alist.add(4);
	    alist.add(1);
	 
	    Collections.sort(alist);
	    for (int i : alist) {
	        System.out.println(i);
	    }
		
	    ArrayList<String> aalist = new ArrayList<String>();
	    aalist.add("一鸣惊人-Y");
	    aalist.add("人山人海-R");
	    aalist.add("海阔天空-H");
	    aalist.add("空前绝后-K");
	    aalist.add("后来居上-H");
	 
	    Comparator<Object> cmp = Collator.getInstance(java.util.Locale.CHINA);
	    Collections.sort(aalist, cmp);
	 
	    for (String str : aalist) {
	        System.out.println(str);
	    }
		
	    List<String> aaalist = new ArrayList<String>();
	    // 插入元素
	    aaalist.add("list1");
	    aaalist.add("list2");
	    aaalist.add("list3");
	 
	    System.out.println("第一种遍历方法 - >");
	    for (String str : aaalist) {
	        System.out.println(str);
	    }
	 
	    System.out.println("第二种遍历方法 - >");
	    for (int i = 0; i < aaalist.size(); i++) {
	        System.out.println(aaalist.get(i));
	    }
	 
	    System.out.println("第三种遍历方法 - >");
	    Iterator<String> iter = aaalist.iterator();
	    while (iter.hasNext()) {
	        System.out.println(iter.next());
	    }
		
		
	}
}
