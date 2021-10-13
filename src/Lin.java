import java.util.Scanner;

public class Lin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入楼层:");
        if(input.hasNextInt()){
            int i = input.nextInt();
            if(i >= 1 && i <= 5){
                System.out.println("请走楼梯！");
            }else if(i >= 6 && i < 15){
                System.out.println("请进电梯");
            }else{
                System.out.println("本楼只有1~15层，输入数据错误，请重新输入");
            }
        }else{
            System.out.println("本楼只有1~15层，输入数据错误，请重新输入");
        }
    }
}
