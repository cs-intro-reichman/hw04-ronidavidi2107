public class Primes {
    public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    boolean [] isPrime = new boolean[ n +1];
    for (int i = 0; i <= n; i++) {
    isPrime[i] = true;
    }
    if (n >= 0) {
    isPrime[0] = false;
    }
    if (n >= 1) {
    isPrime[1] = false;
    }
    int p = 2;
    while (p*p <= n) {
        if ( isPrime[p] == true) {
            int i = p*p;
            while (i <= n) {
                isPrime [i] = false;
                i = i + p;
            }
            
        }
       p ++; 
    }
    System.out.println("Prime numbers up to " + n + ":");

        int primeCount = 0; 
        for (int i = 2; i <= n; i++) {
            if (isPrime[i] == true) {
                System.out.println(i);
                primeCount++;
            }
        }  
     double percentage = ((double) primeCount / (n)) * 100;
     int rpercentage = (int) Math.round(percentage);
     System.out.println("There are " + primeCount + " primes between 2 and " + n +" (" + rpercentage + "% are primes)" );

    }
}