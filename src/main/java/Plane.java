public class Plane {
    private PlaneState planeState = new InHangar();

    public void exitHangar(){
        planeState.exitHangar();
    }
    public void enterHangar(){
        planeState.enterHangar();
    }
    public void takeOff(){
        planeState.takeOff();
    }
    public void land(){
        planeState.land();
    }

    public interface PlaneState {
        public void exitHangar();
        public void enterHangar();
        public void takeOff();
        public void land();
    }

    public class InHangar implements PlaneState{
        @Override
        public void exitHangar() {
            System.out.println("State Transition from Hangar to Runway");
            planeState = new OnRunway();
        }

        @Override
        public void enterHangar() {
            System.out.println("Already In Hangar");

        }

        @Override
        public void takeOff() {
            System.out.println("Impossible to take off while in the Hangar");
        }

        @Override
        public void land() {
            System.out.println("Impossible to land while in the Hangar");
        }
    }

    public class OnRunway implements PlaneState{
        @Override
        public void exitHangar() {
            System.out.println("Already on Runway");
        }

        @Override
        public void enterHangar() {
            System.out.println("State Transition from Runway to Hangar");
            planeState = new InHangar();
        }

        @Override
        public void takeOff() {
            System.out.println("State Transition from Runway to Air");
            planeState= new InAir();
        }

        @Override
        public void land() {
            System.out.println("Already on Runway");
        }
    }

    public class InAir implements PlaneState{
        @Override
        public void exitHangar() {
            System.out.println("Already In Air");
        }

        @Override
        public void enterHangar() {
            System.out.println("Impossible to enter the Hangar while In Air");
        }

        @Override
        public void takeOff() {
            System.out.println("Already In Air");
        }

        @Override
        public void land() {
            System.out.println("State Transition from Air to Runway");
            planeState=new OnRunway();
        }
    }

}
