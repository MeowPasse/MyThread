package seasonthree.part1.TwoThreadTransData;

import java.util.ArrayList;
import java.util.List;

public class MyList {

	private volatile List list = new ArrayList();

	public void add() {
		list.add("AAA");
	}

	public int size() {
		return list.size();
	}

}
