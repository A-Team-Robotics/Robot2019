package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class RetractBallCollector extends CommandGroup{
    public RetractBallCollector(){
        addParallel(new ElevatorLevel2Hatch());
       addSequential(new WaitElevatorLevel2());
        Timer.delay(0.4);
        addSequential(new StopRollers());
        addParallel(new Arm1Retract(5));
        addParallel(new Arm2Retract(412));
        Timer.delay(0.4);
        addSequential(new ElevatorLoadCargo());
    }
}