class Prime
{ 
    void prime(int n) 
    { 
        // Create a boolean array "prime[0..n]" and initialize 
        // all entries it as true. A value in prime[i] will 
        // finally be false if i is Not a prime, else true. 
        boolean prime[] = new boolean[n+2]; 
        for(int i=0;i<=n;i++) 
            prime[i] = true; 
          
        for(int p = 2; p*p <=n; p++) 
        { 
            // If prime[p] is not changed, then it is a prime 
            if(prime[p] == true) 
            { 
                // Update all multiples of p 
                for(int i = p*p; i <= n; i += p) 
                    prime[i] = false; 
            } 
        } 
          
        // Print all prime numbers 
        for(int i = 20; i <= n; i++) 
        { 
            if(prime[i] == true) 
                System.out.print(i + " "); 
        } 
	System.out.println();
    } 
      
    // Driver Program to test above function 
    public static void main(String args[]) 
    { 
        int n = 100; 
        System.out.print("Following are the prime numbers "); 
        System.out.println("smaller than or equal to " + n+" and greater than or equal to 20 "); 
       Prime g = new Prime(); 
        g.prime(n); 
    } 
} 
  
