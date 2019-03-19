/**
 * Created by User on 10.03.2019.
 */
public class EnumTest {
    public static void main(String[] args) {
        WorkDays workDay;
        workDay = WorkDays.FRIDAY;

        long startTime = System.nanoTime();
        dayDescription(workDay);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);

        startTime = System.nanoTime();
        dayDescription2(workDay);
        estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);
    }


    public static void dayDescription(WorkDays workDay){
        switch (workDay){
            case MONDAY:
                System.out.println("The first day of week, it's very hard");
                break;
            case TUESDAY:
                System.out.println("The second day, good day for a work");
                break;
            case WEDNESDAY:
                System.out.println("The third day, FRIDAY is closer than yesterday!");
                break;
            case THURSDAY:
                System.out.println("It's a little FRIDAY!");
                break;
            case FRIDAY:
                System.out.println("I love it!");
                break;
            default:
                System.out.println("Don't worry, be happy, but something gone wrong...");
        }
    }

    public static void dayDescription2(WorkDays workDay){
        if(workDay.equals(WorkDays.MONDAY)){
            System.out.println("The first day of week, it's very hard");
        } else if(workDay.equals(WorkDays.TUESDAY)){
            System.out.println("The second day, good day for a work");
        } else if(workDay.equals(WorkDays.WEDNESDAY)){
            System.out.println("The third day, FRIDAY is closer than yesterday!");
        } else if(workDay.equals(WorkDays.THURSDAY)){
            System.out.println("It's a little FRIDAY!");
        } else if(workDay.equals(WorkDays.FRIDAY)){
            System.out.println("I love it!");
        }
    }
}
