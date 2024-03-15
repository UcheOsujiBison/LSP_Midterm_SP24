package org.howard.edu.lsp.midterm.question2;

/**
 * Test class for IntegerRange.
 */
public class RangeTester {
    public static void main(String[] args) {
        // Creating IntegerRange objects for testing
        IntegerRange range1 = new IntegerRange(1, 5);
        IntegerRange range2 = new IntegerRange(3, 7);
        IntegerRange range3 = new IntegerRange(6, 10);

        // Testing contains method
        System.out.println("Does range1 contain 3? " + range1.contains(3)); // true
        System.out.println("Does range1 contain 7? " + range1.contains(7)); // false

        // Testing overlaps method
        System.out.println("Does range1 overlap with range2? " + range1.overlaps(range2)); // true
        System.out.println("Does range1 overlap with range3? " + range1.overlaps(range3)); // false

        // Testing size method
        System.out.println("Size of range1: " + range1.size()); // 5

        // Testing equals method
        IntegerRange range4 = new IntegerRange(1, 5);
        System.out.println("Are range1 and range4 equal? " + range1.equals(range4)); // true
    }
}