package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

import frc.robot.Constants;

public class Climb extends CommandGroup{
    public Climb(){
       addSequential(new WaitElevatorToPos(Constants.elevatorLiftToClearGrippersPos));
       //Timer.delay(1);
       addParallel(new WaitArm2ToPos(250));
       //Timer.delay(4);
       addParallel(new WaitArm1ToPos(23438));
       addSequential(new WaitArm2ToPos(219));
       //Timer.delay(4);
       addSequential(new WaitElevatorToPos(Constants.elevatorLoadcargo));
       //Timer.delay(4);
       addParallel(new WaitArm1ToPos(29800));
       addParallel(new RunRollers());
    }
}