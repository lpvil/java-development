import java.util.ArrayList;
import java.util.Collections;

public class BreakoutRoomAges {
    public static void main(String[] args) {
        ArrayList<Integer>Ages = new ArrayList<>();
        Ages.add(28);
        Ages.add(24);
        Ages.add(29);
        Ages.add(27);
        Collections.sort(Ages);
        for(int i = 0; i < Ages.size(); i++){
            System.out.println(Ages.get(i));
        }

        ArrayList<Integer>addAllAges = new ArrayList<>();
        int sum = 0;

        for(int age : Ages){
            sum += age;
        }
        System.out.println(sum*2);
    }
}
