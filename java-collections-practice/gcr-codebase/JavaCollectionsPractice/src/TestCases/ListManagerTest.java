package TestCases;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.junit.ListManager;

public class ListManagerTest {
	private ListManager listManager;
	private List<Integer> list;
	
	@BeforeEach
	void setup() {
		listManager = new ListManager();
		list = new ArrayList<Integer>();
	}
	
	@Test
	void addElement() {
		listManager.addElement(list, 20);
		listManager.addElement(list, 18);
		listManager.addElement(list, 45);
		
		assertEquals(3, listManager.getSize(list));
		assertTrue(list.contains(18));
		assertTrue(list.contains(17), "Element 17 not present");
	}
	
	@Test
	void removeElement() {
		listManager.addElement(list, 20);
		listManager.addElement(list, 18);
		listManager.addElement(list, 45);
		
		assertEquals(3, listManager.getSize(list));
		listManager.removeElement(list, 20);
		assertTrue(list.contains(20), "Element 17 not present");
	}
	
	@Test
	void getSize() {
		assertEquals(0, listManager.getSize(list));

        listManager.addElement(list, 5);
        listManager.addElement(list, 15);

        assertEquals(2, listManager.getSize(list));

        listManager.removeElement(list, 5);

        assertEquals(1, listManager.getSize(list));
	}
	
}
