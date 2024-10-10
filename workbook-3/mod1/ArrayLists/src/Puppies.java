import java.util.ArrayList;
import java.util.List;

public class Puppies {
    public static void main(String[] args) {
     Puppy p1 = new Puppy("max","bulldog");
     Puppy p2 = new Puppy("booger","chihuahua");
     Puppy p3 = new Puppy("tren","mastiff");

     List<Puppy> myPuppies = new ArrayList<>();
     myPuppies.add(p1);
     myPuppies.add(p2);
     myPuppies.add(p3);
     myPuppies.remove(p1);

     for(int r = 0; r < myPuppies.size(); r++){
         System.out.println(myPuppies.get(r).getBreed());
     }
        System.out.println("remaining puppies " + myPuppies.size());
    }
}
