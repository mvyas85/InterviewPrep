package meetingRoom1;

import java.util.Arrays;
import java.util.Comparator;


/**
 * 252	Meeting Rooms    
 * Given an array of meeting time Interval consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei),
 *  determine if a person could attend all meetings. For example, Given [[0, 30],[5, 10],[15, 20]], return false.
 * https://www.programcreek.com/2014/07/leetcode-meeting-rooms-java/
 */
public class MeetingRoom1 {
	public static void main(String args[]){
		
		Interval i2 = new Interval(1,6);
		Interval i3 = new Interval(2,3);
		Interval i4 = new Interval(3,4);
		Interval i1 = new Interval(1,2);
		Interval i5 = new Interval(2,4);
		
		Interval[] all = {i1,i2,i3,i4,i5};
		
		boolean i = canAttendAll(all);
		System.out.println(i);	
	}
	
	public static boolean canAttendAll(Interval[] Interval){
		Arrays.sort(Interval,new Comparator<Interval>(){
			public int compare(Interval i1,Interval i2){
				return (i1.start - i2.start);
			}
		});
		
		for(int i=1;i<Interval.length;i++){
			int previousMeetingEndTime = Interval[i-1].end;
			int nextMeetingStartTime = Interval[i].start;
			if(nextMeetingStartTime < previousMeetingEndTime)
			{
				return false;
			}
		}
		return true;
	}
}

class Interval{
	public int start;
	public int end;
	Interval(int start,int stop){
		this.start = start;
		this.end = stop;
	}
	
	@Override
	public String toString() {
		String str = "["+start+","+end+"]";
		return str;
	}
}