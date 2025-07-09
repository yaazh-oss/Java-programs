public class Numberseries {
    public static void main(String args[]){
    //EVEN NUMBERS

    for(int i=24;i<57;i+=2){
        System.out.println(i); 
    }

    //PRIME NUMBERS
    
    for(int i=10;i<=99;i++){
        int c=0;
        for(int j=1;j<=i;j++){
            if(i%j==0)
            c++;
        }
        if(c==2){
            System.out.println(i);
        }
    }
}
}
