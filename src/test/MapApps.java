package test;

import java.util.*;

public class MapApps {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		Emp emp = new Emp("001", "张三");
		Emp emp2 = new Emp("005", "李四");
		Emp emp3 = new Emp("004", "王一");

		Map map = new HashMap();
		map.put(emp.getE_id(), emp.getE_name());
		map.put(emp2.getE_id(), emp2.getE_name());
		map.put(emp3.getE_id(), emp3.getE_name());
		Set set = map.keySet();
		System.out.println("Map集合中所有元素是：");
		Iterator it = set.iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			String name = (String) map.get(key);
			System.out.println(key + " " + name);
		}
		map.remove("005"); // 将id为“005”的对象从集合中删除。
		System.out.println("Map集合中执行删除操作后所有元素是：");
		Iterator it2 = set.iterator();
		while (it2.hasNext()) {
			String key = (String) it2.next();
			String name = (String) map.get(key);
			System.out.println(key + " " + name);
		}
	}
}

class Emp { // 此时为protected类型，而非public或private类型
	private String e_id;
	private String e_name;

	public Emp(String e_id, String e_name) {
		this.e_id = e_id;
		this.e_name = e_name;
	}

	public String getE_id() {
		return e_id;
	}

	public String getE_name() {
		return e_name;
	}
}
