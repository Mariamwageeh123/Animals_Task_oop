import java.util.Random;
public class Peaceful extends Animal {
    boolean result;
//    Random rand = new Random();
    @Override
    public void Sound(String Sound) {
        System.out.println("your sound is "+Sound);
    }

    public void GotAttack(double power) {
       setHealth(getHealth()-power);
    }


    public boolean Escape() {
        double escape = Math.random();
        if (escape>=0.5){
            result=false;
        }
        else if(escape>0.0 && escape<0.5){
            result= true;
        }
        return result;
    }
//    public void ayhaga(Aggressive monda) {
//        monda. => aggresive
//                this => peaceful ديه اكني بجيب كلاس ال aggressive
//                 هنا وممكن انادي علي اي فانكشن جواه واباصيلها اي حاجه


//    }
}
