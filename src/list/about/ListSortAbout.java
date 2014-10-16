package list.about;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortAbout {
	public static void main(String[] args) {

		// 数字排序
		// 创建list
		List<Integer> list = new ArrayList<Integer>();
		// 插入元素
		list.add(2);
		list.add(0);
		list.add(3);
		list.add(4);
		list.add(1);

		Collections.sort(list);
		for (int i : list) {
			System.out.println(i);
		}

		// 中文排序
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("一鸣惊人-Y");
		alist.add("人山人海-R");
		alist.add("海阔天空-H");
		alist.add("空前绝后-K");
		alist.add("后来居上-H");

		Comparator<Object> cmp1 = Collator.getInstance(java.util.Locale.CHINA);
		Collections.sort(alist, cmp1);
		System.out.println(alist);

		for (String str : alist) {
			System.out.println(str);
		}

		// 实体类排序
		List<User> userlist = new ArrayList<User>();
		userlist.add(new User("Y - 易小星 ", 33));
		userlist.add(new User("W - 王大锤", 33));

		Comparator<User> cmp2 = new ComparatorUser();
		Collections.sort(userlist, cmp2);

		for (User user : userlist) {
			System.out.println(user.getName());
		}

	}

}

class ComparatorUser implements Comparator<User> {

	@Override
	public int compare(User u1, User u2) {

		// 先按年龄排序
		int flag = u1.getAge().compareTo(u2.getAge());
		// 年龄相等比较姓名
		if (flag == 0) {
			return u1.getName().compareTo(u2.getName());
		} else {
			return flag;
		}
	}
}

class User {

	private String name;
	private Integer age;

	public User() {
		super();
	}

	public User(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
