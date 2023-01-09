public class main {
    public static void main (String[]args){
        ArmControl arm = new ArmControl(100, 50, 50);
        arm.calcAngles(50, 90, 0);
        System.out.println(arm.getFirstAngle() + " " + arm.getSecondAngle() + " " + arm.getTurretAngle());
    }
}
