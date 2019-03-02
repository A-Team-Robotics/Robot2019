package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Constants;

public class BallCollectorSystem extends Subsystem{

    private WPI_TalonSRX _armOneMotor = new WPI_TalonSRX(6);
    private WPI_TalonSRX _rollerMotorLeft = new WPI_TalonSRX(Constants.ROLLER_MOTOR_LEFT);
    private WPI_TalonSRX _rollerMotorRight = new WPI_TalonSRX(Constants.ROLLER_MOTOR_RIGHT);

    private DoubleSolenoid _armExtendor = new DoubleSolenoid(Constants.BALL_COLLECTOR_SOLENOID[0],Constants.BALL_COLLECTOR_SOLENOID[1]);

    private static BallCollectorSystem _ballCollectorSystemInstance = null;

    public BallCollectorSystem(){
        super("Intake");
    }

    public static BallCollectorSystem getInstance(){
        if(_ballCollectorSystemInstance == null){
            _ballCollectorSystemInstance = new BallCollectorSystem();
        }
        return _ballCollectorSystemInstance;
    }

    
    public void init() {
        _armOneMotor.setInverted(true);
        //_armOneMotor.setSensorPhase(true);
    }

    
    public void log() {
        SmartDashboard.putNumber("Ball Collector Arm One", _armOneMotor.getSelectedSensorPosition());
    }

    public void setMotorOne(int pos){
        _armOneMotor.set(ControlMode.Position, pos);
    }

    public int getArmOnePosition(){
        return _armOneMotor.getSelectedSensorPosition();
    }

    public void setRollersForward(){
        _rollerMotorLeft.set(0.5);
        _rollerMotorRight.set(0.5);
    }

    public void stopRollers(){
        _rollerMotorLeft.stopMotor();
        _rollerMotorRight.stopMotor();
    }

    public void setRollersReverse(){
        _rollerMotorLeft.set(-0.5);
        _rollerMotorRight.set(-0.5);
    }

    public void openArms(){
        _armExtendor.set(Value.kForward);
    }

    public void closeArms(){
        _armExtendor.set(Value.kReverse);
    }

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(null);
    }

}