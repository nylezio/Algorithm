//分糖果
public class DistributeCandies_1103 {

    public static int[] distributeCandies(int candies, int num_people) {
        int [] ans= new int[num_people];
        int count = 0;
        int times = 1;
        while (count < candies){
            count+= times;
            times++;
        }
        count = count - times + 1;
        times-=2;
        int rest = candies - count;
        System.out.println("rest:" + rest);
        System.out.println("times:" + times);
        if (times < num_people){
            for (int i = 0; i < times; i++){
                ans[i] = i + 1;
            }
            ans[times]=rest;
        }
        else if (times == num_people){
            for (int i = 0; i < times; i++){
                ans[i] = i + 1;
            }
            ans[0]+=rest;
        }
        else {
            int sum_time = 0;

            for (int i = 0; i <= times / num_people; i++){
                sum_time += i;
            }

            for (int i = 0; i < times % num_people; i++){
                ans[i] = sum_time * num_people + (times/num_people+1)*(i+1);
            }
            ans[times%num_people] = (sum_time - times/num_people)*num_people + (times/num_people)*(times%num_people+1)+ rest;
            for (int i = times % num_people + 1; i < num_people; i++){
                ans[i] = (sum_time - times/num_people) * num_people + (times/num_people)*(i+1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int num_people = 4;
        int candies = 60;
        int [] ans= distributeCandies(candies, num_people);
        for (int a: ans){
            System.out.println(a);
        }
    }
}
