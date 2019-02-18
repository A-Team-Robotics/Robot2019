/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.DeployCargo;
import frc.robot.commands.MoveSlideBack;
import frc.robot.commands.MoveSlideFront;
import frc.robot.commands.RecieveCargo;
import frc.robot.commands.StopSlide;
import frc.robot.commands.GripperClose;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  public static Joystick xboxController = new Joystick(0);
   Joystick joystickController = new Joystick(1);
   Button openGripper = new JoystickButton(joystickController, 1);
   Button closeGripper = new JoystickButton(joystickController, 2);
   Button recieveCargo = new JoystickButton(joystickController, 3);
   Button moveSlideForward = new JoystickButton(joystickController, 4);
   Button moveSlideReverse = new JoystickButton(joystickController, 5);

   public OI(){
      openGripper.whenPressed(new DeployCargo());
      closeGripper.whenPressed(new GripperClose());
     recieveCargo.whenPressed(new RecieveCargo());
     moveSlideForward.whileHeld(new MoveSlideFront());
     moveSlideReverse.whileHeld(new MoveSlideBack());
     moveSlideForward.whenReleased(new StopSlide());
     moveSlideForward.whenReleased(new StopSlide());


   }

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}
