package collections.list.arrayList;

import java.util.concurrent.CopyOnWriteArrayList;

public class _3_CodingPracticeArrayList implements Runnable{
	
	static CopyOnWriteArrayList<String> al = new CopyOnWriteArrayList<String>();
	
	@Override
	public void run() {

		try {
			Thread.sleep(1000);
			
			al.remove(3);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String args[]) throws InterruptedException
	{
		al.add("Arun1");
		al.add("Arun2");
		al.add("Arun3");
		al.add("Arun4");
		al.add("Arun5");
		al.add("Arun6");
		
		Thread t = new Thread(new _3_CodingPracticeArrayList());
		t.start();
		
		for(String s : al) {
			Thread.sleep(1500);
			System.out.println(s);
		}
		
	
	}


	

}
