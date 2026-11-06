package ControlFlow;

public class EnhancedSwitchStatement {

    static void enhancedSwitch(){
        int switchValue = 5;
        switch (switchValue){
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 1");
            case 3 -> System.out.println("Value was 1");
            case 4, 5 -> {
                System.out.println("Value was 4 or 5");
                System.out.println("Value was actually " + switchValue);
            }
            default -> System.out.println("Was none.");
        }
    }
}
