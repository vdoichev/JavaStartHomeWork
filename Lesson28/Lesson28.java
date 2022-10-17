package Lesson28;

public class Lesson28 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat("myaso");
        try {
            tiger.drink("voda");
            try {
                tiger.drink("pivo");
            }
            catch (NeVodaException e1){
                System.out.println(e1);
            }
            catch (Exception e2){
                System.out.println(e2);
            }
            finally {
                System.out.println("Eto inner finaly block");
            }
        }
        catch (RuntimeException e3){
            System.out.println(e3);
        }
        catch (Exception e4){
            System.out.println(e4);
        }
        finally {
            System.out.println("Eto outer finaly block");
        }
    }
}
