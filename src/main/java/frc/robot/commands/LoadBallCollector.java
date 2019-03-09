package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class LoadBallCollector extends CommandGroup{
    public LoadBallCollector(){
       addParallel(new StopRollers());
       addParallel(new ElevatorLoadCargo());
       addSequential(new Arm1Retract(18000));
       addParallel(new Arm2Collect(150)); 
    }
}