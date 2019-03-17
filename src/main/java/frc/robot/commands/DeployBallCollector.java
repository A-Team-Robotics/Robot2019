package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Constants;
import frc.robot.Robot;

public class DeployBallCollector extends CommandGroup{
    public DeployBallCollector(){
        Robot.continueLoad=false;
       addSequential(new WaitElevatorToPos(Constants.elevatorLiftToClearGrippersPos));
       addSequential(new SlideBack());
       addSequential(new WaitArm2ToBacks(Constants.arm2CollectPos1));
       addParallel(new StartArmRollers());
       addSequential(new WaitArm1AndArm2ToPos(Constants.arm1collectPosFinal,Constants.arm2CollectPosfinal));  
       addSequential(new WaitElevatorToPos(Constants.elevatorLoadcargo));
       addSequential(new TurnOffElevatorMotor());
    }
}