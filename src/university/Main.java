package university;

public class Main {
    //Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();

        //Declaration of array
        int numbersArray[];
        numbersArray = new int[]{2,4,6,8,10,12,14,16,18,20};
        for(int i : main.sum(numbersArray)){
            System.out.println(i);
        };
    }

    int[] sum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);
        int arraynum[] = new int[]{1,2,3,4};
        return arraynum;
    }
    String sum(int a, int b){
        int sum = a+b;
        return "some string";
    }
}
