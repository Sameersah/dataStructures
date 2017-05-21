package package1;

import java.util.List;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility  classes
*/
import java.util.*;


class TestClass {
    
    int count;
    
    public TestClass(){
        count=0;
    }
    private boolean isPrime(int n){
    	if(n<2){
    		return false;
    	}
    	
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
    
        return true;
    }
    private boolean isPrimatic(int n){
        if(isPrime(n)){
        	System.out.println(n+" is prime.");
            return true;
        }
        
        return false;
    }
    private void pcount(int n){
        
        if(isPrimatic(n)){
        	count++;
            return  ;
        }
        for(int i=2;i<n;i++){
            if(isPrimatic(n-i)){
                count++;
                pcount(i);
                break;
            }
        }
    
        
    }
    
    public static void main(String args[] ) throws Exception {
        

        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        while(t>0){
            int n = sc.nextInt();
            TestClass tc = new TestClass();
            tc.pcount(n);
            System.out.println(tc.count);
            
            t--;
        }
    }
}

