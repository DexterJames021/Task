package onlineClass;

interface Animal {
    boolean feed(boolean timeToEat);

    void grom();

    void pet();
}

class Gorrila implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        // TODO Auto-generated method stub
        // put gorilla food into cage
          if (timeToEat) {
            System.out.println("Gorilla is eating. Food placed in cage.");
            return true;
        } 
        return false;
    }

    @Override
    public void grom() {
        // TODO Auto-generated method stub
        // lather, rinse, repeat
        System.out.println("lather, rinse, repeat");
    }

    @Override
    public void pet() {
        // TODO Auto-generated method stub
        // pet at your own risku
        System.out.println("pet at your own risku");
    }

}

public class Task16 {

}
