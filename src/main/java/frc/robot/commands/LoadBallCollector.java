package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.Constants;
import frc.robot.Robot;

public class LoadBallCollector extends CommandGroup{
    public LoadBallCollector(){
       addParallel(new StopArmRollers());
       addParallel(new RecieveCargo());
       addParallel(new WaitElevatorToPos(Constants.elevatorLoadcargo));
       addParallel(new SlideBack());
       addSequential(new WaitTurretToPos((Constants.turretTurnMaxPos + Constants.turretTurnMinPos)/2));
       addSequential(new WaitArm1AndArm2ToPos(Constants.arm1LoadPos,Constants.arm2LoadPos)); 
       //addSequential(new WaitTimer(0.2));      
       addParallel(new RunRollers());
       //addSequential(new WaitTimer(4.0));
       //addSequential(new RetractBallCollector());
    }
}