import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RoteiroTest {
    
    @Test
    public void testIsAVL() {
    	BST bst = new BST();
    	assertTrue(bst.isAVL());
    	int[] values = new int[]{41,20,11,29,
    		32,65,50,91,72,99};
    	for (int i : values)
    		bst.add(i);
    	assertTrue(bst.isAVL());

    	bst = new BST();
    	bst.add(1);
    	assertTrue(bst.isAVL());
    	bst.add(2);
    	assertTrue(bst.isAVL());
    	bst.add(3);
    	assertFalse(bst.isAVL());

		bst = new BST();
    	bst.add(1);
    	assertTrue(bst.isAVL());
    	bst.add(3);
    	assertTrue(bst.isAVL());
    	bst.add(2);
    	assertFalse(bst.isAVL());    	

    	bst = new BST();
    	bst.add(10);
    	assertTrue(bst.isAVL());
    	bst.add(5);
    	assertTrue(bst.isAVL());
    	bst.add(1);
    	assertFalse(bst.isAVL());

    	bst = new BST();
    	bst.add(10);
    	assertTrue(bst.isAVL());
    	bst.add(5);
    	assertTrue(bst.isAVL());
    	bst.add(6);
    	assertFalse(bst.isAVL());

        bst = new BST();
    	values = new int[]{90,13,4,8,37,16,24,44,
    		42,88,51,72,81,84,92};
    	for (int i : values)
    		bst.add(i);
		assertFalse(bst.isAVL());

        bst = new BST();
		values = new int[]{23, 12, 40, 9, 25, 60, 50};
    	for (int i : values)
    		bst.add(i);
		assertTrue(bst.isAVL());
    } 

	@Test
    public void testSearch() {
    	BST bst = new BST();
		assertEquals(-1, bst.height());
    	int[] values = new int[]{41,20,11,29,32,65,50,91,72,99};
    	for (int i : values)
    		bst.add(i);
		assertEquals(41, bst.search(41).value);
		assertEquals(20, bst.search(20).value);
		assertEquals(11, bst.search(11).value);
		assertEquals(29, bst.search(29).value);
		assertEquals(32, bst.search(32).value);
		assertEquals(65, bst.search(65).value);
		assertEquals(50, bst.search(50).value);
		assertEquals(91, bst.search(91).value);
		assertEquals(72, bst.search(72).value);
		assertEquals(99, bst.search(99).value);
    }

	@Test
    public void testHeight() {
    	BST bst = new BST();
		assertEquals(-1, bst.height());
    	int[] values = new int[]{41,20,11,29,32,65,50,91,72,99};
    	for (int i : values)
    		bst.add(i);
		assertEquals(3, bst.height());
		
    	bst = new BST();
    	bst.add(1);
		assertEquals(bst.height(), 0);
    	bst.add(2);
		assertEquals(bst.height(), 1);
    	bst.add(3);
		assertEquals(bst.height(), 2);
    }
}
