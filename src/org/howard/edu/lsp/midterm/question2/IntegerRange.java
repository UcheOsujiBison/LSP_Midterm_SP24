package org.howard.edu.lsp.midterm.question2;

import org.w3c.dom.DOMException;
import org.w3c.dom.DocumentFragment;
import org.w3c.dom.Node;
import org.w3c.dom.ranges.Range;
import org.w3c.dom.ranges.RangeException;

public abstract class IntegerRange implements Range {
	private int lowerBound;
	private int upperBound;
	
	/**
	 * Constructs an IntegerRange with the upper and lower bounds
	 * 
	 * @param lowerBound, the lower bound of range
	 * @param upperBound, the upper bound of range
	 * */
	public IntegerRange(int lowerBound, int upperBound) {
		this.lowerBound = lowerBound;
		this.upperBound = upperBound;
	}
	
	/**
	 * Checks if the range has the value
	 * 
	 * @param value that is needed
	 * @return True if the range contains the value, if not then false
	 * */
	public boolean contains(int value) {
		return value >= lowerBound && value <= upperBound;
	}
	
	/**
	 * Checks if range has an overlap
	 * 
	 * @param the other range that it is being compared to
	 * @return True if there is one integer value in both ranges, if not then returns false
	 * */
	public boolean overlaps(Range other) {
		return lowerBound <= other.upperBound && upperBound >= other.lowerBound;
	}
	
	/**
	 * 
	 * Returns the number of integers in range
	 * 
	 * @param the number of integers in given range
	 * */
	public int size() {
		return upperBound - lowerBound + 1; //Adding the 1 is including the upperBound
	}
	
	/**
	 * Checking if range is equal to another object
	 * 
	 * @param obj object to compare
	 * @return True if ranges are equal, if not then False
	 * */
	@Override 
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof IntegerRange)) {
			return false;
		}
		IntegerRange other = (IntegerRange) obj;
		return this.lowerBound == other.lowerBound && this.upperBound == other.upperBound;
	}
}
