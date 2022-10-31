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
        //int[] array = new int[100];
        //int sum = 0;

        //for(int i = 0;i < array.length;i++){//forにした理由:条件式でiを1ずつ増やす処理ができるから
        //    array[i] = i + 1;
        //    if(i % 2 == 0){
        //        sum = sum + array[i];
        //    }
        //}

        //System.out.println(sum);

        //課題1-5
        int[] score = {41,85,72,38,80};
        int min,max;
        double average;

        for(int i=0;i < score.length;i++){
            System.out.print(i + "番　" + score[i] + "点　");
            if(score[i] >= 90){
                System.out.println("秀");
            }
            else if(score[i] >= 80){
                System.out.println("優");
            }
            else if(score[i] >= 70){
                System.out.println("良");
            }
            else if(score[i] >= 60){
                System.out.println("可");
            }
            else{
                System.out.println("不可");
            }
        }

        min = min(score);
        max = max(score);
        average = average(score);
        System.out.println("最高点:" + max + "点");
        System.out.println("最低点:" + min + "点");
        System.out.println("平均点:" + average + "点");

    }

    static int min(int[] score){
        int min = score[0];

        for(int i=1;i < score.length;i++){
            if(min > score[i]){
                min = score[i];
            }
        }
        return min;
    }

    static int max(int[] score){
        int max = score[0];

        for(int i=1;i < score.length;i++){
            if(max < score[i]){
                max = score[i];
            }
        }
        return max;
    }

    static double average(int[] score){
        double average = 0;
        int sum = 0;

        for(int i=0;i < score.length;i++){
            sum = sum + score[i];
        }

        average = (double)sum/score.length;

        return average;
    }
}
