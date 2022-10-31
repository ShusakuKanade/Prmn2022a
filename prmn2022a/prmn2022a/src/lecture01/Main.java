package lecture01;

public class Main {
    public static void main(String[] args) {
        //課題1-1
        //System.out.println("B2211890 Minato Hatanaka");

        //課題1-2
        //int studentNumber = 2211890;
        //System.out.println("B" + studentNumber + " Minato Hatanaka");

        //課題1-3
        //int age = 19;

        //if(age < 20){
        //    System.out.println("I am " + age + " years old so I cannot drink liquor.");
        //}else if(age >= 20){
        //    System.out.println("I am " + age + " years old so I can drink liquior.");
        //}

        //課題1-4
        int[] array = new int[100];
        int sum = 0;

        for(int i = 0;i < array.length;i++){//forにした理由:条件式でiを1ずつ増やす処理ができるから
            array[i] = i + 1;
            if(i % 2 == 0){
                sum = sum + array[i];
            }
        }

        System.out.println(sum);
    }
}
