//find samosa
//linear search
public class array3{
    public static int linearsearch(String menu[], String item){
        for(int i=0; i<menu.length ; i++){
            if(menu[i].equals(item)){ //to compare 2 strings == cant be used
                return i; // rather use menu[i].equals(key) method
            }
        }
        return -1;
    }
    public static void main(String args[]){
        String menu[] = {"dosa","idle", "samosa", "tea"};
        String item = "samosa";
        int index = (linearsearch(menu, item)) + 1;
        if(index == -1){
            System.out.print("key not found");
        }
        else {
            System.out.println("key found at index "+index);
        }
    }
}