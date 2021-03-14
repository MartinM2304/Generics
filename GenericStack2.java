package generics;

import java.util.ArrayList;

public class GenericStack2<E> extends ArrayList<E> {

		
		public GenericStack2() {
			super();
		}
		
		public int getSize() {
			return super.size();
		}
		
		public boolean isEmpty() {
			return super.isEmpty();
		}
		
		public E peek() {
			return super.get(super.size()-1);
		}
		
		public E pop() {
			E element = super.remove(super.size() -1);
			return element;
		}
		
		public void push(E element) {
			super.add(element);
		}
		
		@Override
		public String toString() {
			return "stack: "+super.toString();
		}
	}


