public class main{
    public static  void main(String[] args){
       

    // Exercițiu practic #1
       char var = 'l';

       switch(var) {
       case 'l': 
         System.out.println("consoana");
         break;
       case 'a': 
          System.out.println("vocala");
          break;

        default:
        System.out.println("caracter necunoscut");
                  }


        if (var == 'l' )System.out.println("conosana");
        else if (var == 'a') {System.out.println("voacala");}
        else  {System.out.println("caracter necunoscut");}



    // Exercițiu practic #2
       int n = 10; 
       int i = 1;
       int sum = 0;

        do {
           sum += i;
           i++;
        } while (i <= n);

       System.out.println("Suma primelor " + n + " numere intregi este " + sum);


    }
}