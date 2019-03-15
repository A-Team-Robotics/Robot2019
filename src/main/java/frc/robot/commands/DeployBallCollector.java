package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.RobotMap;
import frc.robot.Constants;

public class DeployBallCollector extends CommandGroup{
    public DeployBallCollector(){
       addSequential(new WaitElevatorToPos(Constants.elevatorLiftToClearGrippersPos));
       addSequential(new WaitArm2ToPos(Constants.arm2CollectPos1));
       //addParallel(new StartArmRollers());
      // addSequential(new WaitArm1AndArm2ToPos(Constants.arm1collectPosFinal,Constants.arm2CollectPosfinal));  
      // addSequential(new WaitElevatorToPos(Constants.elevatorLoadcargo));
      // addSequential(new TurnOffElevatorMotor());
    }
}