package fr.lidodo.plane;

import java.util.ArrayList;
import java.util.List;

public class SyracuseUtil {

	public static List<Integer> compute(int term){
		return compute(new ArrayList<Integer>(),term);
	}

	private static List<Integer> compute(List<Integer> list, int term){
		list.add(term);
		if(term !=1){
			if(term % 2 == 0){
				//even
				compute(list, term/2);
			}else{
				//odd
				compute(list, term*3+1);
			}
		}
		return list;
	}

}
