package list.about;

import java.util.LinkedList;


public class LinkedListAbout {
	public static void main(String[] args) {
		 
	    // LinkedList类实现了链表，可初始化化为空或者已存在的集合
	    LinkedList<String> list = new LinkedList<String>();
	    // 插入元素
	    list.add("list2");
	    list.add("list3");
	    // 向链表头插入数据
	    list.addFirst("list1");
	    // 向链表尾插入数据
	    list.addLast("list4");
	    for (String str : list) {
	        System.out.println(str);
	    }
	    // 获取链表头数据
	    System.out.println("链表头数据:" + list.getFirst());
	    // 获取链表尾数据
	    System.out.println("链表尾数据:" + list.getLast());
	    
	    list.remove(1);
	    System.out.println(list.size());
	    
	    
	    
	    
	}
}
