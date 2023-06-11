public class PascalTriangle {
    static void DisplayRec(int size,int line,int count,int n){
        if(line==size){
            return;
        }
        if(count<=size-line){
            System.out.print(" ");
            DisplayRec(size, line, count+1, n);
            return;
        }
        if(n<=line){
            System.out.print(" "+fact(line)/(fact(line-n)*fact(n)));
            DisplayRec(size, line, count, n+1);
            return;
        }
        System.out.println();
        count=0;
        n=0;
        DisplayRec(size, line+1, count, n);
        return;
    }
    static int fact(int num){
        if(num==0){
            return 1;
        }
        return num*fact(num-1);
    }
    static void Display(int num){
        for(int i=0;i<=num;i++){
            for(int j=0;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(" "+fact(i)/(fact(i-j)*fact(j)));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Display(6);
        DisplayRec(5, 0, 0, 0);
    }
}
