package com.PreetiDcruze.NewYearGift;

import java.util.*;

public class Sorter implements Comparator<Gift> {
	public int compare(Gift o1, Gift o2) {
		if (o1.get_type().equals("Chocolate") && o2.get_type().equals("Chocolate"))
			return o1.get_weight() - o2.get_weight();

		return 0;
	}

}
