package generics;

public class GenericStack <E> {
	
	E[] array = (E[])new Object[3];
	int max = 3;
	int n =0;
	
	public GenericStack() {
	}
	
	public int getSize() {
		return array.length;
	}
	public E peek() {
		return array[n-1];
	}
	
	public void expandArray() {
		max*=2;
		E[] temp = (E[]) new Object[max];
		System.arraycopy(array, 0, temp, 0, array.length);

	    array = temp;
	}
	public void push(E o) {
 
		if(n==max) {
			expandArray();
		}
		array[n] = o;
		n++;
	}
	public boolean Empty() {
		return n==0;
	}
	
	public E pop() {
		if(!Empty()) {
			E o = peek();
			array[--n]=null;
			return o;
		}
		return null;
		
	}
	@Override
	public String toString() {
		return "stack: " + array.toString();
	}
	
	
	
	
}
	


//	public static int currentSize = 0;
//    
//    private E[] list = (E[])new Object[currentSize];
//
//  public void add(int index, E e) {
//      ensureCapacity();
//
//      for (int i = currentSize - 1; i >= index; i--) {
//          list[i + 1] = list[i];
//
//      list[index] = e;
//
//      currentSize++;   
//    }
//  }
//  public int getLength() {
//    return list.length;
//  }
//
//  public E peek() {
//	  E o = null;
//      o = list[currentSize-1];
//      return o;
//  }
//  public E push(E o) {
//	  list[currentSize]=o;
//	  currentSize++;
//	    return o;
//  }
//  public E pop() {
//      E o = null;
//      
//       o=list[currentSize - 1];
//       list[currentSize - 1] = null;
//       currentSize--;
//       return o;
//      
//
//      }
//      
//  
//  
//  private void ensureCapacity() {
//      if (currentSize >= list.length) {
//        @SuppressWarnings("unchecked")
//        E[] newlist = (E[])(new Object[currentSize * 2 + 1]);
//          System.arraycopy(list, 0, newlist, 0, currentSize);
//          list = newlist;
//      }
//  }
//  public boolean isEmpty() {
//	  if (currentSize > 0) {
//		    return false;
//		  }
//		  else {
//		      return true;
//		    }
//      
//   }
	
