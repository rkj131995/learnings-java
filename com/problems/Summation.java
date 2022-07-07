package com.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Summation {

	public static void main(String[] args) throws IOException {

		// Reading inputs 
//		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
//		
//		System.out.println(br.readLine().replaceAll("\\s+", " "));
		int nn[] = new int[5];
		HashMap<Character, Integer> m = new HashMap<>();
		m.put('a', 3);
		m.get('b');
		System.out.println(m.get('b'));
		int [][]arr = {{11,14},{3,5},{9,43}, {11,11}};
//		printArray(arr);
		Arrays.sort(arr, (a,b)-> a[0]-b[0]);
		List<int[]> res = new ArrayList<>();
		int []tmp = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i][0] <= tmp[1] && arr[i][0] >=tmp[0])
			{
				if(arr[i][1] > tmp[1])
				{
					tmp[1] = arr[i][1];
				}
			}
			else
			{
				res.add(tmp);
				tmp = arr[i];
			}
		}
		res.add(tmp);
		printArray(res.toArray(new int[0][]));
		
		int [][]intervals = {{11,14},{3,5},{9,43}, {11,11}};
		int n = intervals.length ;
        
        int[] start = new int[n];
        int[] end = new int[n];
        
        for(int i = 0; i < n; i++)
        {
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
         Arrays.sort(start);
         Arrays.sort(end);
        
        int si = 0;
        int ei = 0;
        List<int[]> ress = new LinkedList<>();
        
        while(ei < n)
        {
            if( ei == n -1 || start[ei + 1] > end[ei]) // doubt in ei == n - 1
            {
                ress.add(new int[]{start[si] , end[ei]});
                si = ei + 1;
            }
            ei++;
        }
        
        printArray(ress.toArray(new int[ress.size()][]));
        
    }

		
		

	
	static void printArray(int [][]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("\n");
		}
	}

}
