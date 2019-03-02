/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.DeployBall;
import frc.robot.commands.DeployBallCollector;
import frc.robot.commands.ElevatorLevel2Hatch;
import frc.robot.commands.ElevatorLevel3Hatch;
import frc.robot.commands.ElevatorLoadCargo;
import frc.robot.commands.MoveSlideBack;
import frc.robot.commands.MoveSlideFront;
import frc.robot.commands.RecieveCargo;
import frc.robot.commands.RecieveHatch;
import frc.robot.commands.RetractBallCollector;
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
   Button scoreBall = new JoystickButton(joystickController, 1);
   Button closeGripper = new JoystickButton(joystickController, 2);
   Button recieveBall = new JoystickButton(joystickController, 3);
   Button recieveHatch = new JoystickButton(xboxController, 1);
   Button moveSlideForward = new JoystickButton(joystickController, 4);
   Button moveSlideReverse = new JoystickButton(joystickController, 5);
   Button elevatorLevel3Hatch = new JoystickButton(joystickController, 8);
   Button elevatorLevel2Hatch = new JoystickButton(joystickController, 10);
   Button elevaorLoadCargo = new JoystickButton(joystickController, 12);
   Button collectBalls = new JoystickButton(joystickController, 6);
   Button stopCollectingBalls = new JoystickButton(joystickController, 7);

   public OI(){
     scoreBall.whenPressed(new DeployBall());
     closeGripper.whenPressed(new GripperClose());
     moveSlideForward.whenPressed(new MoveSlideFront());
     moveSlideReverse.whenPressed(new MoveSlideBack());
     elevatorLevel2Hatch.whenPressed(new ElevatorLevel2Hatch());
     elevaorLoadCargo.whenPressed(new ElevatorLoadCargo());
     elevatorLevel3Hatch.whenPressed(new ElevatorLevel3Hatch());
     collectBalls.whenPressed(new DeployBallCollector());
     stopCollectingBalls.whenPressed(new RetractBallCollector());
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
