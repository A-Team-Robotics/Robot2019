package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class BallCollectorArm2 extends Subsystem {

    int currentPosition = 0;

    private WPI_TalonSRX _armTwoMotor = new WPI_TalonSRX(7);

    public void init(){
        //_armTwoMotor.setInverted(true);
        _armTwoMotor.setSensorPhase(false);
    }
    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(null);
    }

    public void log() {
        SmartDashboard.putNumber("Ball Collector Arm Two",_armTwoMotor.getSelectedSensorPosition());
    }

    public void setMotorTwo(double pos){
        _armTwoMotor.set(ControlMode.Position, pos);
    }

    public int getMotorTwoPos(){
        currentPosition = _armTwoMotor.getSelectedSensorPosition();
        return _armTwoMotor.getSelectedSensorPosition();
    }
}