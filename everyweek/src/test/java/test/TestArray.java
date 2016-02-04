package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestArray {

	@Test
	public void test() {
		int[] a = {0, 1};
		List<Integer[]> list = new ArrayList<Integer[]>();
		int[] b = {0, 1};
		System.out.println(a.equals(b));
	}

}
