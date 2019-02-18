package frc.robot;

/*
Constant class to hold all static variables used in the robot program.
*/
public class Constants{

    //Motors
    public static final int BACK_LEFT_MOTOR = 2;
    public static final int BACK_RIGHT_MOTOR = 1;
    public static final int FRONT_LEFT_MOTOR = 4;
    public static final int FRONT_RIGHT_MOTOR = 3;
    public static final int ELAVATOR_DRIVE_MOTOR = 5;
    public static final int GRIPPER_MOTOR = 9;
    public static final int BALL_COLLECTOR_MOTOR_ONE = 6;
    public static final int BALL_COLLECTOR_MOTOR_TWO = 7;
    public static final int ROLLER_MOTOR_LEFT = 11;
    public static final int ROLLER_MOTOR_RIGHT = 12;
    public static final int TURRET_SLIDE_MOTOR = 8;
    public static final int TURRET_TURN_MOTOR = 10;

    //Digital Pins
    public static final int ELAVATOR_TOP_LIMIT = 0;
    public static final int ELAVATOR_BOTTOM_LIMIT = 1;
    public static final int TURRET_RIGHT_LIMIT = 7;
    public static final int TURRET_LEFT_LIMIT = 6;
    public static final int TURRET_SLIDE_FORWARD = 8;
    public static final int TURRET_SLIDE_BACKWARD = 9;

    //Analog/Relay Pins
    public static final int COLLECTOR_POTENTIOMETER_ONE = 0;
    public static final int COLLECTOR_POTENTIOMETER_TWO = 1;
    public static final int TURRET_SLIDE_POTENTIOMETER = 2;

    //PCM Pins
    public static final int[] LOWER_GRIPPER_SOLENOID = {0,1};
    public static final int[] UPPER_GRIPPER_SOLENOID = {6,7};
    public static final int[] BALL_COLLECTOR_SOLENOID = {5,4};
    public static final int LED_RING_ONE = 2;

    //Encoder and Potentiometer Values
    public static final int elevatorTopValue = 200000, elevatorBottomValue = 20, elevatorMiddleValue = 50106, reverseMaxBallCollectorArm2 = 549, forwardMaxBallCollectorArm2 = 144, arm1Max = -30223, arm1Min = -16,
    slideMax = 1000, slideMin = 100, turretMax = 20000, turretMin = 100;

    //Non-Drive Controller - 3D Joystick Logitech
    public static int elevatorTop = 8, elevatorBottom = 12, elevatorMiddle = 10, deployIntake = 9, turretLeft = 5, 
    turretRight = 6, retractIntake = 7;
    /*
    Controls: Drive, AutoModeButton, elevatorLevel1, elevatorLevel2, 
    elevatorLevel3, openGripper, 
    closeGripper, gripperIntakeSpeedForward, 
    gripperIntakeSpeedReverse, deployIntakeStartRollers,
    retractGripperStopRollers, 
    */
    //Drive Controller
    public static int changeSpeed = 7, deliverPayloadBall = 1, deliverPayloadHatch = 2, autoMode = 3, openStopGriperMotor = 4;

    //Driver Selection Enumeration
    private Driver _currentDriver = null;

    /**
   * Driver Name enum
   * Select which drivers controls to change
   */
    public enum Driver{
        STANDARD,
        ADAMT,
        JUSTIND,
    }

    /**
   * Controller Enum
   * What controller to change
   */
    public enum Controller{
        DRIVE,
        FUNCTIONS
    }

    /**
   * Change the mapped button values for each controller
   *
   * <p>Changes the set values for what button on the controller controls which robot action
   *
   * @param Driver enum and the Controller enum
   */
    public static void selectDriver(Driver driver,Controller controller){
        if(controller == Controller.DRIVE){
            if(driver == Driver.ADAMT){
            }
            if(driver == Driver.JUSTIND){
            }
        }else{
            if(driver == Driver.ADAMT){
            }
            if(driver == Driver.JUSTIND){
            }
        }
    }
}
/*
 * XBOX BUTTON MAPPING FOR DRIVER STATION AS FOLLOWS
 * Button 1 = A
 * Button 2 = B
 * Button 3 = X OR small left wheel button up
 * Button 4 = Y
 * Button 5 = Left Bumper
 * Button 6 = Right Bumper OR small right wheel down
 * Button 7 = Select / Menu Button
 * Button 8 = Start / Enter Button
 * Button 9 = Click in Left Analog Stick OR small left wheel down
 * Button 10 = Click in Right Analog Stick
 * 
 * Axis 0 = Left stick left + right
 * Axis 1 = Left stick up + down
 * Axis 2 = Left trigger
 * Axis 3 = Right trigger
 * Axis 4 = Right stick left + right
 * Axis 5 = Right stick up + down
 * 
 * POV = D-Pad
 * POV LEFT = small right wheel up
 */