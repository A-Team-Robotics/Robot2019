/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class GripperSystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private DoubleSolenoid uperGripper = new DoubleSolenoid(0, 1);
  private DoubleSolenoid lowerGipper = new DoubleSolenoid(7, 6);

  private WPI_TalonSRX gripperMotor = new WPI_TalonSRX(9);
  

  @Override
  public void initDefaultCommand() {
     setDefaultCommand(null);
  }

  public void stopMotor(){
    gripperMotor.set(0);
  }

  public void deployBall(){
    uperGripper.set(Value.kForward);
    lowerGipper.set(Value.kReverse);
    gripperMotor.set(0.5);
  }
  public void deployHatch(){
    uperGripper.set(Value.kForward);
    lowerGipper.set(Value.kReverse);
  }
  public void recieveCargo(){
    uperGripper.set(Value.kForward);
    lowerGipper.set(Value.kReverse);
    gripperMotor.set(-0.5);
  }
  public void recieveHatch(){
    uperGripper.set(Value.kForward);
    lowerGipper.set(Value.kReverse);
  }
  public void closeGripper(){
    uperGripper.set(Value.kReverse);
    lowerGipper.set(Value.kForward);
    gripperMotor.set(0);
  }
}
