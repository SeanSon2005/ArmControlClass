public class Run{
    public static void main(String[] args){
        ArmControl arm = new ArmControl(100, 50, 50);
        arm.calcAngles(-1,100,30);
        System.out.println(arm.getFirstAngle() + " " + arm.getSecondAngle() + " " + arm.getTurretAngle());
    }
    
}