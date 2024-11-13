public class Patterns {
    public static void main(String[] args) {
        for (int line=1; line<=4;line++){
            for(int star=1; star<=line;star++){
                System.out.print("*");
            }
            // this line is must be added to specify the next line 
            System.out.println();

        }
    }
}

// Inverted pattern 

public class Patterns {

    public static void main(String[] args) {
        int n= 10;
        for(int line=1;line<=n;line++){
            for(int star=1;star<=n-line+1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


//  half-pyramid pattern

public class Patterns {

    public static void main(String[] args) {
      int  n=10;
        for(int line=1; line<=n;line++){
            for(int num=1;num<=line;num++){
                System.out.print(num);
            }
            System.out.println();
        }
    }
}



// print charecter pattern

public class Patterns {

public static void main(String[] args) {
    int n =4;
    char ch='A';
    // OUTER LOOP
    for(int line=1; line<=n;line++){
        // inner loop
        for(int chars=1; chars<=line;chars++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
}
}