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

public class ArmPneumatics extends Subsystem{

    private WPI_TalonSRX _rollerMotorLeft = new WPI_TalonSRX(11);
    private VictorSPX _rollerMotorRight = new VictorSPX(3);

    private DoubleSolenoid _armExtendor = new DoubleSolenoid(Constants.BALL_COLLECTOR_SOLENOID[0],Constants.BALL_COLLECTOR_SOLENOID[1]);

    private DigitalInput buttonStop = new DigitalInput(5);

    private static ArmPneumatics _armPneumaticsInstance = null;

    public ArmPneumatics(){
        super("Pneumatics");
    }

    public static ArmPneumatics getInstance(){
        if(_armPneumaticsInstance == null){
            _armPneumaticsInstance = new ArmPneumatics();
        }
        return _armPneumaticsInstance;
    }

    public boolean getBallStopButton(){
        return buttonStop.get();
    }
    
    public void log() {
        SmartDashboard.putBoolean("Button Stop Arm", getBallStopButton());
    }

    public void setRollersForward(){
        _rollerMotorLeft.set(Constants.ArmMotorSpeed);
        _rollerMotorRight.set(ControlMode.PercentOutput, Constants.ArmMotorSpeed*-1);
    }

    public void stopRollers(){
        _rollerMotorLeft.stopMotor();
        _rollerMotorRight.set(ControlMode.Disabled, 0);
    }

    public void setRollersReverse(){
        _rollerMotorLeft.set(Constants.ArmMotorSpeed*-1);
        _rollerMotorRight.set(ControlMode.PercentOutput, 0.4);;
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

    public void stopMotor(){
        _rollerMotorLeft.stopMotor();
    }
}