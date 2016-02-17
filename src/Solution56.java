import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Solution56 {

	public static void main(String[] args) {
		List<Interval> intervals = new ArrayList<>();
		intervals.add(new Interval(8, 10));
		intervals.add(new Interval(2, 6));
		intervals.add(new Interval(1, 3));
		intervals.add(new Interval(15, 18));

		List<Interval> mergedIntervals = merge(intervals);
		for (Interval interval : mergedIntervals) {
			System.out.println(interval);
		}
	}

	public static List<Interval> merge(List<Interval> intervals) {
		List<Interval> mergedIntervals = new ArrayList<>();

		Collections.sort(intervals, new Comparator<Interval>() {
			public int compare(Interval first, Interval second) {
				return first.start - second.start;
			}
		});

		return mergedIntervals;
	}
}

/* Definition for an interval. */
class Interval {
	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		start = s;
		end = e;
	}

	public String toString() {
		return "Start: " + start + ", End: " + end;
	}
}