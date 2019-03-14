package frc.robot;


/*
Constant class to hold all static variables used in the robot program.
*/
public class Constants{

    //Motors
    public static final int BACK_LEFT_MOTOR = 2;
    public static final int BACK_RIGHT_MOTOR = 1;
    public static final int FRONT_LEFT_MOTOR = 4;
    public static final int FRONT_RIGHT_MOTOR = 12;
    public static final int ELAVATOR_DRIVE_MOTOR = 5;
    public static final int GRIPPER_MOTOR = 9;
    public static final int BALL_COLLECTOR_MOTOR_ONE = 6;
    public static final int BALL_COLLECTOR_MOTOR_TWO = 7;
    public static final int ROLLER_MOTOR_LEFT = 11;
    public static final int ROLLER_MOTOR_RIGHT = 3;
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

    //Extend, Retract Arm  and Load Cargo constants.
    public static final double ArmMotorSpeed = 0.475;
    public static final int elevatorLiftToClearGrippersPos = 18000;
    public static final int elevatorLoadcargo = 0;
    public static final int arm1collectPosFinal = 18100;
    public static final int arm1RetractPos1 = 13000;
    public static final int arm1LoadPos = 15000;
    public static final int arm1RetractPosFinal = 0;
    public static final int arm2RetractPosFinal = 394;
    public static final int arm2CollectPos1 = arm2RetractPosFinal-40;
    public static final int arm2CollectPosfinal = arm2RetractPosFinal-220;
    public static final int arm2RetractPos1 = arm2CollectPosfinal + 10;
    public static final int arm2LoadPos = arm2RetractPosFinal - 280;
    //public static final int arm2LoadPos = arm2RetractPosFinal - 260;

    //TurretConstants
    
    public static  int turretTurnMinPos = 0;
    public static  int  turretTurnMaxPos = 7610;
    public static final double turretSpeed = 0.3; 
    public static final int turretTurnLeftPos = 485;
    public static final int turretTurnRightPos = 8067;

    public static final double slideMotorspeed = 1;
    public static final double gripperMotorDeployBallSpeed = 1;
    public static final double gripperMotorReciveBallSpeed = 0.5;

    public static final int elevatorTopValue = 200000;
    public static final int elevatorBottomValue = 0;
    
    public static final int elevatorLevelOne = 0;
    public static final int elevatorLevelThree = 117182;
    public static final int elevatorLeveltwo = (elevatorLevelOne+elevatorLevelThree)/2;
    
    public static final int reverseMaxBallCollectorArm2 = 549;
    public static final int forwardMaxBallCollectorArm2 = 144;
    public static final int arm1Max = -30223;
    public static final int arm1Min = -16;

      
    public static final int slideMax = 1000;
    public static final int slideMin = 100;
    public static final int  turretMax = 7636;
    public static final int turretMin = 21;

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
    private static Driver _currentDriver = null;

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
                _currentDriver = Driver.ADAMT;
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

    public static Driver getCurrentDrive() {
        return _currentDriver;
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