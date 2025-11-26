
public class ArrCharOps {
    public static void main(String[] args) {
        String str = "clearly";
        char[] arr1 = {'c','l','e','a','r','l','y'};
        char[] arr2 = {'U','n','d','e','r','s','t', 'o', 'o', 'd'};
        System.out.println(str);  // Prints the string
        println(arr1);            // Prints an array of characters
        System.out.println(charAt(arr1,2));      
        System.out.println(indexOf(arr1,'l'));  
        System.out.println(indexOf(arr1,'l',3)); 
        System.out.println(lastIndexOf(arr1, 'l'));
        System.out.println(concat(arr1, arr2));
        System.out.println(subArray(arr2, 2, 9));
        System.out.println(compareTo("abcd", "abcd"));
        System.out.println(compareTo("abc", "abcd"));
        System.out.println(compareTo("abw", "abcd"));
        System.out.println(compareTo("Abcd", "a"));
        System.out.println(compareTo("apple", "banana"));
        System.out.println(compareTo("apple", "applepie"));
        System.out.println(compareTo("Zoo", "zoo"));
        System.out.println(hashCode(arr1));
        System.out.println(hashCode(arr2));
    }

   
    public static void println(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static char charAt(char[] arr, int index) {
        char C = arr [index];
        return C;
    }

    public static boolean equals(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        } 
        for ( int i = 0; i < arr1.length; i ++) {
            if ( arr1 [i] != arr2 [i] ) {
                return false;
            }
        } 
        return true;
    }

    public static int indexOf(char[] arr, char ch) {
        int i = 0;
        for (; i < arr.length; i ++) {
            char C = arr [i];
            if ( C != ch) {
              return -1;  
            }
        }
        return i;
    }

    public static int indexOf(char[] arr, char ch, int fromIndex) {
         int i = fromIndex;
        for (; i < arr.length; i ++) {
            char C = arr [i];
            if ( C != ch) {
              return -1;  
            }
        }
        return i;
    }

    public static int lastIndexOf(char[] arr, char ch) {
        int i = arr.length -1;
        for (; i >= 0; i --) {
            char C = arr [i];
            if ( C != ch) {
              return -1;  
            }
        }
        return i;
    }

    public static char[] concat(char[] arr1, char[] arr2) {
        char [] newArr = new char[arr1.length + arr2.length];
        for ( int i = 0; i < arr1.length; i++) {
            newArr [i] = arr1 [i];
        }
        for ( int i = 0; i < arr2.length; i ++) {
            newArr [ arr1.length + i] = arr2 [i];
        }
        return newArr;
    }
     
    public static char[] subArray(char[] arr, int beginIndex, int endIndex) {
        char [] newArr = new char[endIndex- beginIndex];
        for ( int i = 0; i < newArr.length; i++) {
            newArr [i] = arr [beginIndex +i ];
        }
    
        return newArr;
    }

    public static long hashCode(char[] arr) {
        int n = arr.length;
        int result = 0;
        for ( int i =0 ; i < arr.length; i ++) {
            result = result + arr[i]*(int)Math.pow(7, n -1 -i);
        }

        return result;
    }

    public static int compareTo(String str1, String str2) {
    int min = Math.min(str1.length(), str2.length());
    if (str1 == null || str2 == null || str1.length()==0 || str2.length() ==0) {
        return -2;
    }
    for ( int i =0; i <min; i ++) {
        char c1 = str1.charAt(i);
        char c2 = str2.charAt(i);
        if (c1 < c2) {
            return -1;
        }
        if (c1 > c2) {
            return 1;
        }
        if ( str1.length()== str2.length()) {
            return 0;
        }
          else  if ( str1.length()< str2.length()) {
            return -1;
        } else {
            return 1;
        }
      }  
      return -2;
    }
    
}