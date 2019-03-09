package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class LoadBallCollector extends CommandGroup{
    public LoadBallCollector(){
       addParallel(new StopRollers());
       addParallel(new WaitElevatorLoadCargo());
       addSequential(new Arm1Retract(16000));
       addSequential(new Arm2Collect(180)); 
       addParallel(new RecieveCargo());
       addParallel(new RunRollers());
       Timer.delay(4);
       addSequential(new RetractBallCollector());
    }
}