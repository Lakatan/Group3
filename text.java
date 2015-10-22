package mypackage;

import static org.junit.Assert.*;
import org.junit.Test;
import java.lang.*;


public class Utility  {
	ArrayList<Integer> test = new Arraylist<>(); 
	public static void read(){
		 for(int i=1; i < 100; i++){
                boolean isPrime = true;
                for(int j=2; j < i ; j++){
                    if(i % j == 0){
                      isPrime = false;
                      break;
     				 }
                }
                 if(isPrime)
                     test.add(i);
                }	
	} 
	public static int ran(){
		return (int)Math.floor(Math.random*100);
	}
	public static int resultCount(){	
		ran();
		int result =0;
		for(int i=1; i<=ran;i++){
			result = result*test(ran);
		}
		return ran;
	}     
                
  	  
	@Test
	public void testCount() 
		for(int i=0; i<test.length();i++)
		assertEquals(resultCount(),Methods.CountFactor(ran()));
	}
	
	@Test
	public void testPeri() {
		int result;
		assertEquals(resultPeri(i),result);
	}
	
	@Test
	public void testMisElem() {
		assertEquals(4,result);
	}
	
	@Test(expected = Exception.class)
	public void testCountInvalidInput(){
		char x = q;
		int result = Methods.countFactor(x);
		
	}
	
	@Test(expected = RuntimeException.class)
	public void testArrayMaxLenght(){
		int [] x = new int [10];
		Methods.permMisElem(x);
	}
	
	@Test(expected = RuntimeException.class)
	public void testRuntimeTestCount(){
		Methods.countFactor(1000);
	}
	
	
	

}

