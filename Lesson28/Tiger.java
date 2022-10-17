package Lesson28;

public class Tiger{

    void eat(String meat){
        if (!meat.equals("myaso")){
            throw new NeMyasoException("Tigr ne est "+meat);
        }
        else{
            System.out.println("Tigr est myaso");
        }
    }

    void drink(String water) throws NeVodaException {
        if (!water.equals("voda")){
            throw new NeVodaException("Tigr ne pyet "+water);
        }
        else{
            System.out.println("Tigr pyot vodu");
        }
    }
}
