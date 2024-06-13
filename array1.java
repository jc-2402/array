//update marks of each by 1 .. using functions
public class array1{
    public static void update(int marks[]){
        for(int i=0; i< marks.length; i++){
            marks[i] += 1;
        }
    }
    public static void main(String[] args) {
        //int marks[]= new int[50];
        int  marks[] = {90,98,99};
        update(marks);
        System.out.println("updated :");
        //to print
        for(int i =0; i<marks.length; i++ ){
            System.out.print(marks[i]+" ");
        }
    }
}