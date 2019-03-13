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
import frc.robot.commands.*;
import frc.robot.commands.Climb;
import frc.robot.commands.CloseArmSpin;
import frc.robot.commands.DeployBall;
import frc.robot.commands.DeployBallCollector;
import frc.robot.commands.ElevatorLevel1Hatch;
import frc.robot.commands.ElevatorLevel2Hatch;
import frc.robot.commands.ElevatorLevel3Hatch;
import frc.robot.commands.MoveSlideBack;
import frc.robot.commands.MoveSlideFront;
import frc.robot.commands.ReadyGripper;
import frc.robot.commands.RecieveCargo;
import frc.robot.commands.RecieveHatch;
import frc.robot.commands.RetractBallCollector;


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
   public static Joystick joystickController = new Joystick(1);

   //Joystick Buttons
  Button releaseBall = new JoystickButton(joystickController, 1);
   Button readyGripper = new JoystickButton(joystickController, 2);
   Button recieveBall = new JoystickButton(joystickController, 3);
   Button recieveHatch = new JoystickButton(joystickController, 4);
   Button moveSlideForward = new JoystickButton(joystickController, 5);
   Button moveSlideReverse = new JoystickButton(joystickController, 6);
   Button elevatorLevel3Hatch = new JoystickButton(joystickController, 8);
   Button elevatorLevel2Hatch = new JoystickButton(joystickController, 10);
   Button elevatorLevel1Hatch = new JoystickButton(joystickController, 12);
   //Button elevaorLoadCargo = new JoystickButton(joystickController, 12);
   Button collectBalls = new JoystickButton(xboxController, 4);
   Button stopCollectingBalls = new JoystickButton(xboxController, 1);
   Button closeArm = new JoystickButton(joystickController, 9);

   //Xbox Buttons
   Button turretLeft = new JoystickButton(xboxController, 3);
   Button turretRight = new JoystickButton(xboxController, 2);
   Button climb2 = new JoystickButton(xboxController, 5);

   public OI(){
     releaseBall.whenPressed(new DeployBall());
     readyGripper.whenPressed(new ReadyGripper());
     recieveBall.whenPressed(new RecieveCargo());
     recieveHatch.whenPressed(new RecieveHatch());
     moveSlideForward.whenPressed(new MoveSlideFront());
     moveSlideReverse.whenPressed(new MoveSlideBack());
     elevatorLevel2Hatch.whenPressed(new ElevatorLevel2Hatch());
     elevatorLevel1Hatch.whenPressed(new ElevatorLevel1Hatch());
     elevatorLevel3Hatch.whenPressed(new ElevatorLevel3Hatch());
     collectBalls.whenPressed(new DeployBallCollector());
     stopCollectingBalls.whenPressed(new RetractBallCollector());
     closeArm.whenPressed(new CloseArmSpin());
     climb2.whenPressed(new Climb());
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
/*
 * XBOX BUTTON MAPPING FOR DRIVER STATION AS FOLLOWS
 * Button 1 = A
 * Button 2 = B
 * Button 3 = X OR small left wheel button up
 * Button 4 = Y
 * Button 5 = Left Bumper
 * Button 6 = Right Bumper OR small right wheel down
 * Button 7 = Select / Menu Button
 * Button 8 = Start / Enter Button
 * Button 9 = Click in Left Analog Stick OR small left wheel down
 * Button 10 = Click in Right Analog Stick
 * 
 * Axis 0 = Left stick left + right
 * Axis 1 = Left stick up + down
 * Axis 2 = Left trigger
 * Axis 3 = Right trigger
 * Axis 4 = Right stick left + right
 * Axis 5 = Right stick up + down
 * 
 * POV = D-Pad
 * POV LEFT = small right wheel up
 */