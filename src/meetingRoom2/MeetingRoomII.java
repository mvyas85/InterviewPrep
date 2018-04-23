package meetingRoom2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 	253	Meeting Rooms II    

 * Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] 
 * find the minimum number of conference rooms required.
 *
 */
public class MeetingRoomII {

	public static void main(String args[]){
		
		Intervals i2 = new Intervals(1,2);
		Intervals i1 = new Intervals(1,6);
		Intervals i3 = new Intervals(2,3);
//		Intervals i4 = new Intervals(3,4);
		Intervals i5 = new Intervals(2,4);
		
		Intervals[] all = {i1,i2,i3,i5};
		
		int i = requiredConfRooms(all);
		System.out.println(i);
	}
	
	public static int requiredConfRooms(Intervals[] intervals){
		
		if(intervals.length == 0){
			return 0;
		}
		if(intervals.length == 1){
			return 1;
		}
		Arrays.sort(intervals,new Comparator<Intervals>(){
			@Override
			public int compare(Intervals i1,Intervals i2){
				return i1.start-i2.start;
				
			}
		});
		
		printMeetins(intervals);
		
		int count =1;
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		queue.offer(intervals[0].end);
		
		for(int i=1;i<intervals.length;i++){
			if(intervals[i].start<queue.peek()){
				count++;
			}else{
				queue.poll();
			}
			queue.offer(intervals[i].end);
		}
		
		return count;
	}
	
	public static void printMeetins(Intervals[] intervals){
		for(Intervals i:intervals){
			System.out.println(i);
		}
	}
}

class Intervals{
	public int start;
	public int end;
	Intervals(int start,int stop){
		this.start = start;
		this.end = stop;
	}
	
	@Override
	public String toString() {
		String str = "["+start+","+end+"]";
		return str;
	}
}
