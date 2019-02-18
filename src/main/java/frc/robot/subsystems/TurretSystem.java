/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.Constants;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class TurretSystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private WPI_TalonSRX _turretMotor = new WPI_TalonSRX(10);

  private DigitalInput _leftTurretSwitch = new DigitalInput(Constants.TURRET_LEFT_LIMIT);
  private DigitalInput _rightTurretSwitch = new DigitalInput(Constants.TURRET_RIGHT_LIMIT);
  
  @Override
  public void initDefaultCommand() {
     setDefaultCommand(null);
  }

  public void log() {
      SmartDashboard.putBoolean("Turret Left Limit", _leftTurretSwitch.get());
      SmartDashboard.putBoolean("Turret Right Limit", _rightTurretSwitch.get());
      SmartDashboard.putNumber("Turret Value", getPosition());
  }

  public void init() {
  }

  /**
 * Set the Speed of the Turret Motor
 *
 * <p>Will automaticly stop when a limit switch is hit.
 *
 * @param speed Set the speed of the motor. Value should be 1.0 to -1.0
 */
  public void setTurretMotor(double speed){
      _turretMotor.set(speed);
  }

  /**
 * Stop the Turret Motor
 */
  public void stopTurretMotor(){
      _turretMotor.disable();
  }

  /**
 * Get the status of the Left Turret Limit Switch
 * 
 * @return get the current state of the limit switch. boolean true or false 
 */
  public boolean getLeftLimitSwitch(){
    return _leftTurretSwitch.get();
  }

  /**
 * Get the status of the Right Turret Limit Switch
 *
 * @return get the current state of the limit switch. boolean true or false 
 */
  public boolean getRightLimitSwitch(){
      return _rightTurretSwitch.get();
  }

  /**
 * Get the current position from the encoder
 *
 * <p>
 *
 * @return The currect position of the turret as a double
 */
  public int getPosition(){
     return _turretMotor.getSelectedSensorPosition();
  }

  public void setTurretPos(int pos){
      _turretMotor.set(ControlMode.Position, pos);
  }
}
