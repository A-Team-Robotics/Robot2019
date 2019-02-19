/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class SlideSystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private final DigitalInput _slideForward = new DigitalInput(8);

    private final DigitalInput _slideReverse = new DigitalInput(9);

  private WPI_TalonSRX slideMotor = new WPI_TalonSRX(8);

  @Override
  public void initDefaultCommand() {
     setDefaultCommand(null);
  }

  public void stopMotor(){
    slideMotor.set(0);
  }

  public void moveFront(){
    slideMotor.set(0.5);
  }

  public void moveReverse(){
      slideMotor.set(-0.5);
  }

  public void setMotorSpeed(double speed){
    slideMotor.set(speed);
  }
  
  public void disablePID(){
    slideMotor.disable();
  }

  public boolean getReverseLimit(){
    return _slideReverse.get();
  }

  public boolean getForwardLimit(){
    return _slideForward.get();
  }
}
