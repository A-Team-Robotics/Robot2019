/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.*;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class GripperSystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public static DoubleSolenoid lowerGripper = new DoubleSolenoid(1, 0);
  private DoubleSolenoid upperGripper = new DoubleSolenoid(6, 7);
  private DigitalInput buttonBallStop = new DigitalInput(3);
  private VictorSPX gripperMotor = new VictorSPX(9);
  

  @Override
  public void initDefaultCommand() {
     setDefaultCommand(null);
  }

  public boolean getButton(){
    return buttonBallStop.get();
  }

  public void stopMotor(){
    gripperMotor.set(ControlMode.Disabled, 0);
  }

  public void deployBall(){
    upperGripper.set(Value.kReverse);//Open Upper Gripper
    lowerGripper.set(Value.kReverse);//Open Lower Gripper
    gripperMotor.set(ControlMode.PercentOutput,Constants.gripperMotorDeployBallSpeed);
  }
  public void deployHatch(){
    lowerGripper.set(Value.kForward);
  }
  public void recieveCargo(){
    upperGripper.set(Value.kForward);
    lowerGripper.set(Value.kReverse);
    gripperMotor.set(ControlMode.PercentOutput,Constants.gripperMotorReciveBallSpeed*-1);
  }
  public void recieveHatch(){
    upperGripper.set(Value.kReverse);
    lowerGripper.set(Value.kReverse);
    gripperMotor.set(ControlMode.Disabled,0);
  }
  public void loadBall(){
    if(Robot.m_oi.joystickController.getTrigger()==false){
      lowerGripper.set(Value.kForward);//Close Lower Gripper
      upperGripper.set(Value.kReverse);//Close Upper Gripper
      gripperMotor.set(ControlMode.Disabled,0);
    }
  }
}
