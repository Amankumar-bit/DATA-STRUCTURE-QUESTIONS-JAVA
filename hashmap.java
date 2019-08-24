package lecture18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashmap {

	

		public static void main(String[] args) {
			HashMap<String, Integer> map = new HashMap<>();
			System.out.println(map);

			map.put("India", 300);
			System.out.println(map);

			map.put("Russia", 250);
			map.put("UK", 225);
			map.put("China", 325);
			map.put("USA", 175);
			System.out.println(map);
			map.put("India", 320);
			System.out.println(map);

			System.out.println(map.get("Russia"));
			System.out.println(map.get("RSA"));

			System.out.println(map.remove("UK"));
			System.out.println(map.remove("Aus"));

			System.out.println(map);

			System.out.println(map.containsKey("India"));
			System.out.println(map.containsKey("Chile"));

			System.out.println("************************");
			Set<String> keys = map.keySet();
			for (String key : keys) {
				System.out.println(key);
			}

			System.out.println("************************");
			Collection<Integer> values = map.values();
			for (Integer value : values) {
				System.out.println(value);
			}

			System.out.println("************************");
			Set<Map.Entry<String, Integer>> entries = map.entrySet();
			for (Map.Entry<String, Integer> entry : entries) {
				//System.out.println(entry);
				System.out.println(entry.getKey() + "=>" + entry.getValue());
			}

			int[] arr1= {3,5,1,4};
			int[] arr2= {3,1,2,7,9};
			System.out.println(getIntersection(arr1, arr2));


		}

		public static ArrayList<Integer> getIntersection(int[] arr1,int[] arr2){
			
			HashMap<Integer,Boolean> myhash = new HashMap<>();
			ArrayList<Integer> myresult=new ArrayList();	
			for(int i=0;i<arr2.length;i++)
			{
				myhash.put(arr2[i],false);
			}
			for(int i=0;i<arr1.length;i++)
			{
				if(myhash.containsKey(arr1[i]))
						{
					myhash.put(arr1[i],true);
						}
			}
			
			
			Set<Map.Entry<Integer,Boolean>> entries = myhash.entrySet();
			for (Entry<Integer, Boolean> entry : entries) {
		
				if(entry.getValue())
				{
					myresult.add(entry.getKey());
				}
			}
			
			
			
			
			
			
			
			
			
			
			return myresult;

			
			
			
		}
		
	
	}