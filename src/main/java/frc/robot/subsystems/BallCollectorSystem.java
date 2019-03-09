package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Constants;

public class BallCollectorSystem extends Subsystem{

    private WPI_TalonSRX _armOneMotor = new WPI_TalonSRX(6);

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
    
    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(null);
    }

}